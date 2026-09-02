package com.github.ludwig_dan.cursos.maratonajava.javacore.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5};

    // bloco de inicialização de instância
    {
        System.out.println("roda sempre que uma instância da classe é criada");
    }

    public Anime(){
        System.out.println(episodios);
    }
}
