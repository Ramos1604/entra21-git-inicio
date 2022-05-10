import java.util.Scanner;

public class FATORIAL {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Fatorial um número: ");
        int fatorial = in.nextInt();
        int valorFinal = 1;
        if(fatorial == 0) {
            valorFinal = 0;
        }
        for (int i = fatorial; i > 0; i--) {
            valorFinal *= i;
        }
        System.out.println("Fatorial de " + fatorial + " é " + valorFinal);

    }
}
