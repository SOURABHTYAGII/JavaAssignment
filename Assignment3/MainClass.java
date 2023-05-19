
class ParentClass {

    public void display() {
        System.out.println("Parent Class: Default display method");// Method overloading
    }

    public void display(int number) {
        System.out.println("Parent Class: display method with number: " + number);
    }
}
class ChildClass extends ParentClass { // Child class with method overriding

    @Override  // Method overriding
    public void display() {
        System.out.println("Child Class: Overridden display method");
    }
}


public class MainClass { // Main class
    public static void main(String[] args) {

        ParentClass parentObject = new ParentClass();  // Create an object of ParentClass

        parentObject.display(); // Call the overloaded methods of ParentClass
        parentObject.display(5);

        System.out.println();

        ChildClass childObject = new ChildClass(); // Create an object of ChildClass

        childObject.display();    // Call the overridden method of ChildClass
    }
}
