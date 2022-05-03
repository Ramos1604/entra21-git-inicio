import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o ano que você nasceu: ");
        int anoNasc = in.nextInt();
        System.out.print("Informe o ano atual: ");
        int anoAtual = in.nextInt();
        if ((anoAtual-anoNasc) < 16) {
            System.out.println("Não pode votar! ");
        } else {
            System.out.println("Pode votar! ");



        }
    }
}
