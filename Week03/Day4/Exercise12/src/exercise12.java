import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise12 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        drawFractHexagon (graphics,300,300,200);
    }



    private static void drawFractHexagon(Graphics graphics, double x, double y, double size) {
        if (size < WIDTH/80){
            return;
        }
        else {
            drawHexagon(graphics,(int)x,(int)y,(int)size);
            double x0 = x - size/4 ;
            double y0 = y + (Math.sqrt(3.0)*size/4);

            double x1 = x - size/4;
            double y1 = y - (Math.sqrt(3.0)*size/4);

            double x2 = x + size/2;
            double y2 = y;

            drawFractHexagon(graphics,x0,y0,size/2);
            drawFractHexagon(graphics, x1,y1,size/2);
            drawFractHexagon(graphics,x2,y2,size/2);
        }

    }

    public static void drawHexagon(Graphics g, double x,double y, int size) {
        int[] xCoordinates = {(int)(x + size / 2), (int)(x - size / 2), (int)(x - size), (int)(x - size / 2), (int)(x + size / 2), (int)(x + size)};
        int[] yCoordinate = {(int)(y + (Math.sqrt(3.0) / 2 * size)), (int)(y + (Math.sqrt(3.0) / 2 * size)), (int) y, (int)(y - (Math.sqrt(3.0) / 2 * size)), (int)(y - (Math.sqrt(3.0) / 2 * size)), (int) y};
        g.drawPolygon(xCoordinates, yCoordinate, 6);
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
