package br.inatel.cdg.compras;

import br.inatel.cdg.compras.frete.impl.FreteGratuito;

public class CompraGratuita extends CarrinhoDeCompras{

    public CompraGratuita() {
        frete = new FreteGratuito();
    }
}
