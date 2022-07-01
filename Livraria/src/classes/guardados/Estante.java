import classes.itens.Item;

public class Estante {
    private String[] adicionais = new String[5];

    private int capMaxima;
    private Item[] itens;

    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < 10; i++) {
            if(this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }

    public String[] getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String[] adicionais) {
        this.adicionais = adicionais;
    }


    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
        //TODO
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        int contator = 0;
        for (Item i : this.getItens()) {
            if (i != null) {
                contator ++;
            }
        }
        return contator;
    }

    public Item buscarItem(String titulo) {
        for (Item i : this.getItens()) {
            if (i != null && i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return i;
            }
        }
        return null;
    }


    public boolean adicionarItem(Item item) {
        for (int i = 0; i < this.getItens().length; i++) {
            if ( this.getItens()[i] == null ) {
                this.getItens()[i] = item;
                return true;
            }
        }
        return false;
    }

    public Item removerItem(int posicao) {
        Item i = this.getItens()[posicao];
        this.getItens()[posicao] = null;
        return i;
    }

    // GETTERS & SETTERS

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
