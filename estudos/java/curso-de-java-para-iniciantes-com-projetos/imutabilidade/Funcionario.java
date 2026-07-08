import java.time.LocalDate;

/**
 * Enum representa um conjunto fixo de constantes.
 * É útil quando um atributo pode possuir apenas alguns valores pré-definidos.
 */
enum StatusFuncionario {
    ATIVO,
    FERIAS,
    AFASTADO,
    DESLIGADO
}

/**
 * A palavra-chave final na classe impede que ela seja herdada.
 * Isso ajuda a preservar a imutabilidade, pois nenhuma subclasse
 * poderá alterar o comportamento da classe.
 */
public final class Funcionario {

    /**
     * Todos os atributos são privados (encapsulamento).
     * A palavra-chave final garante que o valor será atribuído
     * apenas uma vez durante a construção do objeto.
     */
    private final Long id;
    private final String nome;
    private final LocalDate dataContratacao;
    private final StatusFuncionario status;

    /**
     * Construtor responsável por inicializar todos os atributos.
     * Como os atributos são final, eles devem ser inicializados aqui.
     */
    public Funcionario(Long id,
                       String nome,
                       LocalDate dataContratacao,
                       StatusFuncionario status) {

        this.id = id;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.status = status;
    }

    /**
     * Métodos getters apenas retornam valores.
     * Não existem setters, pois objetos imutáveis
     * não podem ter seu estado alterado após a criação.
     */
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public StatusFuncionario getStatus() {
        return status;
    }

    /**
     * Em vez de alterar o status do objeto atual,
     * criamos e retornamos um NOVO objeto com o novo status.
     *
     * Este é um dos princípios da imutabilidade.
     */
    public Funcionario alterarStatus(StatusFuncionario novoStatus) {
        return new Funcionario(
                this.id,
                this.nome,
                this.dataContratacao,
                novoStatus
        );
    }

    /**
     * Método de negócio que apenas consulta informações.
     * Não altera o estado interno do objeto.
     */
    public boolean estaAtivo() {
        return this.status == StatusFuncionario.ATIVO;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", status=" + status +
                '}';
    }

    public static void main(String[] args) {

        // Criação do objeto imutável
        Funcionario funcionario = new Funcionario(
                1L,
                "João Silva",
                LocalDate.of(2020, 5, 10),
                StatusFuncionario.ATIVO
        );

        System.out.println("Objeto original:");
        System.out.println(funcionario);

        // Não altera o objeto original
        Funcionario funcionarioFerias =
                funcionario.alterarStatus(StatusFuncionario.FERIAS);

        System.out.println("\nObjeto original permanece igual:");
        System.out.println(funcionario);

        System.out.println("\nNovo objeto com status alterado:");
        System.out.println(funcionarioFerias);
    }
}