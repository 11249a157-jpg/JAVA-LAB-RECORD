# Experiment 4(a): Armstrong Number in Java

## Aim
To write a Java program to check whether a given number is an Armstrong number.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read an integer from the user.
4. Store the original number and count its digits.
5. Extract each digit and calculate the sum of each digit raised to the power of the number of digits.
6. Compare the calculated sum with the original number.
7. If both are equal, display that the number is an Armstrong number; otherwise, display that it is not.
8. Stop the program.

## Program

```java
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = Math.abs(num);
        int digits = String.valueOf(temp).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if (num >= 0 && sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to check whether a given number is an Armstrong number was implemented successfully.
