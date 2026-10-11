# Experiment 10(b): Hybrid Inheritance Using Interfaces in Java

## Aim
To write a Java program to demonstrate hybrid inheritance using interfaces in Java.

## Algorithm
1. Start the program.
2. Create an interface named `Animal` with a method `eat()`.
3. Create an interface named `Pet` that extends the `Animal` interface and declares a method `play()`.
4. Create a class named `Dog` that implements the `Pet` interface.
5. Create a class named `Puppy` that extends the `Dog` class.
6. Implement the interface methods and define a method in the child class.
7. Create an object of the `Puppy` class in the `main()` method.
8. Call the inherited and implemented methods.
9. Stop the program.

## Program

```java id="b6z9xa"
interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void play() {
        System.out.println("Dog is playing.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class HybridInheritance extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }

    public static void main(String[] args) {
        HybridInheritance puppy = new HybridInheritance();

        puppy.eat();
        puppy.play();
        puppy.bark();
        puppy.weep();
    }
}
```

## Result
Thus, the Java program to demonstrate hybrid inheritance using interfaces was implemented successfully.
