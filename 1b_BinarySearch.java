# Experiment 1(b): Binary Search

## Aim
To write a Java program to search for a given element in a sorted array using the Binary Search technique.

## Algorithm
1. Start the program.
2. Import the Scanner class to read input from the user.
3. Read the number of elements.
4. Read the array elements in sorted order.
5. Read the element to be searched.
6. Initialize `low` to 0 and `high` to `n - 1`.
7. Calculate the middle index using `mid = low + (high - low) / 2`.
8. If the middle element equals the search element, display its position and stop searching.
9. If the middle element is smaller than the search element, update `low` to `mid + 1`.
10. Otherwise, update `high` to `mid - 1`.
11. Repeat steps 7–10 while `low <= high`.
12. If the element is not found, display an appropriate message.
13. Stop the program.

## Program
```java
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int mid;
        int position = -1;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                position = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (position != -1) {
            System.out.println("Element found at position: " + (position + 1));
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to search for an element in a sorted array using the Binary Search technique was implemented successfully.
