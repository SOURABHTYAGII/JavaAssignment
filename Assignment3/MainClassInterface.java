interface MyInterface { // Interface
    void display();
    void printMessage();
}
class MyClass implements MyInterface { // Class implementing the interface
    @Override
    public void display() {
        System.out.println("This is the implementation of the display method.");
    }
    @Override
    public void printMessage() {
        System.out.println("This is the implementation of the printMessage method.");
    }
}public class MainClassInterface { // Main class
    public static void main(String[] args) {

        MyClass myObject = new MyClass(); // Create an object of the MyClass

        myObject.display();    // Call the interface methods
        myObject.printMessage();
    }
}

