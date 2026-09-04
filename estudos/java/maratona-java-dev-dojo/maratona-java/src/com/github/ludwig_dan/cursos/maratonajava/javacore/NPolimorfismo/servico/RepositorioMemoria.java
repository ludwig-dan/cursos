package com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.servico;

import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
