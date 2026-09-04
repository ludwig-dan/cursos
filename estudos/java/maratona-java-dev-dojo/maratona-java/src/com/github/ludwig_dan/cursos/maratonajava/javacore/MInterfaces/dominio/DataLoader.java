package com.github.ludwig_dan.cursos.maratonajava.javacore.MInterfaces.dominio;

public interface DataLoader {
    // por padrão todos os atributos de uma interface são public static final
    public static final int MAX_DATA_SIZE = 10;
    public void load();


    // também é possível implementar métodos estáticos em uma interface
    static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize na interface DataLoader");
    }
}