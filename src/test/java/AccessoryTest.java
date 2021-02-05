import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory(3.40, 6.50, "5b Drum Sticks", "Vic Firth", "Percussion");
    }

    @Test
    public void exists(){
        assertNotNull(accessory);
    }

    @Test
    public void canGetWholeSalePrice() {
        assertEquals(3.40, accessory.getSalePrice(), 0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(6.50, accessory.getSalePrice(),0);
    }

    @Test
    public void canGetItemName() {
        assertEquals("5b Drum Sticks", accessory.getItem());
    }


}

