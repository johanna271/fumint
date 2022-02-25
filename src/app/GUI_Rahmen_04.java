package app;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_04 extends javax.swing.JFrame {

    private JPanel panleMain;
    private Font f1 = new Font("Comic Sans MS", Font.BOLD, 20);
    private Font f2 = new Font("Tahoma", Font.BOLD, 12);

    public static void main(String[] args) {

        GUI_Rahmen_04 frame = new GUI_Rahmen_04();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(600,500));
        frame.setContentPane(new GUI_Rahmen_04().panleMain);
    }

    public void paint(Graphics g) {

        super.paintComponents(g);

        g.setColor(Color.green);
        g.setFont(f1);
        g.drawString("Eric", 50, 70);

        g.setColor(Color.red);
        g.drawString(".< Hier ist die Mitte!:", 300, 270);
        g.fillOval(295, 265, 10, 10);

        g.setColor(Color.black);
        g.drawLine(10, 270, 600, 270);
        g.drawLine(300, 40, 300, 500);

        g.setFont(f2);
        g.drawString("x", 580, 290);
        for(int i = -5; i <= 5; i++){
            String str = String.valueOf(i);
            if(i != 0){
                g.drawString("|" + str, 298 + i * 50, 280);
            }
        }

        g.drawString("y", 290, 60);
        for(int i = 4; i >= -4; i--){
            if(i != 0){
                g.drawString("-" + i, 300, ((-i * 50) + 280));
            }
        }
    }
}