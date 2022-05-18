import java.util.Scanner;

public class exec14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de números: ");
        int nums = in.nextInt();
        int[] numeros = new int[nums];
        for (int i = 0; i < nums; i++) {
            System.out.println("Informe um número: ");
            numeros[i] = in.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for (int valor : numeros) {
            if (valor % 2 ==0) {
                somaPar += valor;
            } else {
                somaImpar += valor;
            }
         }
        System.out.println("Soma dos valores pares: "+somaPar);
        System.out.println("Soma dos valores ímpares: "+somaImpar);
    }
}
