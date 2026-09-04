package com.github.ludwig_dan.cursos.maratonajava.javacore.MInterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    public void load(){
        System.out.println("Carregando dados de um banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public void checkPermission(){
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize dentro da classe DataBaseLoader");
    }
}
