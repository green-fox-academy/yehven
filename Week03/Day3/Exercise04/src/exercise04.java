// create a line drawing function that takes 2 parameters:
// the x and y coordinates of the line's starting point
// and draws a line from that point to the center of the canvas.
// draw 3 lines with that function.

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise04 {

    public static void mainDraw(Graphics graphics){
        drawaLine(graphics,70,30);
        drawaLine(graphics, 141,132);
        drawaLine(graphics, 211, 81);

    }

    public static void drawaLine(Graphics graphics, int x, int y) {
        graphics.setColor(Color.YELLOW);
        graphics.drawLine(x,y,WIDTH/2, HEIGHT/2);
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