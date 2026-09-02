package com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Aluno;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Local;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Professor;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Konoha");
        Seminario seminario1 = new Seminario("Seminário dos ninjas", local);
        Seminario seminario2 = new Seminario("Prova Chunin", local);
        Professor professor = new Professor("Jiraya", "Jutsu");
        Aluno aluno1 = new Aluno("Naruto", 15);
        Aluno aluno2 = new Aluno("Sasuke", 15);
        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);

        aluno1.imprimir();
        aluno2.imprimir();

        seminario1.setAlunos(new Aluno[]{aluno1, aluno2});
        seminario1.imprimir();
        seminario2.imprimir();

        professor.setSeminarios(new Seminario[]{seminario1, seminario2});
        professor.imprimir();
    }
}
