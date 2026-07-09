@FunctionalInterface
interface Calculadora{
    double calcular(double a, double b);
}

public class InterfaceFuncional{
    public static void main(String[] args){
        // se a interface tem apenas um método
        // a expressão lambda entende que está implementando aquele método
        Calculadora soma = (a,b) -> a + b;
        System.out.println(soma.calcular(2,2));
    }
}