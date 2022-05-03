import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {
        //Entrada
        Scanner in =new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int valor1 = in.nextInt();
        System.out.print("Informe o segundo valor ");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.printf("%d, %d", valor1, valor2);
        } else {
            System.out.printf("%d, %d", valor2, valor1);

        }
    }
}
