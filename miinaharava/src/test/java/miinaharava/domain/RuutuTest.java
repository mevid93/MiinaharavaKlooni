package miinaharava.domain;

import miinaharava.domain.Ruutu;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Martin Vidjeskog
 */
public class RuutuTest {

    Ruutu ruutu;

    public RuutuTest() {
    }

    @Before
    public void setUp() {
        ruutu = new Ruutu();
    }

    @Test
    public void konstruktoriToimii() {
        assertFalse("Ruudussa oli miina.", ruutu.onkoMiina());
        assertFalse("Ruutu oli avattu.", ruutu.onkoAvattu());
        assertFalse("Ruutu oli liputettu.", ruutu.onkoLiputettu());
    }

    @Test
    public void ruudunAvausToimii() {
        ruutu.avaa();
        assertTrue("Ruutu ei ollut avattu.", ruutu.onkoAvattu());
    }

    @Test
    public void eiVoidaAvataRuutuaJossaLippu() {
        ruutu.liputuksenTilanVaihto();
        ruutu.avaa();
        assertFalse("Ruutu oli avattu.", ruutu.onkoAvattu());
    }

    @Test
    public void liputusToimii() {
        ruutu.liputuksenTilanVaihto();
        assertTrue("Ruutu ei ollut liputettu.", ruutu.onkoLiputettu());
    }

    @Test
    public void lipunPoistoToimii() {
        ruutu.liputuksenTilanVaihto();
        ruutu.liputuksenTilanVaihto();
        assertFalse("Ruutu oli liputettu.", ruutu.onkoLiputettu());
    }

    @Test
    public void eiVoiLiputtaaAvattuaRuutua() {
        ruutu.avaa();
        ruutu.liputuksenTilanVaihto();
        assertFalse("Ruutu oli liputettu.", ruutu.onkoLiputettu());
    }

    @Test
    public void miinoitusToimii() {
        ruutu.miinoita();
        assertTrue("Ruudussa ei ollut miinaa.", ruutu.onkoMiina());
    }
}
