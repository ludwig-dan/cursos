public class Produto {

    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    private String status;

    public Produto(String nome, int quantidade, double preco, String status) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.status = status;
    }

    public Produto() {

    }

    // Getter e Setter de id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter de nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter de quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Getter e Setter de preco
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter e Setter de status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}