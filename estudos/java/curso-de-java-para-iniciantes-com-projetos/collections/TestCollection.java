import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;   

public class TestCollection{
    public static void main(String[] args){
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Java"); // retorna false, não permite elementos duplicados
        conjunto.add("Python");
        conjunto.add("C++");

        System.out.println(conjunto);
        System.out.println(conjunto.contains("Java"));

        conjunto.add("JavaScript");
        conjunto.add("Ruby");
        conjunto.remove("Python");

        System.out.println(conjunto);

        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");

        System.out.println(lista);
        System.out.println(lista.contains("Java"));
        
        List<String> outraLista = Arrays.asList("JavaScript", "Ruby", "Java");
        lista.addAll(outraLista);
        lista.remove("Python");
        System.out.println(lista);

        System.out.println(lista.get(1));
        lista.clear();
        System.out.println();

        Map<String, Integer> mapa = new HashMap();
        mapa.put("Java", 20);
        mapa.put("Python", 10);
        mapa.put("C++", 15);

        System.out.println(mapa.containsKey("Java"));
        System.out.println(mapa.get("Java"));

        mapa.put("Java", 19);
        System.out.println(mapa);

        System.out.println(mapa);
        mapa.remove("Python");
        System.out.println(mapa);
    }
}