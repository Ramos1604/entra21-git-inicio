import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        //Entrada
        Scanner in = new Scanner(System.in);
        System.out.print("Valor Positivo");
        int valor = in.nextInt();

        //Processamento
        if (valor >= 0) {
            //Saída
            System.out.println("Valor Positivo");
            }
        else {

            //Saída
            System.out.println("Valor Negativo");
        }
    }
}
