/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ade.food.order;

/**
 *
 * @author Ade Rizaldi
 */
public class RegisterGUI extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public RegisterGUI() {
        initComponents();
        
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        roleLabel = new javax.swing.JLabel();
        roleCombo = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        basePanel.setBackground(new java.awt.Color(250, 246, 234));
        basePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setText("Role:");
        basePanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));
        basePanel.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 300, 30));

        addressLabel.setText("Address:");
        basePanel.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));
        basePanel.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 300, 30));

        userLabel.setText("Username:");
        basePanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));
        basePanel.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 300, 30));

        passLabel.setText("Password:");
        basePanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));
        basePanel.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 300, 30));

        roleLabel.setText("Name:");
        basePanel.add(roleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Manager" }));
        roleCombo.setName(""); // NOI18N
        basePanel.add(roleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 30));
        roleCombo.getAccessibleContext().setAccessibleDescription("");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        basePanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        basePanel.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 470, 150, 40));

        getContentPane().add(basePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
