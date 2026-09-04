package com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Computador;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Tomate;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Italiano", 10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
