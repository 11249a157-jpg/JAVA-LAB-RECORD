# Experiment 4(e): Reverse Number in Java

## Aim
To write a Java program to reverse the digits of a given integer.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read an integer from the user.
4. Store the original number and initialize the reversed number to zero.
5. Extract the last digit using the modulo operator.
6. Append the digit to the reversed number and remove the last digit from the original number.
7. Repeat until all digits are processed.
8. Display the reversed number.
9. Stop the program.

## Program

```java
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (num < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
```

## Result
Thus, the Java program to reverse the digits of a given integer was implemented successfully.
