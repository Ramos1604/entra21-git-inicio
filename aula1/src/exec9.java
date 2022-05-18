import java.util.Scanner;

public class exec9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.contains(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + " faz parte de " + algumaCoisa);
        } else if (algumaOutraCoisa.contains(algumaCoisa)) {
            System.out.println(algumaCoisa + "faz parte de" + algumaOutraCoisa);
        } else {
            System.out.println("Nenhuma string faz parte da outra");
        }
    }
}
