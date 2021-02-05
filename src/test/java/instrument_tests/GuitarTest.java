package instrument_tests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

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


}
