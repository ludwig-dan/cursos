package com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {2,3,7};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6);
    }
}
