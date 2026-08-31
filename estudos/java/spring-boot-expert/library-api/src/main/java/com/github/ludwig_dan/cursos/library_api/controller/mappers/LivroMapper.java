package com.github.ludwig_dan.cursos.library_api.controller.mappers;

import com.github.ludwig_dan.cursos.library_api.controller.dto.CadastroLivroDTO;
import com.github.ludwig_dan.cursos.library_api.controller.dto.ResultadoPesquisaLivroDTO;
import com.github.ludwig_dan.cursos.library_api.model.Livro;
import com.github.ludwig_dan.cursos.library_api.repository.AutorRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = AutorMapper.class)
public abstract class LivroMapper {

    @Autowired
    AutorRepository autorRepository;

    @Mapping(target = "autor", expression = "java(autorRepository.findById(dto.idAutor()).orElse(null))")
    public abstract Livro toEntity(CadastroLivroDTO dto);

    public abstract ResultadoPesquisaLivroDTO toDto(Livro livro);
}
