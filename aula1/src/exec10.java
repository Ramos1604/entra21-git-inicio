import java.util.Scanner;

public class exec10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.startsWith(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + " é prefixo de " + algumaCoisa);
        } else if (algumaOutraCoisa.startsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + " é prefixo de " + algumaOutraCoisa);
        } else {
            System.out.println("As string não são prefixo uma da outra");
        }
    }
}
