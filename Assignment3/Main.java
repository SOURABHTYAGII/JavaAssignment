abstract class AbstractClass {

    public abstract void display();  // Abstract method
    public void printMessage() {  // Concrete method
        System.out.println("This is a concrete method.");
    }
}

class ConcreteClass extends AbstractClass { // Concrete class extending the abstract class
    @Override   // Implementing the abstract method from the abstract class
    public void display() {
        System.out.println("This is the implementation of the abstract method.");
    }
}
public class Main { // Main class
    public static void main(String[] args) {

        ConcreteClass concreteObject = new ConcreteClass();  // Create an object of the ConcreteClass
        concreteObject.display(); // Call the abstract method and concrete method
        concreteObject.printMessage();
    }
}
