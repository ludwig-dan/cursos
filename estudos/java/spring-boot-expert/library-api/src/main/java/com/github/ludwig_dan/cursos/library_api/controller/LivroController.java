package com.github.ludwig_dan.cursos.library_api.controller;

import com.github.ludwig_dan.cursos.library_api.controller.dto.CadastroLivroDTO;
import com.github.ludwig_dan.cursos.library_api.controller.dto.ErroResposta;
import com.github.ludwig_dan.cursos.library_api.exceptions.RegistroDuplicadoException;
import com.github.ludwig_dan.cursos.library_api.service.LivroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livros")
@RequiredArgsConstructor
public class LivroController {
    private final LivroService service;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody @Valid CadastroLivroDTO dto){
        try {
            //
            return null;
        } catch (RegistroDuplicadoException e){
            var erroDTO = ErroResposta.conflito(e.getMessage());
            return ResponseEntity.status(erroDTO.status()).body(erroDTO);
        }
    }
}
