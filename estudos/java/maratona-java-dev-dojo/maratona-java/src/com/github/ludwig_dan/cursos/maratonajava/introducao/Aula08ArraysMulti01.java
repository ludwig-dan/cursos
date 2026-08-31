package com.github.ludwig_dan.cursos.maratonajava.introducao;

public class Aula08ArraysMulti01 {
    public static void main(String[] args) {
        int[][] dias = new int[2][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;
        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------");
        for (int[] dia: dias){
            for (int d: dia){
                System.out.println(d);
            }
        }
    }
}
