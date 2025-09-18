public // Practice Problem 2

// Parent class
class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class 1
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // call Animal constructor
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    public void displayInfo() {
        System.out.println("Dog -> Name: " + name + ", Age: " + age + ", Breed: " + breed);
    }

    // main method here
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        dog.eat();
        dog.bark();
        dog.sleep();

        Cat cat = new Cat("Whiskers", 2, "White");
        cat.displayInfo();
        cat.eat();
        cat.meow();
        cat.sleep();
    }
}

// Child class 2
class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age); // call Animal constructor
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating cat food.");
    }

    public void displayInfo() {
        System.out.println("Cat -> Name: " + name + ", Age: " + age + ", Color: " + color);
    }
}
 {
    
}
