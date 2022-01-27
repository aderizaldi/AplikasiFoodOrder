package ade.food.order;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Register extends Control{
    private JTextField addressField;
    private JLabel addressLabel;
    private JButton backButton;
    private JPanel BasePanel2;
    private JTextField nameField;
    private JLabel nameLabel;
    private JPasswordField passField;
    private JLabel passLabel;
    private JButton registerButton;
    private JComboBox<String> roleCombo;
    private JLabel roleLabel;
    private JTextField userField;
    private JLabel userLabel;
    public JPanel myPanel(){
        BasePanel2 = new JPanel();
        nameLabel = new JLabel();
        nameField = new JTextField();
        addressLabel = new JLabel();
        addressField = new JTextField();
        userLabel = new JLabel();
        userField = new JTextField();
        passLabel = new JLabel();
        passField = new JPasswordField();
        roleLabel = new JLabel();
        roleCombo = new JComboBox<>();
        backButton = new JButton();
        registerButton = new JButton();
        BasePanel2.setBackground(new java.awt.Color(250, 246, 234));
        BasePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
       
        nameLabel.setText("Name:");
        BasePanel2.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));
        BasePanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 300, 30));

        addressLabel.setText("Address:");
        BasePanel2.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));
        BasePanel2.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 300, 30));

        userLabel.setText("Username:");
        BasePanel2.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));
        BasePanel2.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 300, 30));

        passLabel.setText("Password:");
        BasePanel2.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));
        BasePanel2.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 300, 30));

        roleLabel.setText("Role:");
        BasePanel2.add(roleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Manager" }));
        roleCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BasePanel2.add(roleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 30));
     
        registerButton.setText("Register");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    registerButtonActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        BasePanel2.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 470, 150, 40));

        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        BasePanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));
        
        //getContentPane().add(BasePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        return BasePanel2;

    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        super.removeAll();
        super.repaint();
        super.revalidate();
        Home panel = new Home();
        super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        super.repaint();
        super.revalidate();
    }                                          
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                               
        Data register = new Data();
        String name, address, user, pass, role;
        name = nameField.getText();
        address = addressField.getText();
        user = userField.getText();
        pass = passField.getText();
        role = roleCombo.getSelectedItem().toString();
        ArrayList<String> dataRegister = new ArrayList();
        dataRegister = register.getDataRegister();
        String data = user + "$" + pass + "$" + name + "$" + address + "$" + role;
        boolean kon = true;
        for(String i : dataRegister){
            String old = i;
            String[] splitted = old.split("\\$");
            if(user.equals(splitted[0])){
                kon = false;
                break;
            }
        }
        String kosong = "";
        if(name.equals(kosong) || address.equals(kosong) || pass.equals(kosong) || user.equals(kosong)){
            JOptionPane.showMessageDialog(this, "Can not be empty!",
               "Failed", JOptionPane.ERROR_MESSAGE);
        }
        else if(kon){
            JOptionPane.showMessageDialog(this, "Success!");
            register.addDataRegister(data);
            super.removeAll();
            super.repaint();
            super.revalidate();
            Home panel = new Home();
            super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            super.repaint();
            super.revalidate();
        }
        else{
            JOptionPane.showMessageDialog(this, "Username already exist!",
               "Failed", JOptionPane.ERROR_MESSAGE);
        }
    }      
}
