package classes.lanches;

import java.util.ArrayList;

public abstract class Lanche {
    private ArrayList<String> ingredientes = new ArrayList<>();

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes.add(ingredientes);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSetTipo() {
        return setTipo;
    }

    public void setSetTipo(String setTipo) {
        this.setTipo = setTipo;
    }

    private double valor;

    private String setTipo;

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
            }
        }
    }
}



