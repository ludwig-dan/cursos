import java.io.*;

public class ExemploIO{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("meuArquivo.txt");
            writer.write("Olá mundo!");
            writer.close();

            FileReader reader = new FileReader("meuArquivo.txt");
            int data = reader.read();
            // -1 = fim do arquivo
            while(data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
        } catch(IOException e){
            System.out.println("problema ao ler arquivo => "+e.getMessage());
        }
    }
}