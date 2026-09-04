package com.github.ludwig_dan.cursos.maratonajava.javacore.MInterfaces.dominio;

public interface DataRemover {
    public abstract void remove();
    /*
         default cria um método concreto em uma interface
         todos os métodos de uma interface são abstratos caso não tenha o modificador default
         sendo um método concentro, quem implementa a interface não é obrigado a implementar ele
     */
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
