import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Kelvingrove", 9);
    }

    @Test
    public void hasName() {
        assertEquals("Kelvingrove", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating());
    }

}
