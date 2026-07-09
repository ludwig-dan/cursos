import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TestLambda{
    public static void main(String[] args){
        List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4);
        // sem lambda
        for(Integer elemento: listaDeNumeros){
            System.out.println(elemento);
        }

        // com lambda
        listaDeNumeros.forEach((Integer numero) -> System.out.println(numero));

        List<Integer> numerosPares = new ArrayList();
        listaDeNumeros.forEach(numero -> { // só um parametro, não precisa de ()
            if(numero % 2 == 0){
                numerosPares.add(numero);
            }
        });
        System.out.println(numerosPares);
    }
}