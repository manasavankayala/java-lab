import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillRect(30,30,100,60);
        g.setColor(Color.red);
        g.fillOval(160,30,80,80);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Shapes");
        f.add(new Shapes());
        f.setSize(300,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}