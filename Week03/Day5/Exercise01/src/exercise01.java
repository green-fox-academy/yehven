import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise01 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        drawTriangles (graphics,500,500,600);
    }



    private static void drawTriangles(Graphics graphics, double x, double y, int size) {
        if (size < WIDTH/140){
            return;
        }
        else {
            drawLine(graphics,x,y,size);
            double x1 = x-size/4;
            double y1 = y-((Math.sqrt(3.0) / 2)*size)/4;
            double x2 = x+size/4;
            double y2 = y-((Math.sqrt(3.0) / 2)*size)/4;
            double x3 = x;
            double y3 = y+(Math.sqrt(3.0)/2 * size)/4;

            graphics.setColor(Color.RED);
            drawTriangles(graphics,x1,y1,size/2);
            graphics.setColor(Color.GREEN);
            drawTriangles(graphics,x2,y2,size/2);;
            graphics.setColor(Color.BLUE);
            drawTriangles(graphics,x3,y3,size/2);

        }

    }

    public static void drawLine (Graphics graphics, double x, double y, int size){
        graphics.drawLine((int)(x-size/2),(int) (y-((Math.sqrt(3.0) / 2)*size/2)),(int) (x+size/2),(int) (y-((Math.sqrt(3.0) / 2)*size/2)));
        graphics.drawLine((int)(x+size/2),(int) (y-((Math.sqrt(3.0) / 2)*size/2)),(int) (x),(int) (y+((Math.sqrt(3.0) / 2)*size)/2));
        graphics.drawLine((int)(x),(int)(y+((Math.sqrt(3.0) / 2)*size/2)),(int)(x-size/2),(int) (y-((Math.sqrt(3.0) / 2)*size/2)));



    }

    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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
