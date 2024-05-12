package classes;

import classes.*;

public class Especie extends Animal {
    protected static int coutCode = 1;
    protected String familia;

    public Especie(String nome, int sexo, String localEncontrado, int tipoDeAlimentacao, String familia) {
        super(nome, sexo, localEncontrado, tipoDeAlimentacao);
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

}
