# Experiment 4(c): Multiplication Table in Java

## Aim
To write a Java program to print the multiplication table of a given number.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read a number from the user.
4. Use a `for` loop from 1 to 10.
5. Multiply the given number by each loop value.
6. Display the multiplication table.
7. Stop the program.

## Program

```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to print the multiplication table of a given number was implemented successfully.
