package com.github.ludwig_dan.cursos.maratonajava.javacore.Jmodificadorfinal.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat");
        Carro carro2 = new Carro("Fiat");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Teste");
        System.out.println(carro.COMPRADOR);

        System.out.println("---------------------");

        System.out.println(carro2.COMPRADOR);
    }
}
