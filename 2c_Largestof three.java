# Experiment 2(c): Largest of Three Numbers

## Aim
To write a Java program to find the largest among three integers using the switch statement.

## Algorithm
1. Start the program.
2. Import the Scanner class to read input from the user.
3. Read three integers.
4. Compare the three integers to determine which one is the largest.
5. Use the switch statement to select the largest number.
6. Display the largest number.
7. Stop the program.

## Program
```java
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        switch ((a >= b && a >= c) ? 1 : (b >= c ? 2 : 3)) {
            case 1:
                System.out.println("Largest number: " + a);
                break;

            case 2:
                System.out.println("Largest number: " + b);
                break;

            case 3:
                System.out.println("Largest number: " + c);
                break;
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to find the largest among three integers using the switch statement was implemented successfully.
