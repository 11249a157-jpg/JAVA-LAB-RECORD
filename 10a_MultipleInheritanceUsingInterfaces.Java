# Experiment 10(a): Multiple Inheritance Using Interfaces in Java

## Aim
To write a Java program to demonstrate multiple inheritance using interfaces.

## Algorithm
1. Start the program.
2. Create an interface named `Printable` with a method `print()`.
3. Create another interface named `Showable` with a method `show()`.
4. Create a class named `MultipleInheritance` that implements both interfaces.
5. Define the `print()` and `show()` methods in the class.
6. Create an object of the class in the `main()` method.
7. Call both methods using the object.
8. Stop the program.

## Program

```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class MultipleInheritance implements Printable, Showable {

    public void print() {
        System.out.println("Print method is executed.");
    }

    public void show() {
        System.out.println("Show method is executed.");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();

        obj.print();
        obj.show();
    }
}
```

## Result
Thus, the Java program to demonstrate multiple inheritance using interfaces was implemented successfully.
