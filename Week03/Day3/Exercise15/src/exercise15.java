import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise15 {

    public static void mainDraw(Graphics graphics){
        for (int i = 0; i <WIDTH; i += 20){
            graphics.setColor(new Color(196, 125, 246));
            graphics.drawLine(i,0,WIDTH,i);

        }
        for (int j = 0; j < HEIGHT; j +=20){
            graphics.setColor(new Color(105,219,111));
            graphics.drawLine(0,j,j,HEIGHT);
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
