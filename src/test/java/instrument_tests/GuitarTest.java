package instrument_tests;

import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.GUITAR, "Acoustic", 75, 100, "Mahogany", 6, "Natural");
    }

    @Test
    public void exists() {
        assertNotNull(guitar);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(75, guitar.getWholesalePrice(),0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(100, guitar.getSalePrice(),0);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Acoustic", guitar.getType());
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void canGetColour() {
        assertEquals("Natural", guitar.getColour());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(33, guitar.calculateMarkup(),0);
    }
}
