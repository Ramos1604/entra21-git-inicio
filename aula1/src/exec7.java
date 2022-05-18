import java.util.Scanner;

public class exec7 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Digite algo");
        String algo = in.nextLine();
        System.out.println("Length: "+algo.length());
        System.out.println("Empty: "+algo.isEmpty());
        System.out.println("Uppercase: "+algo.toUpperCase());
        System.out.println("Lowercase: "+algo.toLowerCase());
    }
}
