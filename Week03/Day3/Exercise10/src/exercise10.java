// create a square drawing function that takes 2 parameters:
// the square size, and the fill color,
// and draws a square of that size and color to the center of the canvas.
// create a loop that fills the canvas with rainbow colored squares.

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise10 {

    public static void mainDraw(Graphics graphics){
        for (int i = 330; i > 0; i -=10) {
            drawSquares(graphics, i, new Color((int)(Math.random() * 0x1000000)));
        }
    }

    public static void drawSquares(Graphics graphics, int i, Color color) {
        graphics.setColor(color);
        graphics.fillRect((WIDTH/2)-(i/2),(HEIGHT/2)-(i/2),i,i);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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