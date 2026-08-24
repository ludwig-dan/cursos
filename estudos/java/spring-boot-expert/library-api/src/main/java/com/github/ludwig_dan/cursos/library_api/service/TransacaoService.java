package com.github.ludwig_dan.cursos.library_api.service;

import com.github.ludwig_dan.cursos.library_api.model.Autor;
import com.github.ludwig_dan.cursos.library_api.model.GeneroLivro;
import com.github.ludwig_dan.cursos.library_api.model.Livro;
import com.github.ludwig_dan.cursos.library_api.repository.AutorRepository;
import com.github.ludwig_dan.cursos.library_api.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class TransacaoService {

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private LivroRepository livroRepository;

    @Transactional
    public void atualizacaoSemAtualizar(){
        var livro = livroRepository.findById(UUID.fromString("3d232d86-6da4-4a16-86c8-ef610fac518d")).orElse(null);
        livro.setDataPublicacao(LocalDate.of(2024,1,23));
        livroRepository.save(livro);
    }

    @Transactional
    public void executar(){
        Autor autor = new Autor();
        autor.setNome("José");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1950,1,31));
        autorRepository.save(autor);

        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.CIENCIA);
        livro.setTitulo("UFO");
        livro.setDataPublicacao(LocalDate.of(1980,1,2));
        livro.setAutor(autor);
        livroRepository.save(livro);

        if(autor.getNome().equals("José")){
            throw new RuntimeException("Rollback");
        }
    }
}
