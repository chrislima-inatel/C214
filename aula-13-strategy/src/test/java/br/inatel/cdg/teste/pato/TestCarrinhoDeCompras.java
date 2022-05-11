package br.inatel.cdg.teste.pato;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import br.inatel.cdg.compras.CompraGratuita;
import br.inatel.cdg.compras.CompraPac;
import br.inatel.cdg.compras.CompraSedex;
import br.inatel.cdg.compras.frete.impl.FreteGratuito;
import br.inatel.cdg.compras.frete.impl.FretePac;
import org.junit.Test;
import br.inatel.cdg.compras.CarrinhoDeCompras;
import br.inatel.cdg.compras.frete.impl.FreteSedex;

public class TestCarrinhoDeCompras {
	
	CarrinhoDeCompras carrinhoDeCompras;
	
	@Test
	public void testeCompraSedex() {
		carrinhoDeCompras = new CompraSedex();
		assertTrue(carrinhoDeCompras.getFrete() instanceof FreteSedex);
	}

	@Test
	public void testeCompraSedexValor() {
		carrinhoDeCompras = new CompraSedex();
		double valor = carrinhoDeCompras.calculaFrete(100);
		assertEquals(valor, 250.0, 0.1);

	}

	@Test
	public void testeCompraPac() {
		carrinhoDeCompras = new CompraPac();
		assertTrue(carrinhoDeCompras.getFrete() instanceof FretePac);
	}

	@Test
	public void testeCompraPacValor() {
		carrinhoDeCompras = new CompraPac();
		double valor = carrinhoDeCompras.calculaFrete(100);
		assertEquals(valor, 150.0, 0.1);

	}

	@Test
	public void testeCompraGratuita() {
		carrinhoDeCompras = new CompraGratuita();
		assertTrue(carrinhoDeCompras.getFrete() instanceof FreteGratuito);
	}

	@Test
	public void testeCompraGrauitoValor() {
		carrinhoDeCompras = new CompraGratuita();
		double valor = carrinhoDeCompras.calculaFrete(100);
		assertEquals(valor, 100.0, 0.1);

	}
}
