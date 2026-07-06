class SalaDeAula{
    static int totalAlunos;

    public static void addAluno(){
        totalAlunos += 1;
    }

    public static int getTotalAlunos(){
        return totalAlunos;
    }
}


public class TesteSalaDeAula {

    public static void main(String[] args) {

        // métodos estáticos podem ser chamados sem instanciar um objeto
        // o método pertence à classe e não a uma instância da classe
        SalaDeAula.addAluno();
        SalaDeAula.addAluno();
        SalaDeAula.addAluno();

        System.out.println(SalaDeAula.getTotalAlunos());
    }
}
