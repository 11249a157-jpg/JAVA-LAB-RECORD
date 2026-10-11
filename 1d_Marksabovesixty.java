# Experiment 1(d): Marks Above Sixty

## Aim
To write a Java program to read the marks of students and display the marks of students who scored above 60.

## Algorithm
1. Start the program.
2. Import the Scanner class to read input from the user.
3. Read the number of students.
4. Check whether the number of students is positive.
5. Declare an integer array to store the marks.
6. Read the marks of all students.
7. Traverse the array and check whether each student's marks are greater than 60.
8. Display the student number and marks for every student who scored above 60.
9. If no student scored above 60, display an appropriate message.
10. Stop the program.

## Program
```java
import java.util.Scanner;

public class MarksAboveSixty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number of students.");
            sc.close();
            return;
        }

        int[] marks = new int[n];

        System.out.println("Enter the marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Students scoring above 60 marks:");
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (marks[i] > 60) {
                System.out.println("Student " + (i + 1) + ": " + marks[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students scored above 60 marks.");
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to display the marks of students who scored above 60 was implemented successfully.
