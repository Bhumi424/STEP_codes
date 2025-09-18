public // LAB PROBLEM 2: Phone and SmartPhone

class Phone {
    protected String brand;
    protected String model;

    public Phone() {
        this.brand = "Unknown";
        this.model = "Unknown";
        System.out.println("Phone default constructor called");
    }

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Phone parameterized constructor called");
    }
}

public class SmartPhone extends Phone {
    private String operatingSystem;

    public SmartPhone() {
        super();
        this.operatingSystem = "Unknown";
        System.out.println("SmartPhone default constructor called");
    }

    public SmartPhone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
        System.out.println("SmartPhone parameterized constructor called");
    }

    public void displayInfo() {
        System.out.println("SmartPhone -> Brand: " + brand + ", Model: " + model + ", OS: " + operatingSystem);
    }

    public static void main(String[] args) {
        System.out.println("--- Using default constructor ---");
        SmartPhone s1 = new SmartPhone();
        s1.displayInfo();

        System.out.println("\n--- Using parameterized constructor ---");
        SmartPhone s2 = new SmartPhone("Samsung", "Galaxy S22", "Android");
        s2.displayInfo();
    }
}
 
    

