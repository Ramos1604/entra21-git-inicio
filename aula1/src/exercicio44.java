import java.util.Scanner;

public class exercicio44 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe os anos vividos: ");
        int anos = in.nextInt();
        System.out.print("Informe os meses vividos: ");
        int meses = in.nextInt();
        System.out.print("Informe os dias vividos: ");
        int dias = in.nextInt();
        System.out.printf("Você viveu %d dias", (anos*365)+(meses*30)+dias);

    }
}
