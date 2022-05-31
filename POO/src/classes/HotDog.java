package classes;

public class HotDog extends Sanduiche {

    private HotDog() {
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Purê de batata");
        this.adicionarIngrediente("Batata palha");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Queijo Cheddar");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Ervilha");
        this.tipo = "HotDog";
    }
}
