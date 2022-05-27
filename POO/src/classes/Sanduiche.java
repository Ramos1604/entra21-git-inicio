package classes;

public abstract class Sanduiche extends Lanche {

    public String[] ad = new String[10];

    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.ad[i] == null) {
                this.ad[i] = adicional;
                break;
            }
        }
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.ad[0] != null) {
            System.out.println("-ADICIONAIS-");
            for (String adicional : this.ad) {
                if (adicional != null) {
                    System.out.println(adicional);
                }
            }
        }
    }
}




