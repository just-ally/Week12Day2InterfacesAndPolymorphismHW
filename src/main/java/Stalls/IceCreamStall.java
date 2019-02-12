package Stalls;

import ThemeParkStuff.Visitor;

public class IceCreamStall extends Stall {

    private double price;

    public IceCreamStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.price = 2.80;
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        return this.price;
    }
}
