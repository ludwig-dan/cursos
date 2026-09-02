package com.github.ludwig_dan.cursos.maratonajava.javacore.Csobrecargametodos.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("TV", 15, "Akudama Drive");
        anime.imprime();
    }
}
