import behaviours.ForSale;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MusicShopTest {

    MusicShop ricks;

    @Before
    public void before(){
        ricks = new MusicShop("Ricks", 500);
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
        ForSale guitar = new Guitar(InstrumentType.GUITAR, "Acoustic", 75, 100, "Mahogany", 6, "Natural");
        ricks.addToStock(guitar);
        assertEquals(1, ricks.getStock().size());
    }
}
