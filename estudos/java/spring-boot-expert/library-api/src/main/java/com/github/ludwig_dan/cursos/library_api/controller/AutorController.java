package com.github.ludwig_dan.cursos.library_api.controller;

import com.github.ludwig_dan.cursos.library_api.controller.dto.AutorDTO;
import com.github.ludwig_dan.cursos.library_api.controller.dto.ErroResposta;
import com.github.ludwig_dan.cursos.library_api.exceptions.RegistroDuplicadoException;
import com.github.ludwig_dan.cursos.library_api.model.Autor;
import com.github.ludwig_dan.cursos.library_api.service.AutorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
public class AutorController {
    private final AutorService service;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody @Valid AutorDTO autor){
        try {
            var autorEntidade = autor.mapearParaAutor();
            service.salvar(autorEntidade);
            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(autorEntidade.getId())
                    .toUri();

            return ResponseEntity.created(location).build();
        } catch (RegistroDuplicadoException e){
            var erroDTO = ErroResposta.conflito(e.getMessage());
            return ResponseEntity.status(erroDTO.status()).body(erroDTO);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<AutorDTO> obterDetalhes(@PathVariable String id){
        Optional<Autor> autor = service.obterDetalhes(UUID.fromString(id));
        if(autor.isPresent()){
            Autor entidade = autor.get();
            AutorDTO dto = new AutorDTO(entidade.getId(), entidade.getNome(), entidade.getDataNascimento(), entidade.getNacionalidade());
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.notFound().build();
        }
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
        List<AutorDTO> lista = resultado.stream().map(autor -> new AutorDTO(autor.getId(), autor.getNome(), autor.getDataNascimento(), autor.getNacionalidade())).collect(Collectors.toList());

        return ResponseEntity.ok(lista);
    }

    @PutMapping("{id}")
    public ResponseEntity<Object> atualizar(@PathVariable String id, @RequestBody @Valid AutorDTO autor){
        try {
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
        } catch (RegistroDuplicadoException e){
            var erroDto = ErroResposta.conflito(e.getMessage());
            return ResponseEntity.status(erroDto.status()).body(erroDto);
        }
    }
}
