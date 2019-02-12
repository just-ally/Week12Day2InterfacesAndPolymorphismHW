import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Desserts", "Harry", "A1", 6);
    }

    @Test
    public void hasName() {
        assertEquals("Desserts", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Harry", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("A1", iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.01);
    }

    @Test
    public void hasRating() {
        assertEquals(6, iceCreamStall.getRating());
    }
}
