package empresa.dados; // declara o package

// classes não podem ser protected ou private
public class Funcionario{
    // Encapsulamento: protege os dados da classe, controlando o acesso aos atributos por meio de métodos.
    // private define que não será acessível de fora da classe
    // protected só é acessível dentro da própria classe, dentro do mesmo pacote ou em uma subclasse 
    // default(sem nada) dentro da mesma classe ou em qualquer classe do mesmo pacote
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    // construtor => função chamada quando um objeto é instanciado 
    //// pode inicializar os atributos
    //// se não for declarado, tem um default
    //// exemplo => Funcionario() - inicializa sem nenhum valor nos atributos  
    public Funcionario(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;

        System.out.println("nome => "+this.nome);
        System.out.println("cargo => "+this.cargo);
        System.out.println("idade => "+this.idade);
    }

    public Funcionario() {

    }

    public String obterInfo(){
        return "Nome => "+this.nome+"; Cargo => "+this.cargo;
    }

    public void aumentarSalario(int salario){
        this.salario += salario;
    }
    
    // sobrecarga de métodos: um método com o mesmo nome de outra existente mas com parametros diferentes
    public void aumentarSalario(double percentual){
        this.salario += salario * percentual / 100.00;
    }

    // passagem por referência: passa um endereço de memória da instancia do objeto que está sendo alterado
    public void aumentarSalarioObj(Funcionario func, double salario){
        func.salario += salario;
    }
}