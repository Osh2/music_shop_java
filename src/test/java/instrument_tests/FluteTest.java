package instrument_tests;

import instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute( 80.50, 99.99, "Brass", "Standard", "Medium");
    }

    @Test
    public void exists() {
        assertNotNull(flute);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(80.50, flute.getWholesalePrice(),0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(99.99, flute.getSalePrice(),0);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", flute.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Standard", flute.getType());
    }

    @Test
    public void canGetSize() {
        assertEquals("Medium", flute.getSize());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(24, flute.calculateMarkup(),0);
    }
}
