# Experiment 2(a): Arithmetic Operations Using Switch

## Aim
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, and division using the switch statement.

## Algorithm
1. Start the program.
2. Import the Scanner class to read input from the user.
3. Read two numbers.
4. Display the menu of arithmetic operations.
5. Read the user's choice.
6. Use a switch statement to select the operation.
7. Perform addition, subtraction, multiplication, or division according to the choice.
8. Before division, check whether the second number is zero.
9. Display the result or an appropriate error message.
10. If the choice is invalid, display an invalid-choice message.
11. Stop the program.

## Program
```java id="q0xw4z"
import java.util.Scanner;

public class ArithmeticSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;

            case 2:
                System.out.println("Result: " + (a - b));
                break;

            case 3:
                System.out.println("Result: " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
```

## Result
Thus, the Java program to perform arithmetic operations using the switch statement was implemented successfully.
