package com.github.ludwig_dan.cursos.maratonajava.introducao;

public class Aula08ArraysMulti02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[4];
        arrayInt[2] = new int[6];

        for(int[] array: arrayInt){
            for(int a: array){
                System.out.println(a);
            }
            System.out.println("----------");
        }
    }
}
