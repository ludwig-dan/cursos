package com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int n1 = 1;
        int n2 = 2;
        calculadora.altera(n1,n2);
        // variáveis do tipo primitivo passam uma cópia da variável para o método
        // o valor da variável não é alterado
        System.out.println("Fora do método");
        System.out.println(n1);
        System.out.println(n2);
    }
}
