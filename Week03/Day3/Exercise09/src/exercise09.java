// create a square drawing function that takes 1 parameter:
// the square size
// and draws a square of that size to the center of the canvas.
// draw 3 squares with that function.

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise09 {

    public static void mainDraw(Graphics graphics){
        drawSquares(graphics,300);

    }

    public static void drawSquares(Graphics graphics, int wh) {
        graphics.setColor(Color.YELLOW);
        graphics.fillRect((WIDTH/2)-(wh/2),(HEIGHT/2)-(wh/2),wh,wh);
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
