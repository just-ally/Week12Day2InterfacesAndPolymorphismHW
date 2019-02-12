import Attractions.Playground;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before() {
        playground = new Playground("swings", 4);
    }

    @Test
    public void hasName() {
        assertEquals("swings", playground.getName());
    }

    @Test
    public void canCheckAge() {
        Visitor visitor = new Visitor("Velma",21, 1.7, 35);
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void hasRating() {
        assertEquals(4, playground.getRating());
    }
}
