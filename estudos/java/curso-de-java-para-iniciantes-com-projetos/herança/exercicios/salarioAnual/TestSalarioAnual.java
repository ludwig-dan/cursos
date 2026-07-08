class Funcionario{
    private String nome;
    private double salario;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void addAumento(double valor){
        this.salario += valor;
    }

    public double ganhoAnual(){
        return this.salario * 12;
    }
}

class Assistente extends Funcionario{
    public double ganhoAnual(){
        return super.ganhoAnual() + 1000;
    }
}

public class TestSalarioAnual{
    public static void main(String[] args){
        Assistente assistente = new Assistente();
        assistente.setNome("João");
        assistente.setSalario(3000);
        assistente.addAumento(500);
        System.out.println(assistente.ganhoAnual());
    }
}