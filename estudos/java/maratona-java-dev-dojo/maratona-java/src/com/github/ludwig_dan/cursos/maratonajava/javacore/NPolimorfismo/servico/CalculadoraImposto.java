package com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.servico;

import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Produto;
import com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Imposto do produto "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate)produto;
            System.out.println("Validade: "+tomate.getDataValidade());
        }
    }
}
