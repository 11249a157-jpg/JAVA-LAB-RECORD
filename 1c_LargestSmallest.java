# Experiment 1(c): Largest and Smallest Numbers

## Aim
To write a Java program to find the largest and smallest numbers in a given array of integers.

## Algorithm
1. Start the program.
2. Import the Scanner class to read input from the user.
3. Read the number of elements.
4. Check whether the number of elements is positive.
5. Declare an integer array and read its elements.
6. Initialize the largest and smallest variables with the first array element.
7. Traverse the remaining elements of the array.
8. If an element is greater than the largest value, update the largest value.
9. If an element is smaller than the smallest value, update the smallest value.
10. Display the largest and smallest numbers.
11. Stop the program.

## Program
```java
import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number of elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        sc.close();
    }
}
```

## Result
Thus, the Java program to find the largest and smallest numbers in a given array was implemented successfully.
