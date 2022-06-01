package classes.cliente;

import classes.pedidos.Pedido;

public class cliente {

    public cliente() {
        this.setPedido(new Pedido());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    private Pedido pedido;

}
