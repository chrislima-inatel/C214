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
        assertEquals("Skeleton", skeleton.getNome());
        assertEquals(200.0, skeleton.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", skeleton.getArma());

    }

    @Test
    public void testeBuscaInimigoDragao(){

        //Fiz a busca
        Inimigo dragao = buscaInimigo.buscaInimigo(20);

        //Faz assertion
        assertEquals("Dragao", dragao.getNome());
        assertEquals(100.0, dragao.getQtdVida(), 0.1);
        assertEquals("Fogo", dragao.getArma());

    }

    @Test
    public void testeBuscaInimigoPadrao(){

        //Fiz a busca com ID positivo diferente de 10 e 20
        Inimigo dragao = buscaInimigo.buscaInimigo(9);

        //Faz assertion
        assertEquals("Aranha", dragao.getNome());
        assertEquals(20.0, dragao.getQtdVida(), 0.1);
        assertEquals("Teia", dragao.getArma());

    }

    @Test
    public void testeBuscaInimigoValido(){

        //Faz a busca de um inimigo válido (id = 10 ou id = 20 ou ID positivo)
        boolean inimigoValido = buscaInimigo.verificaArrayListExistente(10);

        assertTrue(inimigoValido);
    }

    @Test
    public void testeBuscaInimigoInValido(){

        //Faz a busca de um inimigo inválido (id negativo)
        boolean inimigoValido = buscaInimigo.verificaArrayListExistente(-8);

        assertFalse(inimigoValido);
    }
}
