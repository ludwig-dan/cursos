package com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Cafu");
        Time time = new Time("Brasil");
        j1.setTime(time);
        time.setJogadores(new Jogador[]{j1});

        j1.imprimir();
        time.imprimir();
    }
}
