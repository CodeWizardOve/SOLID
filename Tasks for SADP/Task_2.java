
class Animal {
    protected String name; // Variable declaration with access modifier
    
    public Animal(String name) { // Constructor with parameter
        this.name = name;
    }
    
    public void sleep() { // Method without parameters
        System.out.println(name + " is sleeping.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    private int age; // Variable declaration
    
    public Dog(String name, int age) { // Constructor with parameters
        super(name); // Calling superclass constructor
        this.age = age;
    }
    
    public void bark() { // Method without parameters
        System.out.println("Woof!");
    }
    
    public void play(String toy) { // Method with parameter
        System.out.println(name + " is playing with " + toy + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Object creation
        Dog dog = new Dog("Buddy", 2);
        
        // Accessing inherited variable
        System.out.println("Name: " + dog.name);
        
        // Accessing variable of child class
        System.out.println("Age: " + dog.age);
        
        // Accessing inherited method
        dog.sleep();
        
        // Accessing method of child class
        dog.bark();
        
        // Accessing method with parameter
        dog.play("ball");
    }
}
