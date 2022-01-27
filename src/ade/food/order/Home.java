package ade.food.order;
import java.awt.Image;
import javax.swing.*;


public class Home extends Control{    
    private JPanel BasePanel;
    private JLabel Label;
    private JButton btLogin;
    private JButton btRegister;
    public JPanel myPanel(){
        BasePanel = new JPanel();
        btLogin = new JButton();
        btRegister = new JButton();
        Label = new JLabel();
        
        BasePanel.setBackground(new java.awt.Color(250, 246, 234));
        BasePanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        BasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btLogin.setText("Login");
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        BasePanel.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 300, 60));

        btRegister.setText("Register");
        btRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });
        BasePanel.add(btRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 300, 60));
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("pic/Logo2.png").getImage().getScaledInstance(460,200, Image.SCALE_DEFAULT));
        Label.setIcon(imageIcon);
        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        BasePanel.add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 400, 200));

        //getContentPane().add(BasePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1031, -1));
        return BasePanel;
    }
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {                                        
        super.removeAll();
        super.repaint();
        super.revalidate();
        Login panel = new Login();
        super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        super.repaint();
        super.revalidate();
    }         
    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {                                           
        super.removeAll();
        super.repaint();
        Register panel = new Register();
        super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        super.repaint();
        super.revalidate();
    }    
}
