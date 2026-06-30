public class Main {
    public static void main(String[] args){
        int farinha = 2;
        System.out.println("A receita requer "+ farinha + " xícaras de farinha");


        byte idade = 25;
        short ano = 2024;
        int populacaoCidade = 500000;
        // Sem sufixo, números inteiros são do tipo int por padrão.
        // Como 7800000000 ultrapassa o limite do int, usamos 'L' para indicar que é um long.
        long populacaoMundial = 7800000000L;
        // Números decimais são do tipo double por padrão.
        // Para armazenar em um float, precisamos usar 'f' para indicar explicitamente o tipo.
        float altura = 1.75f;
        double salario = 4500.50;
        boolean estudante = true;
        char inicialNome = 'A';

        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População da cidade: " + populacaoCidade);
        System.out.println("População mundial: " + populacaoMundial);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);
        System.out.println("É estudante: " + estudante);
        System.out.println("Inicial do nome: " + inicialNome);
    }
}