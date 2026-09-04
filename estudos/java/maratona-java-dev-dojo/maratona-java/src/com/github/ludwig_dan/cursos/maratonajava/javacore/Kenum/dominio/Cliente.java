package com.github.ludwig_dan.cursos.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    public enum TipoPagamento {
        CREDITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        },
        PIX;

        public double calcularDesconto(double valor){
            return valor * 0.2;
        }
    }

    private String nome;
    private TipoCliente tipo;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this(nome, tipo);
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente(String nome, TipoCliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo.getCODIGO() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
