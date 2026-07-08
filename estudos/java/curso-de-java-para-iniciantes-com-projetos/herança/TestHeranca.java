// classes abstratas servem para definir funções que serão comuns entre outras classes
// porém, não pode existir sozinha
// uma classe abstrata não pode ser instanciada
abstract class Animal{
    double peso; // todo animal tem peso
    public void comer(){ // todo animal come
        System.out.println("Animal comendo");
    }

    abstract void respirar(); // todo animal respira
    // a classe abstrata pode declarar métodos abstratos apenas para obrigar que as subclasses implementem o método

    // pode ou não ter um construtor que será acessado através da palavra super na subclasse
    Animal(double peso){
        this.peso = peso;
    }
}// mas "Animal" depende de mais coisas para existir

class Cachorro extends Animal{
    String raca;

    public void respirar(){
        System.out.println("Cachorro respirando");
    }

    public void fazerSom(){
        System.out.println("auau");
    }

    Cachorro(double peso, String raca){
        super(peso); // chama o construtor da super classe
        this.raca = raca;
        System.out.println("O cachorro da raça "+this.raca+" pesa "+this.peso+"kg");
        super.comer();
    }
}

class Gato extends Animal{
    public void respirar(){
        System.out.println("Gato respirando");
    }

    public void fazerSom(){
        System.out.println("miau");
    }

    Gato(double peso){
        super(peso);
        System.out.println("O gato pesa "+this.peso+"kg");
    }
}

public class TestHeranca{
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro(5.0, "Vira lata");
        cachorro.respirar();
        cachorro.fazerSom();

        Gato gato = new Gato(4.6);
        gato.respirar();
        gato.fazerSom();
    }
}