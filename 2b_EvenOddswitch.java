# Experiment 2(b): Even or Odd Using Switch

## Aim
To write a Java program to check whether a given integer is even or odd using the switch statement.

## Algorithm
1. Start the program.
2. Import the Scanner class to read input from the user.
3. Read an integer.
4. Calculate the remainder when the integer is divided by 2.
5. Use the switch statement to check the remainder.
6. If the remainder is 0, display that the number is even.
7. If the remainder is 1 or -1, display that the number is odd.
8. Stop the program.

## Program
```java id="5n2k8p"
import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        switch (Math.abs(number % 2)) {
            case 0:
                System.out.println(number + " is even.");
                break;

            case 1:
                System.out.println(number + " is odd.");
                break;
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to check whether a given integer is even or odd using the switch statement was implemented successfully.
