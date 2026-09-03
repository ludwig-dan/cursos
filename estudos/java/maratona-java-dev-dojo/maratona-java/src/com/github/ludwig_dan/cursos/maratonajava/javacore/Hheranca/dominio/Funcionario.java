package com.github.ludwig_dan.cursos.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome){
        super(nome); // chama o construtor da classe herdada
        System.out.println("Dentro do construtor de funcionario");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    /* sobresceve o método da classe herdada*/
    public void imprimir(){
        super.imprimir(); // chama o método da classe herdada
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" declaro ter recebido o salário de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
