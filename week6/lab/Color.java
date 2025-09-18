public // LAB PROBLEM 4: Color Hierarchy Chain

class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
        System.out.println("Color constructor called");
    }

    public void display() {
        System.out.println("Color -> Name: " + name);
    }
}

class PrimaryColor extends Color {
    protected int intensity;

    public PrimaryColor(String name, int intensity) {
        super(name);
        this.intensity = intensity;
        System.out.println("PrimaryColor constructor called");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("PrimaryColor -> Intensity: " + intensity);
    }
}

public class RedColor extends PrimaryColor {
    private String shade;

    public RedColor(String name, int intensity, String shade) {
        super(name, intensity);
        this.shade = shade;
        System.out.println("RedColor constructor called");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("RedColor -> Shade: " + shade);
    }

    public static void main(String[] args) {
        RedColor red = new RedColor("Red", 90, "Dark Red");
        red.display();
    }
}
 {
    
}
