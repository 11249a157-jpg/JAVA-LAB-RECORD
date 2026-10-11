# Experiment 8(a): Human Face Using Java

## Aim
To write a Java program to draw a human face using graphics.

## Algorithm
1. Start the program.
2. Import the required AWT and Swing packages.
3. Create a class named `HumanFace` that extends `JPanel`.
4. Override the `paintComponent()` method.
5. Draw the face, eyes, eyebrows, nose, ears, and mouth using graphics methods.
6. Create a JFrame to display the drawing.
7. Set the frame size and make it visible.
8. Stop the program.

## Program

```java
import javax.swing.*;
import java.awt.*;

public class HumanFace extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face
        g.setColor(new Color(255, 220, 177));
        g.fillOval(100, 60, 200, 250);

        // Ears
        g.fillOval(80, 150, 35, 60);
        g.fillOval(285, 150, 35, 60);

        // Hair
        g.setColor(Color.BLACK);
        g.fillArc(100, 45, 200, 100, 0, 180);

        // Eyebrows
        g.drawLine(140, 130, 175, 125);
        g.drawLine(225, 125, 260, 130);

        // Eyes
        g.fillOval(145, 140, 20, 15);
        g.fillOval(235, 140, 20, 15);

        // Nose
        g.drawLine(200, 155, 185, 205);
        g.drawLine(185, 205, 210, 205);

        // Mouth
        g.setColor(Color.RED);
        g.drawArc(165, 220, 70, 30, 180, 180);

        // Neck
        g.setColor(new Color(255, 220, 177));
        g.fillRect(175, 290, 50, 40);

        // Body
        g.setColor(Color.BLUE);
        g.fillArc(110, 310, 180, 120, 0, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        HumanFace panel = new HumanFace();

        frame.add(panel);
        frame.setSize(400, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
```

## Result
Thus, the Java program to draw a human face using graphics was implemented successfully.
