package com.github.ludwig_dan.cursos.maratonajava.javacore.Dconstrutores.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("TV", 15, "Akudama Drive");
        anime.imprime();
    }
}
