import Attractions.Rollercoaster;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Nemesis", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Nemesis", rollercoaster.getName());
    }

    @Test
    public void canCheckVisitorsCanRide() {
        Visitor visitor = new Visitor("Velma",21, 1.7, 35);
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargesTallPeopleDouble() {
        Visitor visitor = new Visitor("Velma",21, 2.05, 35);
        assertEquals(16.80, rollercoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollercoaster.getRating());
    }
}
