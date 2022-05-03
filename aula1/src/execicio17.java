import java.util.Scanner;

public class execicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Entrada
        Scanner in =new Scanner(System.in);
        System.out.print("Informe a hora de início do jogo: ");
        int valor1 = in.nextInt();
        System.out.print("Informe a hora de fim de jogo ");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.printf("Duração do jogo: %d", 24 - (horaIni - horaFim));
        } else {
            System.out.printf("Duração do jogo: %d", (horaFim - horaini));

        }
    }
}
    }
}
