package com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé");
        Time time = new Time("Santos");
        j1.setTime(time);
        j1.imprimir();
    }
}
