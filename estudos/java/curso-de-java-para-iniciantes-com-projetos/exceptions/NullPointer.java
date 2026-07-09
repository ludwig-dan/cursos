public class NullPointer{
    public static void main(String[] args){
        String nome = null;

        try{
            int tamanhoNome = nome.length();
        } catch(NullPointerException _){
            System.out.println("Variável está nula");
        }
    }
}