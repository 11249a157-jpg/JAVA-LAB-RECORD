# Experiment 4(b): Fibonacci Series in Java

## Aim
To write a Java program to generate the Fibonacci series for a given number of terms.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read the number of terms from the user.
4. Initialize the first two Fibonacci numbers as 0 and 1.
5. Use a loop to generate the series by adding the previous two numbers.
6. Display each number in the Fibonacci series.
7. Stop the program.

## Program

```java
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        if (n <= 0) {
            System.out.println("Enter a positive number of terms.");
        } else {
            System.out.println("Fibonacci Series:");

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to generate the Fibonacci series for a given number of terms was implemented successfully.
