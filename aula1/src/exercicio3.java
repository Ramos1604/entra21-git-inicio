import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o Valor ");
        double base = in.nextDouble();
        System.out.print("Digite o valor ");
        double altura = in.nextDouble();
        double area = base * altura;
        double per = base * 2 + altura * 2;
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f", per);


    }
}
