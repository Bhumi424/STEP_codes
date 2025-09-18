// HW PROBLEM 1: Light and LED Multiple Constructors

class Light {
    protected int watt;
    protected String color;

    // Default constructor
    public Light() {
        this(0, "Unknown");
        System.out.println("Light default constructor called");
    }

    // Parameterized constructor (1 arg)
    public Light(int watt) {
        this(watt, "White");
        System.out.println("Light single-parameter constructor called");
    }

    // Parameterized constructor (2 args)
    public Light(int watt, String color) {
        this.watt = watt;
        this.color = color;
        System.out.println("Light two-parameter constructor called");
    }
}

public class LED extends Light {
    private String type;

    // Default constructor
    public LED() {
        this(5, "White", "Standard");
        System.out.println("LED default constructor called");
    }

    // Parameterized constructor (2 args)
    public LED(int watt, String color) {
        super(watt, color);
        this.type = "Standard";
        System.out.println("LED two-parameter constructor called");
    }

    // Parameterized constructor (3 args)
    public LED(int watt, String color, String type) {
        super(watt, color);
        this.type = type;
        System.out.println("LED three-parameter constructor called");
    }

    public void display() {
        System.out.println("LED -> Watt: " + watt + ", Color: " + color + ", Type: " + type);
    }

    public static void main(String[] args) {
        LED led1 = new LED();
        led1.display();

        System.out.println();

        LED led2 = new LED(10, "Yellow");
        led2.display();

        System.out.println();

        LED led3 = new LED(15, "Blue", "Smart");
        led3.display();
    }
}
