package com.github.ludwig_dan.cursos.maratonajava.javacore.Oexcecoes.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException("ERRO AO ESCREVER NO ARQUIVO");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo");
        }
    }
}
