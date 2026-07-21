import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ProdutoDAO {
    private final Connection CONEXAO_DB;

    public ProdutoDAO(Connection conexao){
        this.CONEXAO_DB = conexao;
    }

    public void inserir(Produto produto){
        String sql = "INSERT INTO produto(nome, quantidade, preco, status) VALUES (?,?,?,?)";
        try(
            PreparedStatement statement = CONEXAO_DB.prepareStatement(sql)
        ) {
            statement.setString(1, produto.getNome());
            statement.setInt(2, produto.getQuantidade());
            statement.setDouble(3, produto.getPreco());
            statement.setString(4, produto.getStatus());
            statement.executeUpdate();
        } catch (SQLException e){
            System.err.println("Erro ao inserir produto: "+e.getMessage());
        }
    }

    public void deletarTodos(){
        String sql = "delete from produto";
        try (
            PreparedStatement statement = CONEXAO_DB.prepareStatement(sql)){
            statement.executeUpdate();
        } catch (SQLException e){
            System.err.println("Erro ao excluir produtos: "+e.getMessage());
        }
    }

    public Produto consultarPorId(int id){
        String sql = "SELECT * FROM produto where id = ?";
        try (
            PreparedStatement statement = CONEXAO_DB.prepareStatement(sql);
        ){
            statement.setInt(1, id);
           try (ResultSet rs = statement.executeQuery()) {
                if(rs.next()){
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setPreco(rs.getDouble("preco"));
                    produto.setStatus(rs.getString("status"));

                    return produto;
                }
            }
        } catch (SQLException e){
            System.err.println("Erro ao buscar produto: "+e.getMessage());
        }
        return null;
    }

    public void atualizar (Produto produto){
        String sql = "UPDATE produto SET "+
            "nome = ?, "+
            "quantidade = ?, "+
            "preco = ?, "+
            "status = ? "+
            "WHERE id = ?";
        try (
            PreparedStatement statement = CONEXAO_DB.prepareStatement(sql)
        ){
            statement.setString(1,produto.getNome());
            statement.setInt(2,produto.getQuantidade());
            statement.setDouble(3,produto.getPreco());
            statement.setString(4,produto.getStatus());
            statement.setInt(5,produto.getId());
            statement.executeUpdate();
        } catch (SQLException e){
            System.err.println("Erro ao atualizar produto");
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM produto WHERE id = ?";
        try(
            PreparedStatement statement = CONEXAO_DB.prepareStatement(sql)
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();           
        } catch (SQLException e){
            System.err.println("Erro ao excluir produto: "+e.getMessage());
        }
    }

    public List<Produto> consultarTodos(){
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        try(
            PreparedStatement statement = CONEXAO_DB.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
        ) {
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setStatus(rs.getString("status"));
                produtos.add(produto);
            }

            return produtos;
        } catch (SQLException e){
            System.err.println("Erro ao consultar produtos: "+e.getMessage());
        }

        return produtos;
    }
}