import Stalls.TobaccoStall;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Smokes", "Barry", "B2", 3);
    }

    @Test
    public void hasName() {
        assertEquals("Smokes", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Barry", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("B2", tobaccoStall.getParkingSpot());
    }

    @Test
    public void canCheckAge() {
        Visitor visitor = new Visitor("Velma",21, 1.7, 35);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(6.60, tobaccoStall.defaultPrice(), 0.01);
    }

    @Test
    public void hasRating() {
        assertEquals(3, tobaccoStall.getRating());
    }
}
