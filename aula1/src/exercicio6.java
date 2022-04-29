import java.util.Scanner;

public class exercicio6 {

     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);
         System.out.print("Salario mensal");
         int Salario = in.nextInt();
         System.out.print("Reajuste");
         int Reajuste = in.nextInt();


         int var2 = (Salario * Reajuste) / 100 ;

         System.out.printf("Salario %d ", Salario+var2);

    }
}
