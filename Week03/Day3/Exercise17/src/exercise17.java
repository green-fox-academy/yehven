// reproduce this:
// [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise17 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < WIDTH/2; i += 20){
            graphics.drawLine(WIDTH/2,i,WIDTH/2-i,HEIGHT/2);
        }
        for (int i = 0; i < WIDTH/2; i += 20){
            graphics.drawLine(WIDTH/2,i,WIDTH/2+i,HEIGHT/2);
        }
        for (int i = 0; i < WIDTH/2; i += 20){
            graphics.drawLine(WIDTH/2,HEIGHT-i,WIDTH/2-i,HEIGHT/2);
        }
        for (int i = 0; i < WIDTH/2; i += 20){
            graphics.drawLine(WIDTH/2,HEIGHT-i,WIDTH/2+i,HEIGHT/2);
        }




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
