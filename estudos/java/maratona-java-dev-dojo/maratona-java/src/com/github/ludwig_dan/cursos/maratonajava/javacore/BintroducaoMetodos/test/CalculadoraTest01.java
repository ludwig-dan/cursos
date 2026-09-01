package com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(12, 87));

        calculadora.divisao(2,0);
    }
}
