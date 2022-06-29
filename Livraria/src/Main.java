import classes.guardados.Estante;
import classes.itens.Item;
import classes.itens.Livro;
import com.sun.source.tree.EmptyStatementTree;

import java.util.Scanner;

public class Main {

    public String[] Estante = new String[5];

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-MENU: Me informe seu Item-");
        System.out.println("(1) - DVD");
        System.out.println("(2) - Livro");
    }
        Livro l = new Livro();
        l.setTitulo("Harry Potter e a Autora Transfóbica");
        l.avaliar();
        l.avaliar();
        l.avaliar();
        System.out.println(l.getTotalRating());


    }
}
