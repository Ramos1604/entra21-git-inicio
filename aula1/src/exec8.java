import java.util.Scanner;

public class exec8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        if (algumaCoisa.equals(algumaOutraCoisa)) {
            System.out.println("São exatamente iguais");
        } else if (algumaCoisa.equalsIgnoreCase(algumaOutraCoisa)) {
            System.out.println("São iguais independente de case");
        } else {
            System.out.println("São diferentes");
    }
    }
}
