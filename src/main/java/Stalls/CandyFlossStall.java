package Stalls;

import Behaviours.ITicketed;
import ThemeParkStuff.Visitor;

public class CandyFlossStall extends Stall implements ITicketed {

    private double price;

    public CandyFlossStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.price = 4.20;
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        return this.price;
    }


}
