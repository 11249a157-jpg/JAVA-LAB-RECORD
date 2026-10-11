# Experiment 4(d): Perfect Number in Java

## Aim
To write a Java program to check whether a given number is a perfect number.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read an integer from the user.
4. Initialize the sum to zero.
5. Find all proper divisors of the number, excluding the number itself.
6. Add the proper divisors to the sum.
7. Compare the sum with the original number.
8. If both are equal and the number is positive, display that it is a perfect number; otherwise, display that it is not.
9. Stop the program.

## Program

```java
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        if (num > 1) {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
        }

        if (num > 0 && sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to check whether a given number is a perfect number was implemented successfully.
