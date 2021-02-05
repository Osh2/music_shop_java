package instrument_tests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(75.73, 100.50, "Ash", "Acoustic", 6, "Wood Stain");
    }

    @Test
    public void exists() {
        assertNotNull(guitar);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(75.73, guitar.getWholesalePrice(),0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(100.50, guitar.getSalePrice(),0);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Ash", guitar.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Acoustic", guitar.getType());
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }
}
