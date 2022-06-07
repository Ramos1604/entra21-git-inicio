import classes.Tarefa;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    public static Tarefa criarTarefa(){
        Tarefa t = new Tarefa();
        System.out.print("Informe o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.print("Informe a descrição da tarefa: ");
        t.setDescricao(in.nextLine());
        return t;
    }
}

