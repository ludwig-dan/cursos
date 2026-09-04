package com.github.ludwig_dan.cursos.maratonajava.javacore.Oexcecoes.error;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
