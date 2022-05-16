package br.inatel.cdg.serie.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.serie.interfaces.iObservavel;

public class Observavel implements iObservavel {

	private String titulo, genero;
	private List<Observador> clientes;

	public Observavel() {
		clientes = new ArrayList<Observador>();
	}
	
	@Override
	public void registraObservador(Observador obs) {
		clientes.add(obs);
	}

	@Override
	public void removeObservador(Observador obs) {
		if(clientes.contains(obs))
			clientes.remove(obs);
	}

	@Override
	public void notificaObservadores() {
		for (Observador observador : clientes) {
			observador.update(this);
		}
	}
	
	//Esse método é chamado sempre que os valores 
	//se modificacam
	private void novasMedidas() {
		notificaObservadores();
	}
	
	public void setNovoAnuncioNetflix(String titulo, String genero) {
		System.out.println("\n\n####### Netflix anuncia algo novo #######\n\n");
		this.titulo = titulo;
		this.genero = genero;
		novasMedidas();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setClientes(List<Observador> clientes) {
		this.clientes = clientes;
	}

	public List<Observador> getClientes() {
		return clientes;
	}

}
