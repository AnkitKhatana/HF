package GUI;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    private int x,y;
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math .random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math .random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math . random () * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color (red, green, blue) ;

        GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(x,y,100,100) ;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }
}
