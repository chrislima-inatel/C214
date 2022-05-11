package br.inatel.cdg.compras;

import br.inatel.cdg.compras.frete.impl.FretePac;

public class CompraPac extends CarrinhoDeCompras {

	public CompraPac() {
		//Inicializado no construtor com um FreteSedex
		frete = new FretePac();
	}

}