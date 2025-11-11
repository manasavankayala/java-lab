import javax.swing.*;
import java.awt.*;

public class House extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // House base
        g.setColor(Color.ORANGE);
        g.fillRect(100, 150, 200, 150);

        // Roof
        g.setColor(Color.DARK_GRAY);
        int[] x = {90, 200, 310};
        int[] y = {150, 70, 150};
        g.fillPolygon(x, y, 3);

        // Door
        g.setColor(Color.BLACK);
        g.fillRect(180, 230, 40, 70);

        // Windows
        g.setColor(Color.CYAN);
        g.fillRect(120, 180, 40, 40);
        g.fillRect(240, 180, 40, 40);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("House");
        f.add(new House());
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}