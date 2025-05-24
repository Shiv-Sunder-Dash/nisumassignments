package DAY_1;
class BaseClass {
    private String privateVar = "Private";
    String defaultVar = "Default";
    protected String protectedVar = "Protected";
    public String publicVar = "Public";
    static {
        System.out.println("Static block in BaseClass");
    }
    public void show() {
        System.out.println(privateVar + ", " + defaultVar + ", " + protectedVar + ", " + publicVar);
    }
}
class DerivedClass extends BaseClass {
    static {
        System.out.println("Static block in DerivedClass");
    }
    public void accessBaseVars() {
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
public class Q17_CoreJavaConcepts {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.accessBaseVars();
        obj.show();
    }
}

