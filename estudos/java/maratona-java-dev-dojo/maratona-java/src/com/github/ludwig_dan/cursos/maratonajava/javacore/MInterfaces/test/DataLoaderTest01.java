package com.github.ludwig_dan.cursos.maratonajava.javacore.MInterfaces.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.MInterfaces.dominio.DataBaseLoader;
import com.github.ludwig_dan.cursos.maratonajava.javacore.MInterfaces.dominio.DataLoader;
import com.github.ludwig_dan.cursos.maratonajava.javacore.MInterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        /*
            não é possível sobrescrever um método estático de uma interface
            mas uma classe pode ter um método com o mesmo nome de um método estático da interface que ele implementa
         */
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
