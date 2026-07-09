public class DivisaoPorZero{
    static int totalNotas = 1;
    static int quantidadeAlunos = 0;

    public static int calcularMedia() throws ArithmeticException{
        return totalNotas / quantidadeAlunos;
    }

    public static void main(String[] args){

        try{
            int media = totalNotas / quantidadeAlunos;
            System.out.println(media);
        } catch(ArithmeticException e){
            System.out.println("problema divisão por zero");
        }

        System.out.println(calcularMedia());
    }
}