package br.inatel.cdg;

public class Inimigo {

    private String nome;
    private double qtdVida;
    private String arma;

    public Inimigo (String nome, double qtdVida, String arma){
        this.nome = nome;
        this.qtdVida = qtdVida;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdVida() {
        return qtdVida;
    }

    public void setQtdVida(double qtdVida) {
        this.qtdVida = qtdVida;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
