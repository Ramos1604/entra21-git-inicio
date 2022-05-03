import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {
        //Entrada
        Scanner in = new Scanner(System.in);
        System.out.print("informe um valor");
        int valor = in.nextInt();

        //Processamento
        if (valor> 10) {
            //Saída
            System.out.println("É maior que 10!");
            }
        else {

            //Saída
            System.out.println("Não é maior que 10!");
        }
    }
}
