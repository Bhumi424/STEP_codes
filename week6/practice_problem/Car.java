// File: Vehicle.java
import java.util.UUID;

public class Vehicle {
    // Protected fields (accessible in subclasses)
    protected String brand;
    protected String model;
    protected int year;
    protected String engineType;

    // Private fields (getter/setter only)
    private String registrationNumber;
    private boolean isRunning;

    // Default constructor
    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.engineType = "Unknown";
        this.registrationNumber = UUID.randomUUID().toString();
        this.isRunning = false;
        System.out.println("Vehicle default constructor called");
    }

    // Parameterized constructor
    public Vehicle(String brand, String model, int year, String engineType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.registrationNumber = UUID.randomUUID().toString();
        this.isRunning = false;
        System.out.println("Vehicle parameterized constructor called");
    }

    // Methods
    public void start() {
        isRunning = true;
        System.out.println("Vehicle started");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Vehicle stopped");
    }

    public String getVehicleInfo() {
        return "Brand: " + brand + ", Model: " + model +
               ", Year: " + year + ", Engine: " + engineType +
               ", Reg#: " + registrationNumber +
               ", Running: " + isRunning;
    }

    public void displaySpecs() {
        System.out.println("Vehicle Specs -> Brand: " + brand +
                           ", Model: " + model +
                           ", Year: " + year +
                           ", Engine: " + engineType);
    }

    // Getter/Setter
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isRunning() {
        return isRunning;
    }
}

// File: Car.java
public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;
    private String transmissionType;

    // Default constructor
    public Car() {
        super(); // calls Vehicle default constructor
        this.numberOfDoors = 4;
        this.fuelType = "Petrol";
        this.transmissionType = "Manual";
        System.out.println("Car default constructor called");
    }

    // Parameterized constructor
    public Car(String brand, String model, int year, String engineType,
               int numberOfDoors, String fuelType, String transmissionType) {
        super(brand, model, year, engineType); // calls Vehicle parameterized constructor
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        System.out.println("Car parameterized constructor called");
    }

    // Override start()
    @Override
    public void start() {
        super.start();
        System.out.println("Car-specific startup sequence running...");
    }

    // Override displaySpecs()
    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Car Specs -> Doors: " + numberOfDoors +
                           ", Fuel: " + fuelType +
                           ", Transmission: " + transmissionType);
    }

    // Car-specific methods
    public void openTrunk() {
        System.out.println("Trunk opened");
    }

    public void playRadio() {
        System.out.println("Radio playing music");
    }

    // Main test
    public static void main(String[] args) {
        System.out.println("\n--- Testing default constructor ---");
        Car car1 = new Car();
        car1.displaySpecs();
        car1.start();
        car1.stop();

        System.out.println("\n--- Testing parameterized constructor ---");
        Car car2 = new Car("Toyota", "Corolla", 2022, "Hybrid", 4, "Petrol", "Automatic");
        car2.displaySpecs();
        car2.start();
        car2.openTrunk();
        car2.playRadio();
        System.out.println("Vehicle Info: " + car2.getVehicleInfo());
    }
}
