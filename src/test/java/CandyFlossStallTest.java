import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Candy", "Larry", "C3", 8);
    }

    @Test
    public void hasName() {
        assertEquals("Candy", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Larry", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("C3", candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01);
    }

    @Test
    public void hasRating() {
        assertEquals(8, candyFlossStall.getRating());
    }
}
