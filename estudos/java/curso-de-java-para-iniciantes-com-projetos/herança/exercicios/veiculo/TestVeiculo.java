class Veiculo{
    public void acelerar(){
        System.out.println("veículo acelerando...");
    }
}

class Carro extends Veiculo{
    public void acelerar(){
        super.acelerar();
        System.out.println("carro acelerando...");
    }
}


public class TestVeiculo{
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.acelerar();
    }
}
