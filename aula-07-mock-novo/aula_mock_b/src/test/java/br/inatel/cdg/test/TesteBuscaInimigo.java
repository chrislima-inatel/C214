package br.inatel.cdg.test;

import br.inatel.cdg.BuscaInimigo;
import br.inatel.cdg.Inimigo;
import br.inatel.cdg.InimigoService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaInimigo {

    InimigoService service;
    BuscaInimigo buscaInimigo;

    @Before
    public void setup(){
        //Criando o contexo do meu teste com o Mock (serviço mock)
        service = new MockInimigoService();
        buscaInimigo = new BuscaInimigo(service);
    }

    @Test
    public void testeBuscaInimigoSkeleton(){

        //Fiz a busca
        Inimigo skeleton = buscaInimigo.buscaInimigo(10);

        //Faz assertion
        assertEquals("Skeletonn", skeleton.getNome());
        assertEquals(200.0, skeleton.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", skeleton.getArma());

    }
}
