public class ArrayIndexOutOfBounds{
    public static void main(String[] args){
        try{
            int[] numeros = {1,2,3};
            System.out.println(numeros[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index do array não encontrado. \n"+e.getMessage());
        } finally{
            System.out.println("fim da execução");
        }
    }
}