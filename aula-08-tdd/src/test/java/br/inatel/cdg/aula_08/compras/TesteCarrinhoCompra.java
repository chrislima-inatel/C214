package br.inatel.cdg.aula_08.compras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoCompra {


	// Teste inicial básico (Padrão 1)
	@Test
	public void testSomaTotalCompra() throws NumeroNegativoException {

		Brownie bw1 = new Brownie("Brownie Nutella", 6, 150);
		Brownie bw2 = new Brownie("Brownie Doce de Leite", 4, 100);

		CarrinhoCompra carrinho = new CarrinhoCompra();

		carrinho.adiciona(bw1);
		carrinho.adiciona(bw2);

		assertEquals(250, carrinho.somaTotal(),0.01);

	}


	// Teste inicial básico (Padrão 1) + algo diferente (teste valor total de itens) (Padrão 2)
	@Test
	public void testSomaTotalQtd() throws NumeroNegativoException {

		Brownie bw1 = new Brownie("Brownie Nutella", 6, 150);
		Brownie bw2 = new Brownie("Brownie Doce de Leite", 4, 100);

		CarrinhoCompra carrinho = new CarrinhoCompra();

		carrinho.adiciona(bw1);
		carrinho.adiciona(bw2);
		assertEquals(10, carrinho.somaTotalItens(),0.01);


	}

	// Teste negativo (Padrão 3) forçando uma situação inesperada
	@Test(expected = NumeroNegativoException.class)
	public void testSomaNegativo() throws NumeroNegativoException {

		Brownie bw1 = new Brownie("Brownie Nutella", -6, 150);
		Brownie bw2 = new Brownie("Brownie Doce de Leite", -4, 100);

		CarrinhoCompra carrinho = new CarrinhoCompra();

		carrinho.adiciona(bw1);
		carrinho.adiciona(bw2);

	}

	// Teste integração (Padrão 4) 2 classes (Carrinho e Cupom sendo testadas juntas).
	@Test
	public void testIntegracaoCupom() throws NumeroNegativoException {

		Brownie bw1 = new Brownie("Brownie Nutella", 6, 150);
		Brownie bw2 = new Brownie("Brownie Doce de Leite", 4, 100);

		CarrinhoCompra carrinho = new CarrinhoCompra();
		CupomDesconto cupom = new CupomDesconto(0.20);
		carrinho.setCupom(cupom);

		carrinho.adiciona(bw1);
		carrinho.adiciona(bw2);
		carrinho.somaTotal();

		assertEquals(200, carrinho.somaTotal(), 0.1);

	}

}

