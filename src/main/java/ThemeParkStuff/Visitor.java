package ThemeParkStuff;

public class Visitor {

    private String name;
    private int age;
    private double height;
    private double money;

    public Visitor(String name, int age, double height, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public double getMoney() {
        return this.money;
    }
}
