# Experiment 1: Sort Numbers in Ascending Order

## Aim
To write a Java program to sort a given set of integers in ascending order using the Bubble Sort technique.

## Algorithm
1. Start the program.
2. Import the Scanner class to read input from the user.
3. Read the number of elements.
4. Declare an integer array and read its elements.
5. Compare adjacent elements using nested loops.
6. If the current element is greater than the next element, swap them.
7. Repeat the comparisons until the array is sorted.
8. Display the elements in ascending order.
9. Stop the program.

## Program
```java
import java.util.Scanner;

public class SortAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Elements in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to sort the given integers in ascending order using the Bubble Sort technique was implemented successfully.
