package com.github.ludwig_dan.cursos.maratonajava.javacore.Lclassesabstratas.dominio;
/*
    Define que Funcionario é uma classe abstrata
    não é possível instanciar um objeto da classe Funcionario
    Funcionario não pode existir sozinho, ele precisa ser criado a partir de uma classe mais especializada(Gerente)

    uma classe abstrata só existe para se estendida
 */
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    // obriga todos as subclasses a implementarem o método calculaBonus
    // só pode existir dentro de classes abstratas
    public abstract void calculaBonus();
}
