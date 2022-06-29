package classes.avaliacao;

public class Avaliacao {
    private double rating;
    private String nome;
    private String feedback;

    public String getAvaliar() {
        return avaliar;
    }

    public void setAvaliar(String avaliar) {
        this.avaliar = avaliar;
    }

    private String avaliar;

    // GETTERS & SETTERS

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
