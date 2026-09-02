package com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    /*
        atributos private só podem ser acessados pelo objeto
        usado para trazer acoplamento para a classe(o quanto uma classe "sabe" sobre a outra)
        assim você impede outras classes de atribuirem valores para os atributos diretamente e pode fazer validações através de métodos
     */
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("idade inválida");
            return;
        }
        this.idade = idade;
    }
}
