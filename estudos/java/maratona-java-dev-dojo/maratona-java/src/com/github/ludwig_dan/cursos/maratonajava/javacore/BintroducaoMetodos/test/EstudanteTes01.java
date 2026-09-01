package com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;
import com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTes01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        // variáveis de referencia passam uma referencia do objeto em memória para o método
        // diferente dos tipos primitivos, que passam uma cópia do valor
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
