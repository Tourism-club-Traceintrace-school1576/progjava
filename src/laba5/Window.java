package laba5;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private int width = 300;
    private int height = 300;

    private Image img;

    public Window() {
        setSize(width, height);
        setTitle("File Monitor:D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public void loadImage(String src) {
        img = new ImageIcon(src).getImage();
    }

    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(img, 0, 0, null);
    }
}
