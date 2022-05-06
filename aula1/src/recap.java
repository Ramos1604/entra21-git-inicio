import java.util.Scanner;

public class recap {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isHealer = true;
        while(isHealer) {
            System.out.println("Informe a abreviação do tank");
            String clazz = in.next();
            switch (clazz) {
                case "PLD", "WAR", "DKN", "GNB" :
                    System.out.println("tank");
                case "WHM", "SCH", "AST", "SAG" :
                    System.out.println("healer");
                case "MNR", "DRG", "NJA", "SMR", "RPR", "MCK", "DNC", "BLM", "SMN", "RDM", "BEM" :
                    System.out.println("dps");
                    isHealer = false;
                   break;

            }
        }
    }
}
