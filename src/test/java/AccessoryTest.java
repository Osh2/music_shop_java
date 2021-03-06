import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory(3.40, 5.50, "5b Drum Sticks", "Vic Firth", "Percussion");
    }

    @Test
    public void exists(){
        assertNotNull(accessory);
    }

    @Test
    public void canGetWholeSalePrice() {
        assertEquals(3.40, accessory.getWholesalePrice(), 0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(5.50, accessory.getSalePrice(),0);
    }

    @Test
    public void canGetItemName() {
        assertEquals("5b Drum Sticks", accessory.getItem());
    }

    @Test
    public void canGetMake() {
        assertEquals("Vic Firth", accessory.getMake());
    }

    @Test
    public void canGetAssociatedInstrument() {
        assertEquals("Percussion", accessory.getAssociatedInstrument());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(62, accessory.calculateMarkupAsPercent(),0);
    }
}

