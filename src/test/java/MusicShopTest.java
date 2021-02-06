import behaviours.ForSale;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MusicShopTest {

    MusicShop ricks;
    ForSale guitar;
    ForSale guitar2;
    ForSale guitar3;
    ForSale accessory;
    ForSale sticks;

    @Before
    public void before() {
        ricks = new MusicShop("Ricks", 500);
        guitar = new Guitar(InstrumentType.GUITAR, "Acoustic", 75, 100, "Mahogany", 6, "Natural");
        guitar2 = new Guitar(InstrumentType.GUITAR, "Electric", 150, 200, "Birch", 8, "Red");
        guitar3 = new Guitar(InstrumentType.GUITAR, "Electric Bass", 125, 140, "Mahogany", 4, "SunBurst");
        accessory = new Accessory(6, 8.50, "Guitar Strap", "Fender", "Guitar");
        sticks = new Accessory(10, 12.50, "Drum Sticks", "Vic Firth", "Drums");
        ricks.addToStock(guitar);
        ricks.addToStock(guitar2);
        ricks.addToStock(guitar3);
        ricks.addToStock(accessory);
        ricks.addToStock(sticks);
    }

    @Test
    public void exists() {
        assertNotNull(ricks);
    }

    @Test
    public void canGetName() {
        assertEquals("Ricks", ricks.getName());
    }

    @Test
    public void canGetTill() {
        assertEquals(500, ricks.getTill(),0);
    }

    @Test
    public void hasEmptyStock() {
        assertEquals(0, ricks.getStock().size());
    }

    @Test
    public void hasStock() {
        assertEquals(5, ricks.getStock().size());
    }

    @Test
    public void canGetTotalPotentialProfits() {
        assertEquals(95, ricks.getPotentialProfits(),0);
    }

    @Test
    public void canFindInstrumentInStock() {
        assertEquals("Instrument in stock!", ricks.findItem(InstrumentType.GUITAR));
        assertEquals("Out of stock", ricks.findItem(InstrumentType.KEYS));
    }
}
