package ade.food.order;
import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {
    private void centeredFrame(javax.swing.JFrame objFrame){
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY); 
    }
    /*
    public GUI(){
        getContentPane().removeAll();
        getContentPane().repaint();
        getContentPane().revalidate();
        add(myPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        getContentPane().repaint();
        getContentPane().revalidate();
    };
    */
    /*
    public GUI(){
        myFrame();
    }
    */
    public GUI(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Food Order Application");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Control panel = new Home();
        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        centeredFrame(this);
    }
   
    /*
    public void changePanel(JPanel panel){
        getContentPane().removeAll();
        getContentPane().repaint();
        getContentPane().revalidate();
        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        getContentPane().repaint();
        getContentPane().revalidate();
    }
*/
    //public abstract JPanel myPanel();
}
