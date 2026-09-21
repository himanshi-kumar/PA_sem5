// Demonstrating Core OOP Principles in Java:
// 1. Encapsulation
// 2. Inheritance
// 3. Polymorphism (Method Overriding)
// 4. Abstraction

// Abstraction: abstract class with abstract and concrete methods
abstract class Animal {
    private String name; // Encapsulation: private variable with getters/setters

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be overridden by child classes
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Inheritance: Dog extends Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Polymorphism: Overriding parent method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

// Another child class showing polymorphism
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow Meow!");
    }
}

public class OOPPrinciples {
    public static void main(String[] args) {
        // Polymorphism in action: Animal reference pointing to Dog and Cat objects
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        cat.sleep();
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
