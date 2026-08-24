package com.github.ludwig_dan.cursos.library_api.validator;

import com.github.ludwig_dan.cursos.library_api.exceptions.RegistroDuplicadoException;
import com.github.ludwig_dan.cursos.library_api.model.Autor;
import com.github.ludwig_dan.cursos.library_api.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AutorValidator {
    private AutorRepository repository;

    public AutorValidator(AutorRepository repository) {
        this.repository = repository;
    }

    public void validar(Autor autor){
        if(existeAutorCadastrado(autor)){
            throw new RegistroDuplicadoException("Autor já cadastrado");
        }
    }

    private boolean existeAutorCadastrado(Autor autor){
        Optional<Autor> autorEncontrado = repository.findByNomeAndDataNascimentoAndNacionalidade(autor.getNome(), autor.getDataNascimento(), autor.getNacionalidade());
        if(autor.getId() == null){
            return autorEncontrado.isPresent();
        }

        return autorEncontrado.isPresent() && !autor.getId().equals(autorEncontrado.get().getId());
    }
}
