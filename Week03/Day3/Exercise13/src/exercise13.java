// fill the canvas with a checkerboard pattern.

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise13 {

    public static void mainDraw(Graphics graphics){
        for ( int i = 0;  i < HEIGHT;  i++ ) {
            for ( int j = 0;  j < WIDTH;  j++ ) {
                int x = 50*i;
                int y = 50*j;
                if ( (i % 2) == (j % 2) )
                    graphics.setColor(Color.black);
                else
                    graphics.setColor(Color.white);
                graphics.fillRect(x,y,50,50);
            }
        }
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