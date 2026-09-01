package com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        float[] salarios = {5000.00f, 5500.00f, 8000f};
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Danrlei";
        funcionario.idade = 31;
        funcionario.salarios = salarios;
        funcionario.imprimir();
        funcionario.mediaSalarial();
    }
}
