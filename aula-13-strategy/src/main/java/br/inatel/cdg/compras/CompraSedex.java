package br.inatel.cdg.compras;

import br.inatel.cdg.compras.frete.impl.FreteSedex;

public class CompraSedex extends CarrinhoDeCompras{

    public CompraSedex() {
        frete = new FreteSedex();
    }
}
