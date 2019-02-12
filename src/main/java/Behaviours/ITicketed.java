package Behaviours;

import ThemeParkStuff.Visitor;

public interface ITicketed {

    public double defaultPrice();

    public double priceFor(Visitor visitor);
}
