package com.github.ludwig_dan.cursos.library_api.repository;

import com.github.ludwig_dan.cursos.library_api.model.Autor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AutorRepositoryTests {
    @Autowired
    AutorRepository repository;

    @Test
    public void salvarTest(){
        Autor autor = new Autor();
        autor.setNome("José");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1950,1,31));

        var autorSalvo = repository.save(autor);
        System.out.println("Autor salvo: "+autorSalvo);
    }

    @Test
    public void atualizarTest(){
        var id = UUID.fromString("51e69f41-a6df-44f5-b8a6-b75b0f2612a8");
        Optional<Autor> possivelAutor = repository.findById(id);
        if(possivelAutor.isPresent()){
            Autor autorEncontrado = possivelAutor.get();
            System.out.println(autorEncontrado);
            autorEncontrado.setDataNascimento(LocalDate.of(1960,1,18));
            repository.save(autorEncontrado);
        }
    }

    @Test
    public void listarTest(){
        List<Autor> lista  = repository.findAll();
        lista.forEach(System.out::println);
    }
}
