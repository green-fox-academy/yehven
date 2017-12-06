// draw a box that has different colored lines on each edge.

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise02 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.drawLine(50,50,300,50);
        graphics.setColor(Color.RED);
        graphics.drawLine(300,50,300,300);
        graphics.setColor(Color.YELLOW);
        graphics.drawLine(300,300,50,300);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(50,300,50,50);



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
