package com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Danrlei");
        funcionario.setIdade(31);
        funcionario.setSalarios(new float[]{5000.00f, 5500.00f, 8000f});
        funcionario.imprimir();
        funcionario.mediaSalarial();
    }
}
