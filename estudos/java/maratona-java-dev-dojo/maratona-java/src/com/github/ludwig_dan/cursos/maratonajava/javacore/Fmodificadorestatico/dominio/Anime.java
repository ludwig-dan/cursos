package com.github.ludwig_dan.cursos.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5};

    // bloco de inicialização de classe
    static {
        System.out.println("roda somente uma vez quando a classe é carregada pela JVM");
    }

    public Anime(){
        System.out.println(episodios);
    }
}
