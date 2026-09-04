package com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.repositorio.Repositorio;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio banco = new RepositorioBancoDeDados();
        banco.salvar();

        List<String> lista = new ArrayList<>();
        lista.add("goku");
        lista.add("vegeta");
        System.out.println(lista);

    }
}
