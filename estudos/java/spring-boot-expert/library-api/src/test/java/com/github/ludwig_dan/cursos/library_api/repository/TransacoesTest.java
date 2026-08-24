package com.github.ludwig_dan.cursos.library_api.repository;

import com.github.ludwig_dan.cursos.library_api.service.TransacaoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransacoesTest {
    @Autowired
    TransacaoService transacaoService;

    @Test
    void transacaoSimples(){
        transacaoService.executar();
    }
}
