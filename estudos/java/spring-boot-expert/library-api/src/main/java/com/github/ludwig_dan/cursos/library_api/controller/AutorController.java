package com.github.ludwig_dan.cursos.library_api.controller;

import com.github.ludwig_dan.cursos.library_api.controller.dto.AutorDTO;
import com.github.ludwig_dan.cursos.library_api.controller.dto.ErroResposta;
import com.github.ludwig_dan.cursos.library_api.controller.dto.ResultadoPesquisaLivroDTO;
import com.github.ludwig_dan.cursos.library_api.controller.mappers.AutorMapper;
import com.github.ludwig_dan.cursos.library_api.exceptions.RegistroDuplicadoException;
import com.github.ludwig_dan.cursos.library_api.model.Autor;
import com.github.ludwig_dan.cursos.library_api.service.AutorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/autores")
@RequiredArgsConstructor
public class AutorController implements GenericController {
    private final AutorService service;
    private final AutorMapper mapper;

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody @Valid AutorDTO dto){
        var autor = mapper.toEntity(dto);
        service.salvar(autor);
        URI location = gerarHeaderLocation(autor.getId());

        return ResponseEntity.created(location).build();
    }

    @GetMapping("{id}")
    public ResponseEntity<AutorDTO> obterDetalhes(@PathVariable String id){
        return service
                .obterDetalhes(UUID.fromString(id))
                .map(autor -> {
                    AutorDTO dto = mapper.toDTO(autor);
                            return ResponseEntity.ok(dto);
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id){
        var uid = UUID.fromString(id);
        Optional<Autor> autor = service.obterDetalhes(uid);
        if(autor.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else{
            service.deletar(autor.get());
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<AutorDTO>> pesquisar(
            @RequestParam(value = "nome", required = false) String nome,
            @RequestParam(value = "nacionalidade", required = false) String nacionalidade
    ){
        List<Autor> resultado =  service.pesquisaByExample(nome, nacionalidade);
        List<AutorDTO> lista = resultado.stream().map(mapper::toDTO).collect(Collectors.toList());

        return ResponseEntity.ok(lista);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> atualizar(@PathVariable String id, @RequestBody @Valid AutorDTO autor){
        var uid = UUID.fromString(id);
        Optional<Autor> autorDetalhes = service.obterDetalhes(uid);
        if (autorDetalhes.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        var autorSalvar = autorDetalhes.get();
        autorSalvar.setNome(autor.nome());
        autorSalvar.setNacionalidade(autor.nacionalidade());
        autorSalvar.setDataNascimento(autor.dataNascimento());

        service.atualizar(autorSalvar);

        return ResponseEntity.noContent().build();
    }
}
