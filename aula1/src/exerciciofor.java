import java.util.Scanner;

public class exerciciofor {

    public static void main(String[] args) {

        //Entrada
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a frase");
        String frase = in.nextLine();
        System.out.println("Quantidade de Caracteres");

        int espacos = 0;
        for(int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' '){
                espacos++;
            }
        }


        System.out.println(espacos);
    }
}
