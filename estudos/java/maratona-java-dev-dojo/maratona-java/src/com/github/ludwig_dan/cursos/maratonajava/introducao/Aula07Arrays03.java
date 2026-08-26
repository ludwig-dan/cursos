package com.github.ludwig_dan.cursos.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5}; // inicializar direto com valores
        //int[] numeros = new int[]{1,2,3,4,5}; // outra forma
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        // foreach para arrays
        for(int n: numeros){
            System.out.println("foreach => "+n);
        }
    }
}
