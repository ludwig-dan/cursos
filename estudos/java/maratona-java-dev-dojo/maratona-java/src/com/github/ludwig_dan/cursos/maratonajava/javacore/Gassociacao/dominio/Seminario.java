package com.github.ludwig_dan.cursos.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void imprimir(){
        System.out.println("Alunos participando do seminário "+this.titulo);
        if(this.alunos == null) return;
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
    }
}
