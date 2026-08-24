package com.github.ludwig_dan.cursos.library_api.repository;

import com.github.ludwig_dan.cursos.library_api.model.Autor;
import com.github.ludwig_dan.cursos.library_api.model.GeneroLivro;
import com.github.ludwig_dan.cursos.library_api.model.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class LivroRepositoryTest {

    @Autowired
    LivroRepository repository;

    @Autowired
    AutorRepository autorRepository;

    @Test
    void salvarTest(){
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.CIENCIA);
        livro.setTitulo("UFO");
        livro.setDataPublicacao(LocalDate.of(1980,1,2));
        Autor autor = autorRepository.findById(UUID.fromString("4c8629d4-3407-4215-9d22-c36c46d312f0")).orElse(null);
        livro.setAutor(autor);
        repository.save(livro);
    }

    @Test
    void SalvarCascadeTest(){
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.CIENCIA);
        livro.setTitulo("UFO");
        livro.setDataPublicacao(LocalDate.of(1980,1,2));

        Autor autor = new Autor();
        autor.setNome("MARIA");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1950,1,31));

        livro.setAutor(autor);
        repository.save(livro);
    }

    @Test
    void atualizarTest(){
        UUID id = UUID.fromString("ad31e3f5-8aab-4298-b8bd-bba20a2378f8");
        var livro = repository.findById(id).orElse(null);

        UUID idAutor = UUID.fromString("3b475f64-97d4-41d9-98ff-a352169bce9e");
        var novoAutor = autorRepository.findById(idAutor).orElse(null);

        livro.setAutor(novoAutor);
        repository.save(livro);

    }

    @Test
    void buscarLivroTest(){
        UUID id = UUID.fromString("96c7b051-4daf-45fc-9603-14ff5790468c");
        Livro livro = repository.findById(id).orElse(null);
        System.out.println("Livro:");
        System.out.println(livro.getTitulo());
        System.out.println("Autor:");
        System.out.println(livro.getAutor().getNome());
    }

    @Test
    void salvarAutorComLivrosTest(){
        Autor autor = new Autor();
        autor.setNome("Antonio");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(2000,1,18));

        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(204));
        livro.setGenero(GeneroLivro.MISTERIO);
        livro.setTitulo("O roubo da casa assombrada");
        livro.setDataPublicacao(LocalDate.of(1999,1,2));
        livro.setAutor(autor);

        autor.setLivros(new ArrayList<>());
        autor.getLivros().add(livro);

        autorRepository.save(autor);
    }

    @Test
    @Transactional // necessário usar quando o fetch do relacionamento é lazy para abrir uma transação
    void listarLivrosAutorTranscTest(){
        var id = UUID.fromString("98535cb7-e4cc-413a-804f-22854f7f32a4");
        var autor = autorRepository.findById(id).get();
        autor.getLivros().forEach(System.out::println);
    }

    @Test
    void listarLivrosAutorTest(){
        var id = UUID.fromString("98535cb7-e4cc-413a-804f-22854f7f32a4");
        var autor = autorRepository.findById(id).get();
        List<Livro> listaLivros = repository.findByAutor(autor);
        listaLivros.forEach(System.out::println);
    }

    @Test
    void pesquisaPorTituloTest(){
        List<Livro> livros = repository.findByTitulo("UFO");
        livros.forEach(System.out::println);
    }

    @Test
    void pesquisaPorTituloAndPreco(){
        List<Livro> livros = repository.findByTituloAndPreco("UFO", BigDecimal.valueOf(100.00));
        livros.forEach(System.out::println);
    }

    @Test
    void listarTodosTest(){
        var resultado = repository.listarTodos();
        resultado.forEach(System.out::println);
    }

    @Test
    void listarAutoresTest(){
        var resultado = repository.listarAutores();
        resultado.forEach(System.out::println);
    }

    @Test
    void listarGenerosAutoresBrasileirosTest(){
        var resultado = repository.listarGenerosAutoresBrasileiros();
        resultado.forEach(System.out::println);
    }

    @Test
    void findByGeneroTest(){
        var resultado = repository.findByGenero(GeneroLivro.CIENCIA);
        resultado.forEach(System.out::println);
    }

    @Test
    void deletePorGeneroTest(){
        repository.deleteByGenero(GeneroLivro.CIENCIA);
    }

    @Test
    void updateDataPublicacaoTest(){
        repository.updateDataPublicacao(LocalDate.of(2000,1,1));
    }
}