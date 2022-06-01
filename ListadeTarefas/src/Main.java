import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tarefa t = new Tarefa();
        System.out.println("Informe o nome da Tarefa: ");
        t.setNome(in.nextLine());
        System.out.println("Informe a descrição da tarefa: ");
        t.setDescricao(in.nextLine());

        System.out.println(t.getUuid());
        System.out.println(t.getNome());
        System.out.println(t.getDescricao() );
    }
}
