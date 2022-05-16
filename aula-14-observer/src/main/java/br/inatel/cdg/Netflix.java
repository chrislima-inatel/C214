package br.inatel.cdg;

import br.inatel.cdg.serie.impl.Observavel;
import br.inatel.cdg.serie.impl.Observador;

public class Netflix {

	public static void main(String[] args) {

		// Criando o observavel (subject) netflix.
		Observavel netflix = new Observavel();

		//Criando 3 observadores e fazendo a inscrição em Netflix.
		Observador obs1 = new Observador(1);
		Observador obs2 = new Observador(2);
		Observador obs3 = new Observador(3);

		netflix.registraObservador(obs1);
		netflix.registraObservador(obs2);
		netflix.registraObservador(obs3);

		netflix.setNovoAnuncioNetflix("AAA", "TERROR");
		netflix.setNovoAnuncioNetflix("BBB", "Comedia");

		netflix.removeObservador(obs3);




		System.out.println("\n\nMandando notificação para todos os clientes: ");
		netflix.notificaObservadores();

	}

}
