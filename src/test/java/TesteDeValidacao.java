import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TesteDeValidacao {

    @Test
    public void Exc2() {
// valores corretos
        assertEquals("7:30:0", (new Tempo(7, 30, 0)).toString());
        assertEquals(3600, (new Tempo(1, 0, 0)).toSeconds());
        assertTrue((new Tempo(1, 0, 0)).setHora(10));
        assertEquals(0, (new Tempo(1, 0, 0)).diff(new Tempo(1, 0, 0)));

// valor errado para hora
        assertEquals("0:0:0", (new Tempo(33, 15, 0)).toString());
        assertFalse((new Tempo(1, 0, 0)).setHora(35));

// valor errado para minuto
        assertEquals("0:0:0", (new Tempo(3, 75, 0)).toString());

// valor errado para segundo
        assertEquals("0:0:0", (new Tempo(4, 15, 80)).toString());

// valor errado para hora, minuto
        assertEquals("0:0:0", (new Tempo(-1, 61, 0)).toString());

// valor errado para hora, minuto, segundo
        assertEquals("0:0:0", (new Tempo(25, 60, 60)).toString());
    }

}
