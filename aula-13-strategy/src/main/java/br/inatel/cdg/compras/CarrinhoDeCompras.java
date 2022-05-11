package br.inatel.cdg.compras;

public abstract class CarrinhoDeCompras {
	
	//Composicao com instancia de Frete
	protected Frete frete;

	//Comportamento delegado
	public double calculaFrete(double peso) {
		return frete.calculaFrete(peso);
	}


	//Getter e Setter
	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public Frete getFrete() {
		return frete;
	}
}