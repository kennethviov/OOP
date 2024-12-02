/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author kenne
 */
public class Main {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            Image icon = ImageIO.read(new File("res/pics/calculator.png"));
            frame.setIconImage(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        frame.setContentPane(new LogInPanel(frame));
        
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
