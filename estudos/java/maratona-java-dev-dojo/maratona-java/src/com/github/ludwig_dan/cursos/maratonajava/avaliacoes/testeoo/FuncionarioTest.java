package com.github.ludwig_dan.cursos.maratonajava.avaliacoes.testeoo;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Funcionario desenvolvedor = new Desenvolvedor();

        gerente.setNome("Goku");
        gerente.setSalario(10000);

        desenvolvedor.setNome("Kuririn");
        desenvolvedor.setSalario(7000);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        for(Funcionario f: funcionarios){
            System.out.println("O funcionario "+f.getNome()+" recebeu um bonus de "+f.calcularBonus());
        }

    }
}
