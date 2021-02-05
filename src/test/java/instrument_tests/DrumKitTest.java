package instrument_tests;

import instruments.DrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DrumKitTest {

    DrumKit kit;

    @Before
    public void before(){
        kit = new DrumKit(150, 225.99, "Woods, Mylar", "Basic Trad Rock", 3, 2, "Double bass pedal");
    }

    @Test
    public void exists() {
        assertNotNull(kit);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(150, kit.getWholesalePrice(),0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(225.99, kit.getSalePrice(),0);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Woods, Mylar", kit.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Basic Trad Rock", kit.getType());
    }

    @Test
    public void canGetNumToms() {
        assertEquals(3, kit.getNumToms());
    }

    @Test
    public void canGetNumCymbals() {
        assertEquals(2, kit.getNumCymbals());
    }

    @Test
    public void canGetFeatures() {
        assertEquals("Double bass pedal", kit.getFeatures());
    }

}
