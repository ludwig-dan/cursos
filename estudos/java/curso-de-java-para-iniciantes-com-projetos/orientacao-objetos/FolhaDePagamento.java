import empresa.dados.Funcionario;

public class FolhaDePagamento{
    public static void main(String[] args){
        Funcionario func = new Funcionario("Nome", "Cargo", 22);
        System.out.println(func.obterInfo());

        Funcionario funcDois = new Funcionario();
        funcDois.setNome("Funcionario Dois");
        funcDois.setCargo("Funcionario Dois");
        funcDois.setIdade(25);

        System.out.println("Dados do funcionário dois:\n" +
            "Nome => "+funcDois.getNome()
        );

    }
}