class Animal{
    public void comer(){
        System.out.println("Animal come");
    }

    public void fazerSom(){
        System.out.println("som genérico");
    }
}

class Cachorro extends Animal{
    public void latir(){
        System.out.println("Cachorro late");
    }

    public void fazerSom(){
        super.fazerSom();
        System.out.println("auau");
    }
}

class Gato extends Animal{

    public void fazerSom(){
        System.out.println("miau");
    }
}

public class TestHeranca{
    public static void main(String[] args){
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.latir();
        cachorro.comer();

        animal.fazerSom();
        cachorro.fazerSom();
        gato.fazerSom();
    }
}