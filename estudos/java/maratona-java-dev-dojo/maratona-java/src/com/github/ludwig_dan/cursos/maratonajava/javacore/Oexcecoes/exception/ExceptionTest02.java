package com.github.ludwig_dan.cursos.maratonajava.javacore.Oexcecoes.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
        try {
            File file = new File("arquivo\\teste.txt");
            // gera uma exceção que precisa ser tratada
            file.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
            throw e; // repassa o erro
        }
    }
}
