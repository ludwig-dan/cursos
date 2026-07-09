import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class LambdaImpares{
    public static void main(String[] args){
        Set<Integer> listaDeNumeros = new HashSet<>(Arrays.asList(0,1,2,3,4,5));
        listaDeNumeros.removeIf(numero -> numero % 2 == 0);
        System.out.println(listaDeNumeros);
    }
}