package classes.lanches;

public abstract class Sanduiche extends Lanche {

    public String[] getAd() {
        return ad;
    }

    public void setAd(String[] ad) {
        this.ad = ad;
    }

    private String[] ad = new String[10];

    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.ad[i] == null) {
                this.ad[i] = adicional;
                break;
            }
        }
    }
}




