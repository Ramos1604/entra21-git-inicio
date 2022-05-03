import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Entrada
        System.out.print("Quantidade de maçã");
        int quantidade = in.nextInt();

        if (quantidade > 12) {
            //Saída
            System.out.printf("Valor a Pagar %.2f ", (quantidade * 1.0)); }
        else {

            System.out.printf("Total valor a pagar %.2f ", (quantidade * 1.3));




        }
    }
}
