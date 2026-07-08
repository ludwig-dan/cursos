class Animal{
    String nome;
    public void comer(){
        System.out.println("Animal come");
    }

    public void fazerSom(){
        System.out.println("som genérico");
    }

    Animal(String nome){
        this.nome = nome;
    }
}

class Cachorro extends Animal{
    String raca;
    public void latir(){
        System.out.println("Cachorro late");
    }

    public void fazerSom(){
        super.fazerSom();
        System.out.println("auau");
    }

    Cachorro(String nome, String raca){
        super(nome); // chama o construtor da super classe
        this.raca = raca;
    }
}

class Gato extends Animal{

    public void fazerSom(){
        System.out.println("miau");
    }

    Gato(String nome){
        super(nome);
    }
}

public class TestHeranca{
    public static void main(String[] args){
        Animal animal = new Animal("Animal Um");
        Cachorro cachorro = new Cachorro("Animal Dois", "Raça Dois");
        Gato gato = new Gato("Animal Três");
        cachorro.latir();
        cachorro.comer();

        animal.fazerSom();
        cachorro.fazerSom();
        gato.fazerSom();

        System.out.println("Cachorro => "+cachorro.nome+" raça => "+cachorro.raca);
    }
}