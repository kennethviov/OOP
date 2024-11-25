import java.util.HashMap;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
    public static void main (String[] args) {
        HashMap<String, String> accounts = readFile();

        JFrame frame = new JFrame("Log In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 300);
        frame.setResizable(false);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel userlbl = new JLabel("Username");
        JTextField userfld = new JTextField(12);

        JLabel passlbl = new JLabel("Password");
        JPasswordField passfld = new JPasswordField(12);

        JButton button = new JButton("Log In");

        frame.add(userlbl);
        frame.add(userfld);
        frame.add(passlbl);
        frame.add(passfld);
        frame.add(button);

        button.addActionListener(new ActionListener() {
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

        frame.getRootPane().setDefaultButton(button);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    static HashMap<String, String> readFile() {
        HashMap<String, String> accounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("res/users.txt"))) {
            String user;
            while ((user = br.readLine()) != null) {
                String pass = br.readLine();
                if (pass != null) {
                    accounts.put(user, pass);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return accounts;
    }
}