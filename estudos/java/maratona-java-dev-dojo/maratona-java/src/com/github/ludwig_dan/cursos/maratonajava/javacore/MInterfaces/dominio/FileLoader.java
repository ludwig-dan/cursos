package com.github.ludwig_dan.cursos.maratonajava.javacore.MInterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    public void load(){
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }
}
