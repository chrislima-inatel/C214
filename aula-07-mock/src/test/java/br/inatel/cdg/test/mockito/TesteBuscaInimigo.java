package br.inatel.cdg.test.mockito;

import br.inatel.cdg.BuscaInimigo;
import br.inatel.cdg.Inimigo;
import br.inatel.cdg.InimigoService;
import br.inatel.cdg.test.InimigoConst;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaInimigo {

    @Mock
    private InimigoService service;
    private BuscaInimigo buscaInimigo;

    @Before
    public void setup(){
        buscaInimigo = new BuscaInimigo(service);
    }

    @Test
    public void testeBuscaInimigoSkeleton(){
        Mockito.when(service.busca(55)).thenReturn(InimigoConst.SKELETON);

        Inimigo skeleton = buscaInimigo.buscaInimigo(55);
        //Faz assertion
        assertEquals("Skeleton", skeleton.getNome());
        assertEquals(200.0, skeleton.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", skeleton.getArma());

    }

    @Test
    public void testeBuscaInimigoInvalido(){
        Mockito.when(service.busca(56)).thenReturn(InimigoConst.INEXISTENTE);

        Inimigo skeleton = buscaInimigo.buscaInimigo(56);
        //Faz assertion
        assertEquals("Inexistente", skeleton.getNome());
        assertEquals(0, skeleton.getQtdVida(), 0.1);
        assertEquals("Inexistente", skeleton.getArma());

    }

    @Test
    public void testeBuscaInimigoValido(){

        Mockito.when(service.inimigoExistente(10)).thenReturn(true);
        //Faz a busca de um inimigo válido (id = 10 ou id = 20 ou ID positivo)
        boolean inimigoValido = service.inimigoExistente(10);

        assertTrue(inimigoValido);
    }


}
