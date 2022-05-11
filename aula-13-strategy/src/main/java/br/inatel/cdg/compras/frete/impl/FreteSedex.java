package br.inatel.cdg.compras.frete.impl;

import br.inatel.cdg.compras.Frete;

public class FreteSedex implements Frete {

	@Override
	public double calculaFrete(double peso) {
		double valor = 2.50;
		return peso * valor;
	}

}