package com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(-1);
        pessoa.setIdade(70);
        pessoa.imprime();
        System.out.println(pessoa.getNome());
    }
}
