// divide the canvas into 4 parts
// and repeat this pattern in each quarter:
// [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise16 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH/2,0,WIDTH/2,HEIGHT);
        graphics.drawLine(0,HEIGHT/2,WIDTH,HEIGHT/2);
        //first quarter
        for (int i = 0; i <WIDTH/2; i += 20){
            graphics.setColor(new Color(196, 125, 246));
            graphics.drawLine(i,0,WIDTH/2,i);

        }
        for (int j = 0; j < HEIGHT/2; j +=20){
            graphics.setColor(new Color(105,219,111));
            graphics.drawLine(0,j,j,HEIGHT/2);
        }
        //second quarter
        for (int i = 0; i <WIDTH/2; i += 20){
            graphics.setColor(new Color(196, 125, 246));
            graphics.drawLine(WIDTH/2+i,0,WIDTH,i);

        }
        for (int j = 0; j < WIDTH/2; j +=20) {
            graphics.setColor(new Color(105, 219, 111));
            graphics.drawLine(WIDTH/2, j, WIDTH/2+j, HEIGHT / 2);

        }
        // third quarter
        for (int i = 0; i <WIDTH/2; i += 20) {
            graphics.setColor(new Color(196, 125, 246));
            graphics.drawLine(i, HEIGHT/2, WIDTH/2, WIDTH/2+i);
        }
        for (int j = 0; j < HEIGHT/2; j +=20){
            graphics.setColor(new Color(105,219,111));
            graphics.drawLine(0,HEIGHT/2+j,j,HEIGHT);
        }
        // fourth quarter
        for (int i = 0; i <WIDTH/2; i += 20){
            graphics.setColor(new Color(196, 125, 246));
            graphics.drawLine(WIDTH/2+i,HEIGHT/2,WIDTH,WIDTH/2+i);

        }
        for (int j = 0; j < HEIGHT/2; j +=20){
            graphics.setColor(new Color(105,219,111));
            graphics.drawLine(WIDTH/2,HEIGHT/2+j,WIDTH/2+j,HEIGHT);
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
