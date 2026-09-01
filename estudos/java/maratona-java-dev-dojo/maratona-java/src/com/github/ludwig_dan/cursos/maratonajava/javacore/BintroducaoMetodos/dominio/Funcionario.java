package com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public float[] salarios;

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
        float media = soma / this.salarios.length;
        System.out.println(media);
    }
}
