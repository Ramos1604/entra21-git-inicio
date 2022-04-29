import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // entrada
        System.out.print("Valor de eleitores");
        int eleitores = in.nextInt();
        System.out.print("Votos em Branco");
        int Brancos = in.nextInt();
        System.out.print("Votos Nulos");
        int Nulos = in.nextInt();

        // processamento
        int var = eleitores - Brancos - Nulos;
        int var2 = (var * 100) / eleitores;
        int var3 = (Brancos * 100) / eleitores;
        int var4 = (Nulos * 100) / eleitores;


        //saida
        System.out.printf("Votos valido %d total", var);
        System.out.printf("Validos %d ", var2);
        System.out.printf("Brancos %d ", var3);
        System.out.printf("Nulos %d ", var4);
    }
}
