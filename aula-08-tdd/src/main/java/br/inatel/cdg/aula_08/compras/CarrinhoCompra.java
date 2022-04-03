package br.inatel.cdg.aula_08.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

	private List<Brownie> brownies;
	private CupomDesconto cupom;

	public CarrinhoCompra() {
		brownies = new ArrayList<Brownie>();
	}

	public void adiciona(Brownie bw) throws NumeroNegativoException {

		if(bw.getQtd() > 0){
			brownies.add(bw);
		}else{
			throw new NumeroNegativoException("Não é possivel adicionar uma quantidade negativa");
		}

	}

	public double somaTotal() {
		double total = 0;
		for (Brownie brownie : brownies) {
			total += brownie.getValor();
		}

		if(cupom != null && cupom.getDesconto() > 0){
			return somaTotalComDesconto(total, cupom.getDesconto());
		}else{
			return total;
		}
	}

	private double somaTotalComDesconto(double total, double desconto){
		return total = total - (total*desconto);
	}

	public double somaTotalItens() {
		double total = 0;
		for (Brownie brownie : brownies) {

			total += brownie.getQtd();
		}
		return total;
	}

	public CupomDesconto getCupom() {
		return cupom;
	}

	public void setCupom(CupomDesconto cupom) {
		this.cupom = cupom;
	}
}