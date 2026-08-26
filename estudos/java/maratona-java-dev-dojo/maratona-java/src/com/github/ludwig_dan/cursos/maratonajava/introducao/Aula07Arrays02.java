package com.github.ludwig_dan.cursos.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
      // tamanho do array não pode ser montado dinamicamente
      String[] nomes = new String[4];
      nomes[0] = "Goku";
      nomes[1] = "Kurosaki";
      nomes[2] = "Luffy";
      for (int i = 0; i < nomes.length; i++){
          System.out.println(nomes[i]);
      }
    }
}
