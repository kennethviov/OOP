/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mypackage;

/**
 *
 * @author kenne
 */
public class RegisterPanel extends javax.swing.JPanel {

    javax.swing.JFrame frame;
    
    public RegisterPanel(javax.swing.JFrame frame) {
        this.frame = frame;
        accounts = ops.readFile();
        initComponents();
        
        frame.getRootPane().setDefaultButton(registerbutton1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registertitle = new javax.swing.JLabel();
        registertitle2 = new javax.swing.JLabel();
        userlabel1 = new javax.swing.JLabel();
        passlabel1 = new javax.swing.JLabel();
        passfield1 = new javax.swing.JPasswordField();
        userfield1 = new javax.swing.JTextField();
        registerbutton1 = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        showpassCheckBox = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(238, 238, 238));
        setPreferredSize(new java.awt.Dimension(320, 500));

        registertitle.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        registertitle.setForeground(new java.awt.Color(55, 58, 64));
        registertitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registertitle.setText("Register");
        registertitle.setToolTipText("Log In");

        registertitle2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registertitle2.setForeground(new java.awt.Color(104, 109, 118));
        registertitle2.setText("to calculator");

        userlabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        userlabel1.setForeground(new java.awt.Color(55, 58, 64));
        userlabel1.setText("Username:");

        passlabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        passlabel1.setForeground(new java.awt.Color(55, 58, 64));
        passlabel1.setText("Password:");

        passfield1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        userfield1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        userfield1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfield1ActionPerformed(evt);
            }
        });

        registerbutton1.setBackground(new java.awt.Color(220, 95, 0));
        registerbutton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registerbutton1.setForeground(new java.awt.Color(238, 238, 238));
        registerbutton1.setText("Register");
        registerbutton1.setFocusable(false);
        registerbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbutton1ActionPerformed(evt);
            }
        });

        cancelbutton.setBackground(new java.awt.Color(104, 109, 118));
        cancelbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelbutton.setForeground(new java.awt.Color(238, 238, 238));
        cancelbutton.setText("Cancel");
        cancelbutton.setFocusable(false);
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        showpassCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        showpassCheckBox.setForeground(new java.awt.Color(104, 109, 118));
        showpassCheckBox.setText("show password");
        showpassCheckBox.setFocusable(false);
        showpassCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registertitle2)
                    .addComponent(registertitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passlabel1)
                            .addComponent(userlabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(registerbutton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userfield1)
                                .addComponent(passfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(showpassCheckBox, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(registertitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registertitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlabel1))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passlabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showpassCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelbutton)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userfield1ActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        // TODO add your handling code here:
        frame.setContentPane(new LogInPanel(frame));
        frame.revalidate();
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void registerbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbutton1ActionPerformed
        // TODO add your handling code here:
        String username = userfield1.getText(); // Get text from username field
        String password = new String(passfield1.getPassword()); // Get password as String

        if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Account already exists.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (password.equals("") || password == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Password cannot be blank.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            accounts.put(username, password);
            ops.writeToFile(accounts);
            javax.swing.JOptionPane.showMessageDialog(this, "Registration successful!");
            frame.setContentPane(new LogInPanel(frame));
            frame.revalidate();
        }
    }//GEN-LAST:event_registerbutton1ActionPerformed

    private void showpassCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassCheckBoxActionPerformed
        // TODO add your handling code here:
        if (showpassCheckBox.isSelected()) {
            passfield1.setEchoChar((char)0);
        } else {
            passfield1.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbutton;
    private javax.swing.JPasswordField passfield1;
    private javax.swing.JLabel passlabel1;
    private javax.swing.JButton registerbutton1;
    private javax.swing.JLabel registertitle;
    private javax.swing.JLabel registertitle2;
    private javax.swing.JCheckBox showpassCheckBox;
    private javax.swing.JTextField userfield1;
    private javax.swing.JLabel userlabel1;
    // End of variables declaration//GEN-END:variables
    private static java.util.HashMap<String, String> accounts;
    private static FileOps ops = new FileOps();
}