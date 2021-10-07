package javaapplication1;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.Color;
import javax.swing.JLabel;

public class JavaApplication1 {

    public static void main(String[] args) throws InterruptedException {
        //get screensize
        Dimension x = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) x.getWidth();
        int screenHeight = (int) x.getHeight();
        // System.out.print(screenWidth+"    "+screenHeight);

        //frame
        JFrame frame = new JFrame();
        frame.setBackground(Color.BLACK);
        frame.setTitle("Sample Java app");
        frame.setSize(screenWidth, screenHeight);
       
        //login label
        JLabel loginTitle = new JLabel();
        loginTitle.setText("Login");
        loginTitle.setSize(80, 80);
        loginTitle.setBounds(screenWidth / 2 - 40, screenHeight / 10, 120, 200);
        loginTitle.setBackground(Color.red);
        loginTitle.setFont(new Font("Login", Font.BOLD, 35));

        JButton button = new JButton();
        button.setBounds(100, 100, 40, 40);

        //frame add
        frame.add(button);
        frame.add(loginTitle);
        frame.setLayout(null);
        //frame.add(logo);
        
        button.setBackground(Color.red);
        button.setSize(20, 20);

        loginTitle.setVisible(true);
        frame.setVisible(true);
        button.setVisible(true);
        //logo.setVisible(true);

        Thread.sleep(3000);
        System.exit(0);
    }

}
