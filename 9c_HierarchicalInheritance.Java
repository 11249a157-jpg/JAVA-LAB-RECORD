# Experiment 9(c): Hierarchical Inheritance in Java

## Aim
To write a Java program to demonstrate hierarchical inheritance, where multiple child classes inherit from a single parent class.

## Algorithm
1. Start the program.
2. Create a parent class named `Animal` with a method to display a common message.
3. Create a child class named `Dog` that extends the `Animal` class.
4. Create another child class named `Cat` that extends the `Animal` class.
5. Define separate methods in the child classes.
6. Create objects of the `Dog` and `Cat` classes in the `main()` method.
7. Call the inherited method and the individual child-class methods.
8. Stop the program.

## Program

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
```

## Result
Thus, the Java program to demonstrate hierarchical inheritance using a single parent class and multiple child classes was implemented successfully.
