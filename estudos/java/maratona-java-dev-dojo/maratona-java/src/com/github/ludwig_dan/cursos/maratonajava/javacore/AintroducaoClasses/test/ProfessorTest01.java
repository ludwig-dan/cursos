package com.github.ludwig_dan.cursos.maratonajava.javacore.AintroducaoClasses.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
