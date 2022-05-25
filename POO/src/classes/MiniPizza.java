package classes;

import java.util.Locale;

public class MiniPizza extends Lanche {
    public boolean bordaRecheada;
    public String sabordaBorda;


    public MiniPizza() {

        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de Tomate");
        this.adicionarIngrediente("Oregano");
        this.adicionarIngrediente("Catupiry");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Cebola");
        this.tipo = "Mini Pizza";


    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordaRecheada) {
            System.out.println("-- COM BORDA RECHEADA: "+ sabordaBorda +"--");

        }
    }
}
