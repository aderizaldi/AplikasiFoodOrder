package ade.food.order;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Login extends Control{
    private JButton backButton;
    private JPanel BasePanel;
    private JButton btLogin;
    private JPasswordField passField;
    private JLabel passLabel;
    private JTextField userField;
    private JLabel userLabel;
    private JLabel Label;
    
    public JPanel myPanel(){
        BasePanel = new JPanel();
        passField = new JPasswordField();
        passLabel = new JLabel();
        userField = new JTextField();
        userLabel = new JLabel();
        backButton = new JButton();
        btLogin = new JButton();
        Label = new JLabel();

        BasePanel.setBackground(new java.awt.Color(250, 246, 234));
        BasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BasePanel.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 300, 30));

        passLabel.setText("Password:");
        BasePanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));
        BasePanel.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 300, 30));

        userLabel.setText("Username:");
        BasePanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        BasePanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        btLogin.setText("Login");
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btLoginActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("pic/Logo1.png").getImage().getScaledInstance(180,200, Image.SCALE_DEFAULT));
        Label.setIcon(imageIcon);
        BasePanel.add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 180, 200));
        
        BasePanel.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 440, 150, 40));
        
        //getContentPane().add(BasePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        return BasePanel;
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
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {                                            
        // TODO add your handling code here:
        String user, pass;
        Data login = new Data();
        user = userField.getText();
        pass = passField.getText();
        ArrayList<String> dataLogin = new ArrayList();
        dataLogin = login.getDataRegister();
        boolean man = false;
        boolean cas = false;
        String nameUser = "-", addressUser = "-", userUser="-";
       
        for(String i : dataLogin){
            String old = i;
            String[] splitted = old.split("\\$");
            if(user.equals(splitted[0]) && pass.equals(splitted[1])){
                if(splitted[4].equals("Manager")){
                    man = true;
                }
                else if(splitted[4].equals("Cashier")){
                    cas = true;
                }
                nameUser = splitted[2];
                addressUser = splitted[3];
                userUser = splitted[0];
                break;
            }
        }
        String kosong = "";
        if(pass.equals(kosong) || user.equals(kosong)){
            JOptionPane.showMessageDialog(this, "Can not be empty!",
               "Failed", JOptionPane.ERROR_MESSAGE);
        }
        else if(man){
            super.removeAll();
            super.repaint();
            super.revalidate();
            Manager panel = new Manager();
            panel.setPanel(panel.menuPanel);
            panel.setLabel(nameUser, addressUser, userUser);
            login.addLastLogin(nameUser + ";" + addressUser + ";" + userUser);
            super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            super.repaint();
            super.revalidate();
        }
        
        else if(cas){
            super.removeAll();
            super.repaint();
            super.revalidate();
            Cashier panel = new Cashier();
            panel.setPanel(panel.orderPanel);
            panel.setLabel(nameUser, addressUser, userUser);
            login.addLastLogin(nameUser + ";" + addressUser + ";" + userUser);
            super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            super.repaint();
            super.revalidate();
        }
        else{
            JOptionPane.showMessageDialog(this, "Wrong username or password!",
               "Failed", JOptionPane.ERROR_MESSAGE);
        }
    }      
}
