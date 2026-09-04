package com.github.ludwig_dan.cursos.maratonajava.javacore.Lclassesabstratas.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 10000);
        System.out.println(gerente);
    }
}
