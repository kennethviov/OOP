package src;

//import res.FileOps;

import java.util.HashMap;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
    
    static FileOps ops;
    static HashMap<String, String> accounts;

    public static void main (String[] args) {
        ops = new FileOps();
        
        accounts = ops.readFile();

        JFrame frame = new JFrame("Log In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);
        frame.setResizable(false);
        
        try {
            Image logo = ImageIO.read(new File("res/images/logo.png"));
            frame.setIconImage(logo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel userlbl = new JLabel("Username");
        JTextField userfld = new JTextField(12);

        JLabel passlbl = new JLabel("Password");
        JPasswordField passfld = new JPasswordField(12);

        JButton loginbutton = new JButton("Log In");
        
        JButton registerbtn = new JButton("Register");

        frame.add(userlbl);
        frame.add(userfld);
        frame.add(passlbl);
        frame.add(passfld);
        frame.add(loginbutton);
        frame.add(registerbtn);

        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve user inputs
                String username = userfld.getText(); // Get text from username field
                String password = new String(passfld.getPassword()); // Get password as String

                if (accounts.containsKey(username)) {
                    if (accounts.get(username).equals(password)) {
                        JOptionPane.showMessageDialog(frame, "Login successful!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Incorrect Password", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
       registerbtn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              newPage(); 
           }
       });
        

        frame.getRootPane().setDefaultButton(loginbutton);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    static void newPage() {
        
        JFrame frame = new JFrame("Register");
        frame.setSize(250, 200);
        frame.setResizable(false);
    
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
 
        JLabel userlbl = new JLabel("Username");
        JTextField userfld = new JTextField(12);

        JLabel passlbl = new JLabel("Password");
        JPasswordField passfld = new JPasswordField(12);
        
        JButton registerbtn = new JButton("Register");
        
        frame.add(userlbl);
        frame.add(userfld);
        frame.add(passlbl);
        frame.add(passfld);
        frame.add(registerbtn);
        
        registerbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userfld.getText(); // Get text from username field
                String password = new String(passfld.getPassword()); // Get password as String

                if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Account already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (password.equals("") || password == null) {
                    JOptionPane.showMessageDialog(frame, "Password cannot be blank.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    ops.writeToFile(accounts);
                    JOptionPane.showMessageDialog(frame, "Registration successful!");
                    frame.dispose();
                }
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getRootPane().setDefaultButton(registerbtn);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
