package classes.lanches;

public class XBurguer extends Sanduiche {


    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.setSetTipo("XBurguer");
    }
}

