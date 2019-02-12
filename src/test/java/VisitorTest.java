import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor("Velma",21, 1.7, 35);
    }

    @Test
    public void hasName() {
        assertEquals("Velma", visitor.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(21, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.7, visitor.getHeight(), 0.01);
    }

    @Test
    public void hasMoney() {
        assertEquals(35, visitor.getMoney(), 0.01);
    }
}
