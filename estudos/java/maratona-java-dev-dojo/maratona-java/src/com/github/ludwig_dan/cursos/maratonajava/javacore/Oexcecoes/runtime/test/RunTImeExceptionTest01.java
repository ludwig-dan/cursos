package com.github.ludwig_dan.cursos.maratonajava.javacore.Oexcecoes.runtime.test;

public class RunTImeExceptionTest01 {
    public static void main(String[] args) {
        /*
            Exceções do tipo Unchecked
            não "precisam" ser tratadas
            Acontecem durante a execução do código
         */
        Object nullpointer = null;
        System.out.println(nullpointer.toString());

        int[] arrayOutOfBound = {1,2};
        System.out.println(arrayOutOfBound[2]);
    }
}
