package com.github.ludwig_dan.cursos.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // modificador static diz que não pertence a instância e sim a classe
    private static double velocidadeLimite = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        /*
             um método static pode ser chamado sem uma instância da classe ter sido criada
             por isso, dentro de métodos estáticos não se pode usar o this
             this refere a instância do objeto
         */
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void imprime(){
        System.out.println("------");
        System.out.println("Nome => "+this.nome);
        System.out.println("Máxima => "+this.velocidadeMaxima);
        System.out.println("Limite => "+Carro.velocidadeLimite);
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
