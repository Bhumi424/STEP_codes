// LAB PROBLEM 1: Fruit and Apple Classes

class Fruit {
    protected String color;
    protected String taste;

    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    public void displayInfo() {
        System.out.println("Fruit -> Color: " + color + ", Taste: " + taste);
    }
}

public class Apple extends Fruit {
    private String variety;

    public Apple(String color, String taste, String variety) {
        super(color, taste); // call Fruit constructor
        this.variety = variety;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Apple -> Variety: " + variety);
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet", "Fuji");
        apple.displayInfo();
    }
}
