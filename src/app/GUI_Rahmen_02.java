package app;

import javax.swing.*;
import java.awt.*;

public class GUI_Rahmen_02 extends javax.swing.JFrame{

    private JPanel panleMain;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Rahmen_01");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(600,500));
        frame.setContentPane(new GUI_Rahmen_02().panleMain);
    }

    public GUI_Rahmen_02(){
    }
}
