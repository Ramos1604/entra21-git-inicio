import java.util.Scanner;

public class exec12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        int pos = algumaCoisa.indexOf(algumaOutraCoisa);
        System.out.println("A posição de " + algumaOutraCoisa + " em " + algumaCoisa + " é " + pos);
    }
}
