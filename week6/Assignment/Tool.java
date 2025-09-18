public // HW PROBLEM 2: Tool Access Levels

class Tool {
    private String privateName = "PrivateTool";
    protected String protectedName = "ProtectedTool";
    public String publicName = "PublicTool";

    public String getPrivateName() {
        return privateName;
    }
}

public class Hammer extends Tool {
    public void showAccess() {
        // System.out.println(privateName); // ❌ Not accessible directly
        System.out.println("Private field (via getter): " + getPrivateName()); // ✅

        System.out.println("Protected field: " + protectedName); // ✅
        System.out.println("Public field: " + publicName);       // ✅
    }

    public static void main(String[] args) {
        Hammer hammer = new Hammer();
        hammer.showAccess();
    }
}
 {
    
}
