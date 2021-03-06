package instrument_tests;

import instruments.DrumKit;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DrumKitTest {

    DrumKit kit;

    @Before
    public void before(){
        kit = new DrumKit(InstrumentType.DRUMS, "Basic Traditional", 200, 250, "Woods, Metals, Mylar", 3, 2 ,"Double bass pedal");
    }

    @Test
    public void exists() {
        assertNotNull(kit);
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(200, kit.getWholesalePrice(),0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(250, kit.getSalePrice(),0);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Woods, Metals, Mylar", kit.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Basic Traditional", kit.getType());
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

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.DRUMS, kit.getInstrument());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(25, kit.calculateMarkupAsPercent(),0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("https://www.youtube.com/watch?v=9esWG6A6g-k", kit.play());
    }
}
