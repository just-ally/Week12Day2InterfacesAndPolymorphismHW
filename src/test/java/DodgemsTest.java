import Attractions.Dodgems;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before() {
        dodgems = new Dodgems("No.1 Dodgems", 7);
    }

    @Test
    public void hasName() {
        assertEquals("No.1 Dodgems", dodgems.getName());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void chargesChildrenHalfPrice() {
        Visitor visitor = new Visitor("Velma",11, 1.2, 5);
        assertEquals(2.25, dodgems.priceFor(visitor), 0.01);
    }

    @Test
    public void hasRating() {
        assertEquals(7, dodgems.getRating());
    }
}
