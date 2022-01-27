package ade.food.order;
import java.io.FileNotFoundException;
import javax.swing.*;

public class Refresh extends Control{
    private JPanel BasePanel;
    public JPanel myPanel(){
        BasePanel = new javax.swing.JPanel();
        BasePanel.setBackground(new java.awt.Color(239, 225, 198));
        BasePanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        BasePanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        BasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        return BasePanel;
    }
    
    public void refreshOrderCas() throws FileNotFoundException{
        Data data = new Data();
        String lastLog = data.getLastLogin();
        String[] splitted = lastLog.split("\\;");
        super.removeAll();
        super.repaint();
        super.revalidate();
        Cashier panel = new Cashier();  
        panel.setPanel(new Cashier().orderPanel);
        panel.setLabel(splitted[0], splitted[1], splitted[2]);
        super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        super.repaint();
        super.revalidate();
    }
        
    public void refreshTransCas() throws FileNotFoundException{
        Data data = new Data();
        String lastLog = data.getLastLogin();
        String[] splitted = lastLog.split("\\;");
        super.removeAll();
        super.repaint();
        super.revalidate();
        Cashier panel = new Cashier();  
        panel.setPanel(new Cashier().transPanel);
        panel.setLabel(splitted[0], splitted[1], splitted[2]);
        super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        super.repaint();
        super.revalidate();
    }
        
    public void refreshMenuMan() throws FileNotFoundException{
            Data data = new Data();
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            super.removeAll();
            super.repaint();
            super.revalidate();
            Manager panel = new Manager();
            panel.setPanel(new Manager().menuPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            super.repaint();
            super.revalidate();
    }
        
    public void refreshTransMan() throws FileNotFoundException{
            Data data = new Data();
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            super.removeAll();
            super.repaint();
            super.revalidate();
            Manager panel = new Manager();
            panel.setPanel(new Manager().transPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            super.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            super.repaint();
            super.revalidate();
    }
}
