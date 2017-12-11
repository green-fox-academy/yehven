import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise04 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.black);
        drawMoreRect (graphics,WIDTH/2,HEIGHT/2, 200);
    }



    private static void drawMoreRect(Graphics graphics, int x, int y, int size) {
        if (size < WIDTH/300){
            return;
        }
        else {
            drawRect(graphics,x,y,size);
            int x1 = x-size;
            int y1 = y-size;
            int x2 = x;
            int y2 = y-size;
            int x3 = x+size;
            int y3 = y-size;
            int x4 = x-size;
            int y4 = y;
            int x5 = x+size;
            int y5 = y;
            int x6 = x-size;
            int y6 = y+size;
            int x7 = x;
            int y7 = y+size;
            int x8 = x+size;
            int y8 = y+size;


            graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
            drawMoreRect(graphics,x1,y1,size/3);
            graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
            drawMoreRect(graphics,x2,y2,size/3);
            graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
            drawMoreRect(graphics,x3,y3,size/3);
            graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
            drawMoreRect(graphics,x4,y4,size/3);
            graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
            drawMoreRect(graphics,x5,y5,size/3);
            graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
            drawMoreRect(graphics,x6,y6,size/3);
            graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
            drawMoreRect(graphics,x7,y7,size/3);
            graphics.setColor(new Color((int)(Math.random() * 0x1000000)));
            drawMoreRect(graphics,x8,y8,size/3);

        }

    }

    public static void drawRect (Graphics graphics, double x, double y, int size){
        graphics.fillRect((int)x-size/2,(int)y-size/2,size,size);

    }

    static int WIDTH = 600;
    static int HEIGHT = 600;

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
            this.setBackground(Color.white);
            mainDraw(graphics);

        }
    }

}
