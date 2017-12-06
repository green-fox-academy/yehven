// create a square drawing function that takes 2 parameters:
// the x and y coordinates of the square's top left corner
// and draws a 50x50 square from that point.
// draw 3 squares with that function.

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise08 {

    public static void mainDraw(Graphics graphics){
        drawSquares(graphics,11,72);
        drawSquares(graphics, 95,333);
        drawSquares(graphics, 200, 50);
        drawSquares(graphics, 150, 97);

    }

    public static void drawSquares(Graphics graphics, int x, int y) {
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x,y,50,50);
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
            this.setBackground(Color.BLACK);
            mainDraw(graphics);

        }
    }

}
