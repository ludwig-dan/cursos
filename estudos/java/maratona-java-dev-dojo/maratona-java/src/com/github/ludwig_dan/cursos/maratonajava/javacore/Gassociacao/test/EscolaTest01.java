package com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Jiraya", "NinJutsu");
        Professor p2 = new Professor("Kakashi", "GenJutsu");
        Escola escola = new Escola("Konoha");
        escola.setProfessores(new Professor[]{p1,p2});
        escola.imprime();

    }
}
