package DAY_1;

 class Q6_Parent {
    public static void displayMessage() {
        System.out.println("Static method in Parent class");
    }
}

// Child class extending Parent
class Child extends Q6_Parent {
    public void callParentMethod() {
        // Accessing static method using class name (best practice)
        Q6_Parent.displayMessage();

        // Also valid (not recommended): using inheritance
        displayMessage();  // Still works, but can be confusing
    }
}

// Main class to run the program
 class Main {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.callParentMethod();
    }
}
