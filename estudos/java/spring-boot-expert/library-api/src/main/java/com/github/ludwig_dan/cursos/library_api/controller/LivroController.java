package com.github.ludwig_dan.cursos.library_api.controller;

import com.github.ludwig_dan.cursos.library_api.controller.dto.CadastroLivroDTO;
import com.github.ludwig_dan.cursos.library_api.controller.dto.ErroResposta;
import com.github.ludwig_dan.cursos.library_api.controller.dto.ResultadoPesquisaLivroDTO;
import com.github.ludwig_dan.cursos.library_api.controller.mappers.LivroMapper;
import com.github.ludwig_dan.cursos.library_api.exceptions.RegistroDuplicadoException;
import com.github.ludwig_dan.cursos.library_api.model.Livro;
import com.github.ludwig_dan.cursos.library_api.service.LivroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("livros")
@RequiredArgsConstructor
public class LivroController implements GenericController{
    private final LivroService service;
    private final LivroMapper mapper;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody @Valid CadastroLivroDTO dto){
        try {
            Livro livro = mapper.toEntity(dto);
            service.salvar(livro);
            URI location = gerarHeaderLocation(livro.getId());
            return ResponseEntity.created(location).build();
        } catch (RegistroDuplicadoException e){
            var erroDTO = ErroResposta.conflito(e.getMessage());
            return ResponseEntity.status(erroDTO.status()).body(erroDTO);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<ResultadoPesquisaLivroDTO> obterDetalhes(@PathVariable String id){
        return service.obterPorId(UUID.fromString(id))
                .map(livro -> {
                    var dto = mapper.toDto(livro);
                    return ResponseEntity.ok(dto);
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deletar(@PathVariable String id){
        return service.obterPorId(UUID.fromString(id))
                .map(livro -> {
                    service.deletar(livro);
                    return ResponseEntity.noContent().build();
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
