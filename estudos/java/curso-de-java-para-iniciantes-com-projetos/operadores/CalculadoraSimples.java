public class CalculadoraSimples {
    public static void main(String[] args){
        int a = 10;
        int b = 2;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int restoDaDivisao = a % b;

        System.out.println("a soma é "+ soma);
        System.out.println("a subtracao é "+ subtracao);
        System.out.println("a multiplicacao é "+ multiplicacao);
        System.out.println("a divisao é "+ divisao);
        System.out.println("o restoDaDivisao é "+ restoDaDivisao);

        int numero = 5;
        numero += 3;
        System.out.println("numero += 3 é "+ numero);

        numero -= 2;
        System.out.println("numero -= 2 é "+ numero);

        numero *= 4;
        System.out.println("numero *= 4 é "+ numero);

        numero /= 2;
        System.out.println("numero /= 2 é "+ numero);

        int contador = 5;
        contador += 1;
        contador -= 1;
        System.out.println("contador é "+ contador);
    }
}