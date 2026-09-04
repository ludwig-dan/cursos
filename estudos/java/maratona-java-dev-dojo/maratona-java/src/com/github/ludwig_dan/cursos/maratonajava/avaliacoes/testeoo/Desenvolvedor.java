package com.github.ludwig_dan.cursos.maratonajava.avaliacoes.testeoo;

public class Desenvolvedor extends Funcionario{
    @Override
    double calcularBonus() {
        return this.salario * 0.1;
    }
}
