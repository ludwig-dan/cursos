public class NotasEscola{
    public static void main(String[] args){
        int notaUm = 6;
        int notaDois = 8;
        int frequencia = 74;
        if((notaUm + notaDois) / 2 >= 6 && frequencia >= 75){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno não aprovado!");
        }
    }
}