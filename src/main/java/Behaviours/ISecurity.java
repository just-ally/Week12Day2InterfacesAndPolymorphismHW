package Behaviours;

import ThemeParkStuff.Visitor;

public interface ISecurity {

    public boolean isAllowedTo(Visitor visitor);
}
