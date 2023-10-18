// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of the child class
        Dog myDog = new Dog();

        // Calling methods from both parent and child classes
        myDog.eat(); // Inherited from Animal class
        myDog.bark(); // Specific to Dog class
    }
}