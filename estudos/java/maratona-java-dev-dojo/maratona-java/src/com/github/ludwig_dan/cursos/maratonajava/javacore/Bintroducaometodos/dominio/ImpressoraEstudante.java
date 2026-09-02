package com.github.ludwig_dan.cursos.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        estudante.nome = "Gohan"; // ao alterar um parametro do tipo referencia, o objeto original é afetado
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("--------------");
    }
}
