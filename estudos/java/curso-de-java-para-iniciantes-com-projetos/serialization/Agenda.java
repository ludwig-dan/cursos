import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


class Contato implements Serializable {
    public String nome;
    public String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
}

public class Agenda{
    public static void serializarContatos(List<Contato> listaContatos) throws IOException{
        // try com recursos
        // chama o close automáticamente ao final do bloco try no recurso outputStream
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))){
            outputStream.writeObject(listaContatos);
        }
    }

    public static void desSerializarContatos() throws IOException, ClassNotFoundException{
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))){
            List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
            for (Contato contato: contatosLidos) {
                System.out.println("Nome: "+contato.nome+ ", Telefone: "+contato.telefone);
            }
        }
    }

    public static void main(String[] args){
        Contato contato1 = new Contato("Arnaldo", "(54) 9 96542132");
        Contato contato2 = new Contato("João", "(54) 9 99875423");
        Contato contato3 = new Contato("Maria", "(54) 9 91542365");

        List<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);

        try {
            serializarContatos(listaContatos);
            desSerializarContatos();
        } catch(IOException | ClassNotFoundException e){
            System.out.println("Erro ao manipular contatos: "+e.getMessage());
        }
    }
}