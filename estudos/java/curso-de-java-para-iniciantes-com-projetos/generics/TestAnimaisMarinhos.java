class Cesto<T>{
    private T conteudo;
    public void guardar(T conteudo){
        this.conteudo = conteudo;
    }

    public T pegar(){
        return this.conteudo;
    }
}

class Peixe{
    String  nome;
    double tamanho;

    public Peixe(String nome, double tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }
}

class Polvo{
    String nome;
    int tentaculos;

    public Polvo(String nome, int tentaculos){
        this.nome = nome;
        this.tentaculos = tentaculos;
    }
}

public class TestAnimaisMarinhos{
    public static void main(String[] args){
        Cesto<Peixe> cestoDePeixe = new Cesto<>();
        cestoDePeixe.guardar(new Peixe("nome do peixe", 0.23));

        Cesto<Polvo> cestoDePolvo = new Cesto<>();
        cestoDePolvo.guardar(new Polvo("nome do polvo", 6));

        System.out.println(cestoDePeixe.pegar().nome);
        System.out.println(cestoDePeixe.pegar().tamanho);
        System.out.println(cestoDePolvo.pegar().nome);
        System.out.println(cestoDePolvo.pegar().tentaculos);
    } 
}