package br.inatel.cdg.serie.impl;

import br.inatel.cdg.serie.interfaces.iObservador;

public class Observador implements iObservador {

	private String nomeSerie, genero;
	int id;

	public Observador(int id) {
		this.id = id;
	}

	@Override
	public void update(Observavel netflix) {
		System.out.println("Cliente: "+this.id);
		System.out.println("Nome da serie: " + netflix.getTitulo());
		System.out.println("Genero: " + netflix.getGenero());
	}
	
}