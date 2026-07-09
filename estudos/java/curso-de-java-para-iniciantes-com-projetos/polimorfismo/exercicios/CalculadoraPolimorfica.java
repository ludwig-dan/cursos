abstract class Operacao{
    abstract void calcular(double valorUm, double valorDois);
}

class Soma extends Operacao{
    public void calcular(double valorUm, double valorDois){
        System.out.println(valorUm + valorDois);
    }
}

class Subtracao extends Operacao{
    public void calcular(double valorUm, double valorDois){
        System.out.println(valorUm - valorDois);
    }
}

class Multiplicacao extends Operacao{
    public void calcular(double valorUm, double valorDois){
        System.out.println(valorUm * valorDois);
    }
}

class Divisao extends Operacao{
    public void calcular(double valorUm, double valorDois){
        System.out.println(valorUm / valorDois);
    }
}

public class CalculadoraPolimorfica{
    public static void main(String[] args){
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        soma.calcular(1,1);
        subtracao.calcular(1,1);
        multiplicacao.calcular(1,1);
        divisao.calcular(3,6);
    }
}