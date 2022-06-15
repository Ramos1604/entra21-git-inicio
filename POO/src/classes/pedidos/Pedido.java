package classes.pedidos;

import classes.lanches.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Pedido {
    public void setLanches(ArrayList<Lanche> lanches) {
        this.lanches = lanches;
    }

    private ArrayList<Lanche> lanches = new ArrayList<>();

    public void imprimirComanda() {
        for (Lanche l : this.getLanches()) {
            if (l instanceof MiniPizza) {
                MiniPizza mp = ((MiniPizza) l);
                System.out.println("===" + l.getSetTipo() + " - " + mp.getSabor() + "===");
                if (mp.isBordaRecheada()) {
                    System.out.println("-- COM BORDA RECHEADA: " + mp.getSabordaBorda() + "--");
                }
                if (l instanceof Pizza) {
                    System.out.println("Tamanhos: " + ((Pizza) l).getTamanho());
                }
            } else {
                System.out.println("===" + l.getSetTipo() + "===");
            }
            if (l instanceof XBurguer) {
                if (((XBurguer) l).isAberto()) {
                    System.out.println("-- LANCHE ABERTO --");
                }
            }
            System.out.printf("Valor: R$%.2f\n", l.getValor());
            System.out.println("-INGREDIENTES-");
            for (String ingrediente : l.getIngredientes()) {
                if (ingrediente != null) {
                    System.out.println(ingrediente);
                }
            }
            if (l instanceof Sanduiche) {
                Sanduiche s = (Sanduiche) l;
                if (s.getAd()[0] != null) {
                    System.out.println("-ADICIONAIS-");
                    for (String adicional : s.getAd()) {
                        if (adicional != null) {
                            System.out.println(adicional);
                        }
                    }
                }
            }
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("--------------------------------------- ");
    }
    public double calcularValorTotal() {
        double vlrTotal = 0;
        for (Lanche l : this.getLanches()) {
            vlrTotal += l.getValor();
        }
        return vlrTotal;
    }
    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }
}



