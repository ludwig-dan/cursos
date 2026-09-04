package com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Computador;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Produto;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Televisao;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Tomate;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 15000);

        Tomate tomate = new Tomate("Samsung 50", 5000);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
