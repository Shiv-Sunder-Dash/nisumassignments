package DAY_1;
class Q6_Parent {
    public static void displayMessage() {
        System.out.println("Static method in Parent class");
    }
}
class Child extends Q6_Parent {
    public void callParentMethod() {
        Q6_Parent.displayMessage();
        displayMessage();
    }
}
class Main {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.callParentMethod();
    }
}
