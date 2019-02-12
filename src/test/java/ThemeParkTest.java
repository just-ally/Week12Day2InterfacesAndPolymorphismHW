import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import ThemeParkStuff.ThemePark;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    Dodgems dodgems;
    Park park;
    Playground playground;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    CandyFlossStall candyFlossStall;
    Visitor visitor;

    @Before
    public void before() {
        themePark = new ThemePark();
        rollercoaster = new Rollercoaster("Nemesis", 10);
        dodgems = new Dodgems("No.1 Dodgems", 7);
        park = new Park("Kelvingrove", 9);
        playground = new Playground("Swings", 4);
        iceCreamStall = new IceCreamStall("Desserts", "Harry", "A1", 8);
        tobaccoStall = new TobaccoStall("Smokes", "Barry", "B2", 3);
        candyFlossStall = new CandyFlossStall("Candy", "Larry", "C3", 5);
        visitor = new Visitor("Velma",21, 1.7, 35);

        themePark.addAttraction(rollercoaster);
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
        themePark.addStall(candyFlossStall);
    }

    @Test
    public void canCountAttractions() {
        assertEquals(4, themePark.countAttractions());
    }

    @Test
    public void canCountStalls() {
        assertEquals(3, themePark.countStalls());
    }

    @Test
    public void visitorsCanVisitAttractions() {
        assertEquals("Velma is visiting Nemesis", themePark.visit(visitor, rollercoaster));
    }

    @Test
    public void canReturnAllReviewed() {
        assertEquals(7, themePark.getAllReviewed().size());
    }


    // didn't complete this one - question didn't make sense to me!
//    @Test
//    public void canReturnAllAllowedPerVisitor() {
//
//    }


    @Test
    public void canReturnStringOfAllReviews() {
        assertEquals("Nemesis: 10, No.1 Dodgems: 7, Kelvingrove: 9, Swings: 4, Desserts: 8, Smokes: 3, Candy: 5, ", themePark.returnAllReviewData());
    }
}
