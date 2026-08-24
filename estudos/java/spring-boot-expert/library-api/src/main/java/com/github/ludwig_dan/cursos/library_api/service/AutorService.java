package com.github.ludwig_dan.cursos.library_api.service;

import com.github.ludwig_dan.cursos.library_api.exceptions.OperacaoNaoPermitidaException;
import com.github.ludwig_dan.cursos.library_api.model.Autor;
import com.github.ludwig_dan.cursos.library_api.repository.AutorRepository;
import com.github.ludwig_dan.cursos.library_api.repository.LivroRepository;
import com.github.ludwig_dan.cursos.library_api.validator.AutorValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class AutorService {

    private final AutorRepository repository;
    private final AutorValidator validator;
    private final LivroRepository livroRepository;
    /* RequiredArgsConstructor cria o construtor com os atributos final
    public AutorService(AutorRepository repository, AutorValidator validator, LivroRepository livroRepository){
        this.repository = repository;
        this.livroRepository = livroRepository;
        this.validator = validator;
    }
    */

    public Autor salvar(Autor autor){
        validator.validar(autor);
        return repository.save(autor);
    }

    public void atualizar(Autor autor){
        if(autor.getId() == null){
            throw new IllegalArgumentException("id obrigatório");
        }
        validator.validar(autor);
        repository.save(autor);
    }

    public Optional<Autor> obterDetalhes(UUID id){
        return repository.findById(id);
    }

    public void deletar(Autor autor){
        if(possuiLivros(autor)){
            throw new OperacaoNaoPermitidaException("Autor possui livros cadastrados");
        }
        repository.delete(autor);
    }

    public List<Autor> pesquisa(String nome, String nacionalidade){
        if(nome != null && nacionalidade != null){
            return repository.findByNomeAndNacionalidade(nome, nacionalidade);
        } else if(nome != null){
            return repository.findByNome(nome);
        } else if(nacionalidade != null) {
            return repository.findByNacionalidade(nacionalidade);
        } else {
            return repository.findAll();
        }
    }

    public boolean possuiLivros(Autor autor){
        return livroRepository.existsByAutor(autor);
    }

    public List<Autor> pesquisaByExample(String nome, String nacionalidade){
        var autor = new Autor();
        autor.setNome(nome);
        autor.setNacionalidade(nacionalidade);
        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues().withIgnoreCase().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Autor> autorExample =  Example.of(autor, matcher);

        return repository.findAll(autorExample);
    }
}
