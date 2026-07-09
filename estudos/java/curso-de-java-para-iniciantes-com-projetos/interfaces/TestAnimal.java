interface SerVivo{
    // Todo atributo declarado em uma interface é automaticamente:
    // public static final
    // Isso significa que ele pertence à interface (static),
    // pode ser acessado de qualquer lugar (public)
    // e não pode ser alterado (final).
    String REINO = "Organismos Vivos";

    void respirar();

    // método default
    // não precisam ser sobescritos 
    default void nascer(){
        System.out.println("Nascendo...");
    }

    // método static
    // pertence a interface e não a instância de uma classe que implementa a interface
    static void reproduzir(){
        System.out.println("Reproduzindo");
    }
}

// uma interface pode extender outra
interface Animal extends SerVivo{
    // todas a variáveis dentro de uma interface são public static e final
    String nome = "Jorge";
    void fazerSom();
}

class Cachorro implements Animal{
    public void respirar(){
        System.out.println("Respirando....");
    }
    public void fazerSom(){
        System.out.println(SerVivo.REINO + " | " +Animal.nome+" => auau");
    }
}

public class TestAnimal{
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        cachorro.nascer();
        cachorro.respirar();
        cachorro.fazerSom();
        SerVivo.reproduzir();
    }
}