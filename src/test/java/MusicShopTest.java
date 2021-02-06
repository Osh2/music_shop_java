import org.junit.Before;
import org.junit.Test;

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
}
