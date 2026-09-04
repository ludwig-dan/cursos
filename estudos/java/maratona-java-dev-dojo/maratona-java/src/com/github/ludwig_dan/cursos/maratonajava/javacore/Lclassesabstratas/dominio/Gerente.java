package com.github.ludwig_dan.cursos.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {

    }

    /*
        só a classe concreta precisa implementar o método abstrato
        se uma classe herda de uma abstrata e essa abstrata herda de outra abstrata:
            Pessoa(abstrata) -> Funcionario(abstrata) -> Gerente(concetra)
        só a classe concreta precisa implementar os métodos da classe Pessoa
        embora caso o Funcionario implemente, todos os seus filhos herdam a implementação
    */
    @Override
    public void imprime() {

    }
}
