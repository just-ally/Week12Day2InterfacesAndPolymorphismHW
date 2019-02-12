package Stalls;

import Behaviours.ISecurity;
import ThemeParkStuff.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private double price;

    public TobaccoStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.price = 6.60;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 21) {
            return true;
        }
        return false;
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        return this.price;
    }
}
