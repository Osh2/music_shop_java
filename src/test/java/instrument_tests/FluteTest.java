package instrument_tests;

import instruments.Brass;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FluteTest {

    Brass brass;

    @Before
    public void before(){
        brass = new Brass( InstrumentType.BRASS, "Flute", 60, 80, "Brass", "Medium");
    }

    @Test
    public void exists() {
        assertNotNull(brass);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(60, brass.getWholesalePrice(),0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(80, brass.getSalePrice(),0);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", brass.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Flute", brass.getType());
    }

    @Test
    public void canGetSize() {
        assertEquals("Medium", brass.getSize());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(33, brass.calculateMarkup(),0);
    }

    @Test
    public void canGetInstumentType() {
        assertEquals(InstrumentType.BRASS, brass.getInstrument());
    }
}