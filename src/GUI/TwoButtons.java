package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {

    JFrame frame;
    JLabel label;
    MyDrawPanel drawPanel;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change color");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        drawPanel = new MyDrawPanel();
        drawPanel.setX(70);
        drawPanel.setY(70);

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel) ;
        frame.getContentPane().add(BorderLayout.EAST, labelButton) ;
        frame.getContentPane().add(BorderLayout.WEST , label) ;

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            label.setText(" Whatever !");
        }
    }

    class ColorListener implements  ActionListener {

        public void actionPerformed(ActionEvent e) {
            drawPanel.setX(140);
            drawPanel.setY(140);
            frame.repaint();
        }
    }
}
