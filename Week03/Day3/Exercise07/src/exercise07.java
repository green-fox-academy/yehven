// draw four different size and color rectangles.

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise07 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillRect(30,30,60,30);
        graphics.setColor(Color.RED);
        graphics.fillRect(30,80,80,30);
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(30,130,130,30);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(30,180,180,30);




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
