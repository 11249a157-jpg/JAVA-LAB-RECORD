# Experiment 7: Multithreading in Java

## Aim
To write a Java program to demonstrate multithreading by creating and executing multiple threads.

## Algorithm
1. Start the program.
2. Create a class named `MyThread` that extends the `Thread` class.
3. Override the `run()` method to display a message from the thread.
4. Create another class named `Multithreading` containing the `main()` method.
5. Create two thread objects.
6. Start both threads using the `start()` method.
7. Allow both threads to execute concurrently.
8. Stop the program.

## Program

```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " - Count: " + i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
```

## Result
Thus, the Java program to demonstrate multithreading by creating and executing multiple threads was implemented successfully.
