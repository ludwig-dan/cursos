package com.github.ludwig_dan.cursos.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    /*
        Construtores:
        ** chamados na criação do objeto
        ** se declarar nenhum na classe, o java cria um vazio
        ** se declarar, o vazio não é criado automaticamente
     */
    public Anime(String tipo, int episodios, String nome){
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
    }

    public Anime(String tipo, int episodios, String nome, String genero){
        // this(..) chama o construtor dentro da própria classe
        this(tipo, episodios, nome);
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
    }
}
