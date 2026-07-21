import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriadorTabela {
    public static void main(String[] args){
        try (
            Connection conexao = ConexaoDB.conectar();
            Statement statement = conexao.createStatement()
        ) {
            String comandoSql = "CREATE TABLE produto(" +
                "id INTEGER PRIMARY KEY, "+
                "nome TEXT NOT NULL, "+
                "quantidade INTEGER NOT NULL, "+
                "preco REAL, "+
                "status TEXT )";

            System.out.println(comandoSql);
            statement.execute(comandoSql);

            System.out.println("Tabela criada com sucesso");
        } catch (SQLException e){
            System.err.println("Erro ao criar tabela: "+e.getMessage());
            e.printStackTrace();
        }
    }
}