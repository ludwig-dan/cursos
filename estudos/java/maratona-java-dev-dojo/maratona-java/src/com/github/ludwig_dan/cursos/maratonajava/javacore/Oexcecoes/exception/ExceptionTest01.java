package com.github.ludwig_dan.cursos.maratonajava.javacore.Oexcecoes.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        try {
            File file = new File("arquivo\\teste.txt");
            // gera uma exceção que precisa ser tratada
            file.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
