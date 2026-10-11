# Experiment 9(b): Multilevel Inheritance in Java

## Aim
To write a Java program to demonstrate multilevel inheritance using three classes.

## Algorithm
1. Start the program.
2. Create a class named `Animal` with a method to display a message.
3. Create a class named `Dog` that extends the `Animal` class.
4. Create a class named `Puppy` that extends the `Dog` class.
5. Define methods in the classes to display their respective messages.
6. Create an object of the `Puppy` class in the `main()` method.
7. Call the methods inherited from the parent classes and the method of the child class.
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

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}
```

## Result
Thus, the Java program to demonstrate multilevel inheritance using three classes was implemented successfully.
