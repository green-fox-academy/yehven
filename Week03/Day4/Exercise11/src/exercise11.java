import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise11 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        drawLotRect (graphics,300,300,600);
    }



    private static void drawLotRect(Graphics graphics, int x, int y, int size) {
        if (size < WIDTH/81){
            return;
        }
        else {
            drawLine(graphics,x,y,size);
            int x1 = x+size/3;
            int y1 = y+size/3;
            int x2 = x-size/3;
            int y2 = y-size/3;

            drawLotRect(graphics,x,y1,size/3);
            drawLotRect(graphics,x,y2,size/3);
            drawLotRect(graphics,x1,y,size/3);
            drawLotRect(graphics,x2,y,size/3);
        }

    }

    public static void drawLine (Graphics graphics, int x, int y, int size){
        graphics.drawLine(x-size/6,y+size/2,x-size/6,y-size/2);
        graphics.drawLine(x+size/6,y+size/2,x+size/6,y-size/2);
        graphics.drawLine(x-size/2,y+size/6,x+size/2,y+size/6);
        graphics.drawLine(x-size/2,y-size/6,x+size/2,y-size/6);

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
            this.setBackground(Color.YELLOW);
            mainDraw(graphics);

        }
    }

}