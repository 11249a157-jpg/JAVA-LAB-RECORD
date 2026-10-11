# Experiment 8(b): Line and Rectangle Using Java

## Aim
To write a Java program to draw a line and a rectangle using graphics.

## Algorithm
1. Start the program.
2. Import the required AWT and Swing packages.
3. Create a class named `LineRectangle` that extends `JPanel`.
4. Override the `paintComponent()` method.
5. Use the `drawLine()` method to draw a line.
6. Use the `drawRect()` method to draw a rectangle.
7. Create a JFrame to display the drawings.
8. Set the frame size and make it visible.
9. Stop the program.

## Program

```java
import javax.swing.*;
import java.awt.*;

public class LineRectangle extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a line
        g.setColor(Color.BLUE);
        g.drawLine(50, 60, 300, 60);

        // Draw a rectangle
        g.setColor(Color.RED);
        g.drawRect(100, 120, 180, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line and Rectangle");
        LineRectangle panel = new LineRectangle();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
```

## Result
Thus, the Java program to draw a line and a rectangle using graphics was implemented successfully.
