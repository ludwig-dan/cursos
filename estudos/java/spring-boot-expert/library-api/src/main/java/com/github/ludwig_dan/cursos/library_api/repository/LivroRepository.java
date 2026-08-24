package com.github.ludwig_dan.cursos.library_api.repository;

import com.github.ludwig_dan.cursos.library_api.model.Autor;
import com.github.ludwig_dan.cursos.library_api.model.GeneroLivro;
import com.github.ludwig_dan.cursos.library_api.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
    // Query Method
    List<Livro> findByAutor(Autor autor);
    List<Livro> findByTitulo(String titulo);
    List<Livro> findByTituloAndPreco(String titulo, BigDecimal preco);
    boolean existsByAutor(Autor autor);
    // JPQL -> referência as entidades e as props dela
    @Query("select l from Livro as l order by l.titulo, l.preco")
    List<Livro> listarTodos();

    @Query("select a from Livro l join l.autor a")
    List<Autor> listarAutores();

    @Query("""
        select l.genero
        from Livro l 
        join l.autor a 
        where a.nacionalidade = 'Brasileira'
        order by l.genero        
    """)
    List<String> listarGenerosAutoresBrasileiros();

    // named parameters
    @Query("select l from Livro l where l.genero = :genero")
    List<Livro> findByGenero(@Param("genero") GeneroLivro generoLivro);

    // named parameters
    @Query("select l from Livro l where l.genero = ?1")
    List<Livro> findByGeneroPositionalParam(GeneroLivro generoLivro);

    @Modifying
    @Transactional
    @Query("delete from Livro l where l.genero = ?1")
    void deleteByGenero(GeneroLivro genero);


    @Modifying
    @Transactional
    @Query("update Livro set dataPublicacao = ?1")
    void updateDataPublicacao(LocalDate novaData);
}
