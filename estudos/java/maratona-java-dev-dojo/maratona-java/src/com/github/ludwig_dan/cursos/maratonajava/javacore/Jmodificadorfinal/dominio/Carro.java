package com.github.ludwig_dan.cursos.maratonajava.javacore.Jmodificadorfinal.dominio;
/*
    modificador final em classes diz que ela não pode ser extendida
    usado quando não quero que o compartamento da classe seja sobrescrita
    para métodos, o modificador final diz que o método não pode ser sobrescrito
*/
public final class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    /*
        Variável final do tipo referencia
        a referencia para o objeto não pode ser alterada
        mas os atributos do objeto podem
     */
    public final Comprador COMPRADOR = new Comprador("Berna");

    public Carro(String nome) {
        this.nome = nome;
    }
}
