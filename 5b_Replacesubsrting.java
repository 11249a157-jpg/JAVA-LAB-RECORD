# Experiment 5(b): Replace Substring in Java

## Aim
To write a Java program to replace a substring in a given string using the `replace()` method.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read a string from the user.
4. Read the substring to be replaced.
5. Read the new substring.
6. Use the `replace()` method to replace all occurrences of the old substring with the new substring.
7. Display the modified string.
8. Stop the program.

## Program

```java
import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldSub = sc.nextLine();

        System.out.print("Enter the new substring: ");
        String newSub = sc.nextLine();

        String result = str.replace(oldSub, newSub);

        System.out.println("Modified string: " + result);

        sc.close();
    }
}
```

## Result
Thus, the Java program to replace a substring in a given string using the `replace()` method was implemented successfully.
