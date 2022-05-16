package br.inatel.cdg.serie.interfaces;

import br.inatel.cdg.serie.impl.Observador;

public interface iObservavel {

	public void registraObservador(Observador obs);
	public void removeObservador(Observador obs);
	public void notificaObservadores();
	
}