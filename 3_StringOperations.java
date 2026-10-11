# Experiment 3: String Operations in Java

## Aim
To write a Java program to perform various string operations such as finding the length, concatenating strings, comparing strings, converting case, and extracting a substring.

## Algorithm
1. Start the program.
2. Import the Scanner class.
3. Read two strings from the user.
4. Find and display the length of the first string.
5. Concatenate both strings and display the result.
6. Compare the two strings and display whether they are equal.
7. Convert the first string to uppercase and lowercase.
8. Extract and display a substring if the string is not empty.
9. Stop the program.

## Program

```java
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        System.out.println("Length of first string: " + str1.length());

        System.out.println("Concatenated string: " + str1.concat(str2));

        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        System.out.println("Uppercase: " + str1.toUpperCase());

        System.out.println("Lowercase: " + str1.toLowerCase());

        if (!str1.isEmpty()) {
            System.out.println("Substring: " + str1.substring(0, 1));
        } else {
            System.out.println("Substring cannot be extracted from an empty string.");
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to perform various string operations was implemented successfully.
