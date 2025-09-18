public // LAB PROBLEM 3: Bird Flying Behavior

class Bird {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguin cannot fly, it swims instead.");
    }
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class BirdTest {
    public static void main(String[] args) {
        Bird[] birds = { new Bird(), new Penguin(), new Eagle() };

        for (Bird b : birds) {
            b.fly(); // polymorphism in action
        }
    }
}
 {
    
}
