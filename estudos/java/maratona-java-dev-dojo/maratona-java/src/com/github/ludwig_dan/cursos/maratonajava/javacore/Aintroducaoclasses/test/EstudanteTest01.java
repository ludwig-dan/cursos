package com.github.ludwig_dan.cursos.maratonajava.javacore.Aintroducaoclasses.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // variável de referencia do tipo Estudante atribuida a um objeto do tipo Estudante
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 40;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
