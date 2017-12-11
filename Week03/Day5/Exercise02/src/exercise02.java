import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class exercise02 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        drawOvals (graphics,WIDTH/2,HEIGHT/2, 800);
    }



    private static void drawOvals(Graphics graphics, double x, double y, int diameter) {
        if (diameter < WIDTH/50){
            return;
        }
        else {
            drawCircle(graphics,x,y,diameter);
            double x1 = x-(Math.sqrt(3.0) / 2)*(diameter/4);
            double y1 = y+(0.5*diameter/4);
            double x2 = x+(Math.sqrt(3.0) / 2)*(diameter/4);
            double y2 = y+(0.5*diameter/4);
            double x3 = x;
            double y3 = y-(diameter/4);

            graphics.setColor(Color.RED);
            drawOvals(graphics,x1,y1,diameter/2);
            graphics.setColor(Color.GREEN);
            drawOvals(graphics,x2,y2,diameter/2);;
            graphics.setColor(Color.BLUE);
            drawOvals(graphics,x3,y3,diameter/2);

        }

    }

    public static void drawCircle (Graphics graphics, double x, double y, int diameter){
        graphics.drawOval((int)x-diameter/2,(int)y-diameter/2,diameter,diameter);

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
