package br.inatel.cdg.compras.frete.impl;

import br.inatel.cdg.compras.Frete;

public class FreteGratuito implements Frete {

	@Override
	public double calculaFrete(double peso) {
		double valor = 1;
		return peso * valor;
	}

}
