package com.github.ludwig_dan.cursos.maratonajava.javacore.Oexcecoes.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            System.out.println(divisao(1,0));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    /*
        o throws na declaração do método avisa a quem está implementando que o método pode gerar essa exceção
        mas o compilador só obriga a tratar se for uma exceção do tipo checked
     */
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if( b == 0 ){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
