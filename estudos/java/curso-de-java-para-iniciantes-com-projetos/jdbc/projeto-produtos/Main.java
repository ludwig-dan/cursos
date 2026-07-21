import java.sql.Connection;
import java.util.List;

public class Main {

    private static void mostrarProdutos(ProdutoDAO produtoDao){
        List<Produto> todosProdutos = produtoDao.consultarTodos();
        if(todosProdutos.isEmpty()){
            System.out.println("Nenhum produto encontrado.");
        } else {
            System.out.println("Lista de produtos:");
            for(Produto p : todosProdutos){
                System.out.println(p.getId()+" "+p.getNome()+" "+p.getPreco()+" "+p.getQuantidade()+" "+p.getStatus());
            }
        }
        System.out.println("");
    }

    public static void main(String[] args){
        try (Connection conexao = ConexaoDB.conectar()){
            ProdutoDAO produtoDao = new ProdutoDAO(conexao);
            mostrarProdutos(produtoDao);

            Produto novoProdutoUm = new Produto("Notebook", 50, 5000.45, "Em Estoque");
            Produto novoProdutoDois = new Produto("Smartphone", 10, 4019.45, "Estoque baixo");
            produtoDao.inserir(novoProdutoUm);
            produtoDao.inserir(novoProdutoDois);
            mostrarProdutos(produtoDao);
            
            Produto produtoConsultado = produtoDao.consultarPorId(2);
            if(produtoConsultado != null){
                System.out.println("Produto consultado: ");
                System.out.println(produtoConsultado.getId()+" "+produtoConsultado.getNome()+" "+produtoConsultado.getPreco()+" "+produtoConsultado.getQuantidade()+" "+produtoConsultado.getStatus());
            } else {
                System.out.println("Produto não encontrado");
            }
            System.out.println("");

            produtoConsultado.setQuantidade(100);
            produtoConsultado.setStatus("Em Estoque");
            produtoDao.atualizar(produtoConsultado);
            mostrarProdutos(produtoDao);

            produtoDao.deletar(produtoConsultado.getId());
            mostrarProdutos(produtoDao);

            produtoDao.deletarTodos();
        } catch (Exception e){
            System.err.println("Erro geral: "+e.getMessage());
        }
    }
}