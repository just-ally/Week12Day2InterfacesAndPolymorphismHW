package Attractions;

import Behaviours.ISecurity;
import Behaviours.ITicketed;
import ThemeParkStuff.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    private double price;

    public Rollercoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 1.45) {
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
