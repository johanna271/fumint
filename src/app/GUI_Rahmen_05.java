package app;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_05 extends javax.swing.JFrame {

    private JPanel panelMain;
    private Font f1 = new Font("Comic Sans MS", Font.BOLD, 20);
    private Font f2 = new Font("Tahoma", Font.BOLD, 12);
    private int sizeX;
    private int sizeY;

    public static void main(String[] args) {

        GUI_Rahmen_05 frame = new GUI_Rahmen_05();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(600,500));
        frame.setContentPane(new GUI_Rahmen_05().panelMain);
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
        g.drawLine(10, sizeY / 2 + 20, sizeX, sizeY / 2 + 20);
        g.drawLine(sizeX / 2, 40, sizeX / 2, sizeY);

        g.setFont(f2);
        g.drawString("x", sizeX - 20, sizeY / 2 + 20);
        for(int i = -10; i <= 10; i++){
            if(i != 0){
                g.drawString("|" + i, sizeX / 2 + i * sizeX / 12, sizeY / 2 + 10 + 20);
            }
        }

        g.drawString("y", sizeX / 2 + 15, 50);
        for(int i = 10; i >= -10; i--){
            if(i != 0){
                g.drawString("-" + i, sizeX / 2, ((-i * sizeX / 12) + sizeY/ 2^ + 280));
            }
        }
    }
}
