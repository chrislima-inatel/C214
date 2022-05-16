import br.inatel.cdg.serie.impl.Observador;
import br.inatel.cdg.serie.impl.Observavel;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testeInscritos(){
        Observavel netflix = new Observavel();
        Observador obs1 = new Observador(1);
        netflix.registraObservador(obs1);
        assertTrue(!netflix.getClientes().isEmpty());
    }

    @Test
    public void teste3Inscritos(){
        Observavel netflix = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        netflix.registraObservador(obs1);
        netflix.registraObservador(obs2);
        netflix.registraObservador(obs3);
        assertEquals(netflix.getClientes().size(), 3);
    }
}
