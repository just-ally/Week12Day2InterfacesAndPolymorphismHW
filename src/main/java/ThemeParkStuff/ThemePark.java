package ThemeParkStuff;

import Attractions.Attraction;
import Attractions.Dodgems;
import Attractions.Rollercoaster;
import Behaviours.IReviewed;
import Behaviours.ITicketed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public int countAttractions() {
        return this.attractions.size();
    }

    public int countStalls() {
        return this.stalls.size();
    }

    public String visit(Visitor visitor, Attraction attraction) {
        return visitor.getName() + " is visiting " + attraction.getName();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> allReviewed = new ArrayList<IReviewed>();
        for (Attraction attraction : this.attractions) {
            allReviewed.add(attraction);
        }
        for (Stall stall : this.stalls) {
            allReviewed.add(stall);
        }
        return allReviewed;
    }


    // question doesn't make sense!!

//    public double getAllAllowed(Visitor visitor) {
//    }

    public String returnAllReviewData() {
        String reviewData = "";
        for (Attraction attraction : this.attractions) {
            reviewData += attraction.getName() + ": " + attraction.getRating() + ", ";
        }
        for (Stall stall : this.stalls) {
            reviewData += stall.getName() + ": " + stall.getRating() + ", ";
        }
        return reviewData;
    }
}
