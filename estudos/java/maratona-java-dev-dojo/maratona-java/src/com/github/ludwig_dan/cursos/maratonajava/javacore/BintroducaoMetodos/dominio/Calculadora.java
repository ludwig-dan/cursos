package com.github.ludwig_dan.cursos.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Calculadora {

    public int soma(int n1, int n2){
       return n1 + n2;
    }

    public void divisao(double n1, double n2){
        if(n2 == 0){
            System.out.println("Não existe divisão por zero!");
            return; // encerra a execução do método
        }
        System.out.println(n1/n2);
    }

    public void altera(int n1, int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do método");
        System.out.println(n1);
        System.out.println(n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    // varargs => muda apenas a sintaxe
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
