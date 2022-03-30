package br.inatel.cdg.aula_08.compras;

public class Brownie {
	
	private String nome;
	private int qtd;
	private double valor;
	
	public Brownie(String nome, int qtd, double valor) {
		this.nome = nome;
		this.qtd = qtd;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}
	public int getQtd() {
		return qtd;
	}
	public double getValor() {
		return valor;
	}
}