```java
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Arithmetic obj = new Arithmetic();

        System.out.println("Addition: " + obj.add(a, b));
        System.out.println("Subtraction: " + obj.subtract(a, b));
        System.out.println("Multiplication: " + obj.multiply(a, b));
        System.out.println("Division: " + obj.divide(a, b));

        sc.close();
    }
}
```
