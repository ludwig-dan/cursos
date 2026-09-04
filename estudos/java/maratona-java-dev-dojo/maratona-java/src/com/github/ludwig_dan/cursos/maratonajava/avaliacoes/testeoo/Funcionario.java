package com.github.ludwig_dan.cursos.maratonajava.avaliacoes.testeoo;

public abstract class Funcionario {
    String nome;
    double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    abstract double calcularBonus();
}
