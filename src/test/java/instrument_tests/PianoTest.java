package instrument_tests;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(600, 800, "Premium Materials", "Grand", 0);
    }

    @Test
    public void exists() {
        assertNotNull(piano);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(600, piano.getWholesalePrice(),0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(800, piano.getSalePrice(),0);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Premium Materials", piano.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Grand", piano.getType());
    }
}
