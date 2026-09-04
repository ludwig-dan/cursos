package com.github.ludwig_dan.cursos.maratonajava.javacore.Kenum.test;

import com.github.ludwig_dan.cursos.maratonajava.javacore.Kenum.dominio.Cliente;
import com.github.ludwig_dan.cursos.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);

        Cliente juridico = new Cliente("Sicredi", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.PIX);
        System.out.println(juridico);

        System.out.println(Cliente.TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tc = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tc);
    }
}
