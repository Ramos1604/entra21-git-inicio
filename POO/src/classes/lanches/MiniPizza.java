package classes.lanches;

    public abstract class MiniPizza extends Lanche {
    private boolean bordaRecheada;
    private String sabordaBorda;
    private String sabor;


    public MiniPizza() {

        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de Tomate");
        this.adicionarIngrediente("Mozzarella");
        this.setTipo("Mini Pizza");

    }
    public void adicionarSaborEIngredientes(String sabor) {
        this.setSabor(sabor);
        switch(sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("CHEDDAR");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;
            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
                break;
            case "FRANGO C/ CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Majericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Ovo");
                break;
        }
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public boolean isBordaRecheada() {
        return this.bordaRecheada;
    }

    public void setSabordaBorda(String sabordaBorda) {
        this.sabordaBorda = sabordaBorda;
    }

    public String getSabordaBorda() {
        return this.sabordaBorda;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }

}
