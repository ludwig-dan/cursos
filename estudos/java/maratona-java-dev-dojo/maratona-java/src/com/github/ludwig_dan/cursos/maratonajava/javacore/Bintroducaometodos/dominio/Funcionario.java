package com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private float[] salarios;
    private float media;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float[] getSalarios() {
        return salarios;
    }

    public void setSalarios(float[] salarios) {
        this.salarios = salarios;
    }

    public void imprimir(){
        System.out.println("Nome => "+this.nome+", Idade => "+this.idade);
        System.out.println("Salários => ");
        for(float salario : this.salarios){
            System.out.println("R$ "+salario);
        }
    }

    public void mediaSalarial(){
        if(salarios == null){
            return;
        }
        float soma = 0;
        for(float salario: this.salarios){
            soma += salario;
        }
        this.media = soma / this.salarios.length;
        System.out.println(media);
    }
}
