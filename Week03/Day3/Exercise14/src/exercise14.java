// create a line drawing function that takes 2 parameters:
// the x and y coordinates of the line's starting point
// and draws a line from that point to the center of the canvas.
// fill the canvas with lines from the edges, every 20 px, to the center.

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise14 {
    public static void mainDraw(Graphics graphics){
        for (int top = 0; top <WIDTH; top += 20) {
            drawaLine(graphics, top, 0);
        }
        for (int left = 0; left <HEIGHT; left += 20) {
            drawaLine(graphics, 0, left);
        }
        for (int right = 0; right <WIDTH; right += 20) {
            drawaLine(graphics, WIDTH, right);
        }
        for (int buttom = 0; buttom <HEIGHT; buttom += 20) {
            drawaLine(graphics, buttom, HEIGHT);
        }

    }

    public static void drawaLine(Graphics graphics, int x, int y) {
        graphics.setColor(Color.RED);
        graphics.drawLine(x,y,WIDTH/2, HEIGHT/2);
    }

    //    Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
