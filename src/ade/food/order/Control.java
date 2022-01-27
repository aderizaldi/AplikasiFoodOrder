package ade.food.order;

import java.io.FileNotFoundException;
import javax.swing.*;

abstract class Control extends JPanel{
        public Control(){
            this.setBackground(new java.awt.Color(250, 246, 234));
            this.setPreferredSize(new java.awt.Dimension(1000, 600));
            this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            this.removeAll();
            this.repaint();
            this.revalidate();
            super.add(myPanel(),new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            this.repaint();
            this.revalidate();
        }       
        abstract JPanel myPanel();
}