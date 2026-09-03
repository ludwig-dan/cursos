package com.github.ludwig_dan.cursos.maratonajava.javacore.Hheranca.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Hheranca.dominio.Endereco;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Hheranca.dominio.Funcionario;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("João da Silva");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        System.out.println("----------------------");

        Funcionario funcionario = new Funcionario("Pedro Almeida");
        funcionario.setCpf("22222222");
        funcionario.setSalario(20000);
        funcionario.setEndereco(endereco);
        funcionario.imprimir();
    }
}
