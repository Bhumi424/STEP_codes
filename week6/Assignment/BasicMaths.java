public // HW PROBLEM 5: Math Operations Inheritance

class BasicMath {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a + b;
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

public class AdvancedMath extends BasicMath {
    public double calculate(double a, double b, double c) {
        return a * b * c;
    }

    public int calculate(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static void main(String[] args) {
        AdvancedMath math = new AdvancedMath();

        System.out.println("Add int: " + math.calculate(5, 10));
        System.out.println("Add double: " + math.calculate(3.5, 2.5));
        System.out.println("Add three int: " + math.calculate(1, 2, 3));
        System.out.println("Multiply three double: " + math.calculate(2.0, 3.0, 4.0));
        System.out.println("Multiply four int: " + math.calculate(2, 3, 4, 5));
    }
}
 {
    
}
