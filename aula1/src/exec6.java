import java.util.Scanner;

public class exec6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("");
        }

    for (int i = 0; i < 5; i++) {
        for (int j = 1; j < i+1; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}
