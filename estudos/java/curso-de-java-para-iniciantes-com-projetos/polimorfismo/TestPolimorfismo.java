// Interface que define um contrato de pagamento.
// Qualquer classe que implementar essa interface
// será obrigada a criar o método pagar().
interface Pagamento {
    void pagar();
}

// Implementação específica do contrato Pagamento.
class Pix implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento via PIX");
    }
}

// Outra implementação do mesmo contrato.
class Cartao implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento via Cartão");
    }
}

public class TestPolimorfismo {

    /*
     * POLIMORFISMO:
     * O método recebe um objeto do tipo Pagamento.
     *
     * Isso significa que ele pode trabalhar com QUALQUER
     * classe que implemente a interface Pagamento.
     *
     * O método não precisa saber se recebeu um Pix,
     * um Cartao ou qualquer outro tipo de pagamento.
     *
     * Essa flexibilidade é o principal objetivo do
     * polimorfismo: escrever código genérico que funciona
     * para vários objetos diferentes.
     */
    public static void processar(Pagamento pagamento) {
        pagamento.pagar();
    }

    public static void main(String[] args) {

        /*
         * Aqui ocorre o polimorfismo.
         *
         * O método processar() recebe objetos de tipos
         * diferentes (Pix e Cartao), mas trata ambos
         * como Pagamento.
         */

        processar(new Pix());
        processar(new Cartao());

        /*
         * Saída:
         *
         * Pagamento via PIX
         * Pagamento via Cartão
         */
    }
}