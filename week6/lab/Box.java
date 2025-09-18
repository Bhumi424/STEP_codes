public // LAB PROBLEM 6: Box and Gift Box Enhancement

class Box {
    public void pack() {
        System.out.println("Packing the box.");
    }

    public void unpack() {
        System.out.println("Unpacking the box.");
    }
}

public class GiftBox extends Box {
    @Override
    public void pack() {
        super.pack(); // parent behavior
        System.out.println("Adding ribbon and decoration for GiftBox.");
    }

    @Override
    public void unpack() {
        super.unpack(); // parent behavior
        System.out.println("Removing wrapping paper for GiftBox.");
    }

    public static void main(String[] args) {
        GiftBox gift = new GiftBox();
        gift.pack();
        gift.unpack();
    }
}
 {
    
}
