package com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Computador;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Produto;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Televisao;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Tomate;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 15000);
        Produto televisao = new Televisao("Samsung 50", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
