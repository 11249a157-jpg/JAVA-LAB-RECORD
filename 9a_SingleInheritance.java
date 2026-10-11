# Experiment 9(a): Single Inheritance in Java

## Aim
To write a Java program to demonstrate single inheritance using a parent class and a child class.

## Algorithm
1. Start the program.
2. Create a parent class named `Animal` with a method to display a message.
3. Create a child class named `Dog` that extends the `Animal` class.
4. Define a method in the child class to display its own message.
5. Create an object of the child class in the `main()` method.
6. Call the methods of both the parent and child classes.
7. Stop the program.

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

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
```

## Result
Thus, the Java program to demonstrate single inheritance using a parent class and a child class was implemented successfully.
