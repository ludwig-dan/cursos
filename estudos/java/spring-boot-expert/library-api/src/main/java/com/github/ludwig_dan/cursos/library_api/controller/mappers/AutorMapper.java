package com.github.ludwig_dan.cursos.library_api.controller.mappers;

import com.github.ludwig_dan.cursos.library_api.controller.dto.AutorDTO;
import com.github.ludwig_dan.cursos.library_api.model.Autor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AutorMapper {
    Autor toEntity(AutorDTO dto);
    AutorDTO toDTO(Autor autor);
}
