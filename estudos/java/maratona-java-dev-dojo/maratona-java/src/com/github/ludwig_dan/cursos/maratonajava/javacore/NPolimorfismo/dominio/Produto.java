package com.github.ludwig_dan.cursos.maratonajava.javacore.NPolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
