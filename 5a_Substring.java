# Experiment 5(a): Substring in Java

## Aim
To write a Java program to extract a substring from a given string using the `substring()` method.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read a string from the user.
4. Read the starting and ending indexes for the substring.
5. Check whether the indexes are valid.
6. Use the `substring()` method to extract the substring.
7. Display the extracted substring.
8. Stop the program.

## Program

```java
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter starting index: ");
        int start = sc.nextInt();

        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        if (start >= 0 && start < end && end <= str.length()) {
            String result = str.substring(start, end);
            System.out.println("Substring: " + result);
        } else {
            System.out.println("Invalid indexes.");
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to extract a substring from a given string using the `substring()` method was implemented successfully.
