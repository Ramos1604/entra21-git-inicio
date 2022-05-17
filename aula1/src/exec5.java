import java.util.Random;
import java.util.Scanner;

public class exec5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int randomico = r.nextInt(101);
        int chutes = 0;
        while (true) {
            System.out.println("Informe um número: ");
            int valorInformado = in.nextInt();
            chutes ++;
            if (valorInformado == randomico) {
                System.out.println("ACERTOU MIZERAVI");
                break;
            } else if (valorInformado > randomico) {
                System.out.println("Chutou muito alto, tente de novo!");
            } else {
                System.out.println("Chutou muito baixo, tente de novo!");
            }
        }
        System.out.println("Você tentou " +chutes+ " vezes");
    }
}