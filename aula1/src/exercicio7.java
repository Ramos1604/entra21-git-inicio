import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        double Custo;
        Scanner in = new Scanner(System.in);
        System.out.print("Custo de Fábrica de um Carro");
        Custo = in.nextDouble();

        double var = (100 + 45);
        double var2 = (100 + 28);
        double vf = (100 / Custo * var2);
        double vff = (100 / vf * var);

        System.out.println("Valor" + vff);


    }
}
