package instrument_tests;

import instruments.InstrumentType;
import instruments.Keys;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KeysTest {

    Keys keys;

    @Before
    public void before(){
        keys = new Keys(InstrumentType.KEYS, "Grand Piano", 10000, 12000, "Premium Materials", 0);
    }

    @Test
    public void exists() {
        assertNotNull(keys);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(10000, keys.getWholesalePrice(),0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(12000, keys.getSalePrice(),0);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Premium Materials", keys.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Grand Piano", keys.getType());
    }

    @Test
    public void canGetAge() {
        assertEquals(0, keys.getAge());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, keys.calculateMarkup(), 0);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYS, keys.getInstrument());
    }
}
