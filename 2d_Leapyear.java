# Experiment 2(d): Leap Year

## Aim
To write a Java program to check whether a given year is a leap year using the switch statement.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read a year from the user.
4. Check whether the year is divisible by 400, or divisible by 4 but not by 100.
5. Use a switch statement to display whether the year is a leap year.
6. Stop the program.

## Program

```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        switch ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 1 : 0) {
            case 1:
                System.out.println(year + " is a leap year.");
                break;

            case 0:
                System.out.println(year + " is not a leap year.");
                break;
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to check whether a given year is a leap year using the switch statement was implemented successfully.
