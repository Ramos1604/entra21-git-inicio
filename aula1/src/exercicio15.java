import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        //Entrada
        Scanner in =new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int valor1 = in.nextInt();
        System.out.print("Informe o segundo valor ");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1);
        } else {
            System.out.println(valor2);

        }


    }
}
