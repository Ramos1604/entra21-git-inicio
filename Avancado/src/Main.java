import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex2();
    }

    public static void ex1() {
//            Pedir pro usuário informar n números inteiros até ele digitar 0
//            Quando ele digitar 0, mostrar a lista dos números digitados por ele
        ArrayList inteiros = new ArrayList();
        while(true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: ");
        System.out.println(inteiros);
    }

    public static void ex2(){
 //       Pedir pro usuário informar valores inteiros até que seja informados 0
 //       Quando for informado 0, mostrar os valores que o usuário digitou
 //       mostrar a soma dos números pares e dos números impares informados
 //       mostrar a média de todos os valores informados
        ArrayList inteiros = new ArrayList();
        int somaPar = 0, somaImpar = 0;
        double somaTotal = 0.0;
        while(true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
            } else {
                somaImpar += escolha;
            }
            somaTotal += escolha;
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.print("Valores Informados: "+inteiros);
        System.out.print("Soma dos valores pares: "+somaPar);
        System.out.print("Soma dos valores ímpares: "+somaImpar);
        System.out.print("Média dos valores informados: "+(somaTotal/inteiros.size()));
    }

    public static void ex3() {
        ArrayList<String> palavras = new ArrayList<>();
        while (true) {
            System.out.print("Informe uma palavra ou SAIR para sair: ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            palavras.add(input);
        }
        System.out.println("Informe um valor inteiro: ");
        int valor = in.nextInt();
        for(int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < valor) {
                palavras.remove(i);
                i--;
            }
        }
        System.out.println(palavras);
    }
}
