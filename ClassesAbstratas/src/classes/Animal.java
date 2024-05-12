package classes;

import classes.*;

abstract public class Animal implements SerVivo {

    /*
        Uma classe abstrata serve apenas para o fato de ser HERDADA, não pode ser instanciada
            Assim não é possível criar novos objetos sobre da classe abstrata.
    */

    private static int countCode = 1;
    protected int code;
    protected String nome;
    protected boolean vivo;
    protected String sexo;
    protected String localEncontrado;
    protected String tipoDeAlimentacao;

    Animal (String nome, int sexo, String localEncontrado, int tipoDeAlimentacao) {
        this.code = countCode++;
        this.nome = nome;
        if (sexo == 1) {
            this.sexo = "Macho";
        }
        else {
            this.sexo = "Fêmea";
        }

        this.localEncontrado = localEncontrado;

        if (tipoDeAlimentacao == 1) {
            this.tipoDeAlimentacao = "Herbívoro";
        }
        else {
            this.tipoDeAlimentacao = "Carnívoro";
        }

        this.vivo = true;
    }

    public void comer(float massaKg) {
        if (this.tipoDeAlimentacao.equals("HERBÍVORO")) {
            System.out.println("O " + this.nome + " comeu " + massaKg + "Kg de plantas!");
        }
        else if (this.tipoDeAlimentacao.equals("CARNÍVORO")) {
            System.out.println("O " + this.nome + " comeu " + massaKg + "Kg de carne!");
        }
        else {
            System.out.println("O " + this.nome + " comeu " + massaKg + "Kg de alimento!");
        }
    }

    public void mover(float distMetros) {
        System.out.printf("O %s se moveu por %.2f metros!");
    }

    public void info() {
        System.out.printf("Nome: %S\n", this.nome);
        System.out.printf("Sexo: %S\n", this.sexo);
        System.out.printf("Local: %S\n", this.localEncontrado);
        System.out.printf("Tipo de Alimento: %S\n", this.tipoDeAlimentacao);
        System.out.printf("Vivo: %s\n\n", this.vivo ? "SIM" : "NÃO");
    }

    public void morreu() {
        this.vivo = false;
    }

    public String getLocalEncontrado() {
        return this.localEncontrado;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isVivo() {
        return this.vivo;
    }

    public String getTipoDeAlimentacao() {
        return this.tipoDeAlimentacao;
    }

    public String getSexo() {
        return this.sexo;
    }

    public int getCode() {
        return this.code;
    }

    public void setLocalEncontrado(String localEncontrado) {
        this.localEncontrado = localEncontrado;
    }

    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
