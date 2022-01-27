package ade.food.order;
import java.awt.Dimension;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Manager extends Control{
    private JPanel BasePanel;
    private JPanel ProfilePanel;
    private JButton btLogout2;
    private JButton btMenu;
    private JButton btProfile2;
    private JButton btTrans2;
    private JButton coldAdd;
    private JLabel coldLabel;
    private JScrollPane coldScroll;
    private JLabel drinkLabel1;
    private JPanel drinkPanel;
    private JLabel foodLabel1;
    private JPanel foodPanel;
    private JButton hotAdd;
    private JLabel hotLabel;
    private JScrollPane hotScroll;
    private JList<String> hotList;
    private JList<String> coldList;
    private JList<String> noodleList;
    private JList<String> riceList;
    private JList<String> meatList;
    private JList<String> seaList;
    private JPanel jPanel1;
    private JLabel labelAddress;
    private JLabel labelManag;
    private JLabel labelName;
    private JLabel labelTrans;
    private JLabel labelUser;
    private JPanel leftPanel;
    private JList<String> listTrans;
    private JLabel lladdress;
    private JLabel llname;
    private JLabel lluser;
    private JLabel logoLabel;
    private JLabel mealLabel;
    private JButton meatAdd;
    private JScrollPane meatScroll;
    public JPanel menuPanel;
    private JButton noodleAdd;
    private JLabel noodleLabel;
    private JScrollPane noodleScroll;
    private JButton riceAdd;
    private JLabel riceLabel;
    private JScrollPane riceScroll;
    private JPanel rightPanel;
    private JScrollPane scrollTrans;
    private JButton seaAdd;
    private JLabel seaLabel;
    private JScrollPane seaScroll;
    private JPanel subDrinkPanel;
    private JPanel subFoodPanel;
    private JButton transDelete;
    private JLabel transLabel;
    public JPanel transPanel;
    
    public JPanel myPanel(){
        BasePanel = new JPanel();
        leftPanel = new JPanel();
        btMenu = new JButton();
        btTrans2 = new JButton();
        btProfile2 = new JButton();
        btLogout2 = new JButton();
        logoLabel = new JLabel();
        rightPanel = new JPanel();
        ProfilePanel = new JPanel();
        labelManag = new JLabel();
        labelName = new JLabel();
        labelAddress = new JLabel();
        labelUser = new JLabel();
        llname = new JLabel();
        lladdress = new JLabel();
        lluser = new JLabel();
        menuPanel = new JPanel();
        drinkLabel1 = new JLabel();
        foodLabel1 = new JLabel();
        foodPanel = new JPanel();
        noodleLabel = new JLabel();
        riceLabel = new JLabel();
        riceAdd = new JButton();
        noodleAdd = new JButton();
        mealLabel = new JLabel();
        seaLabel = new JLabel();
        seaAdd = new JButton();
        meatAdd = new JButton();
        subFoodPanel = new JPanel();
        noodleScroll = new JScrollPane();
        noodleList = new JList<>();
        riceScroll = new JScrollPane();
        riceList = new JList<>();
        meatScroll = new JScrollPane();
        meatList = new JList<>();
        seaScroll = new JScrollPane();
        seaList = new JList<>();
        drinkPanel = new JPanel();
        hotLabel = new JLabel();
        coldLabel = new JLabel();
        coldAdd = new JButton();
        hotAdd = new JButton();
        subDrinkPanel = new JPanel();
        hotScroll = new JScrollPane();
        hotList = new JList<>();
        coldScroll = new JScrollPane();
        coldList = new JList<>();
        transPanel = new JPanel();
        labelTrans = new JLabel();
        transLabel = new JLabel();
        transDelete = new JButton();
        jPanel1 = new JPanel();
        scrollTrans = new JScrollPane();
        
        Data data = new Data();
        ArrayList<String> arrhot = new ArrayList();
        ArrayList<String> arrcold = new ArrayList();
        ArrayList<String> arrnoodle = new ArrayList();
        ArrayList<String> arrmeat = new ArrayList();
        ArrayList<String> arrrice = new ArrayList();
        ArrayList<String> arrseafood = new ArrayList();
        ArrayList<String> arrtrans = new ArrayList();
        
        try {
            arrhot = data.getDataHot();
            arrcold = data.getDataCold();
            arrnoodle = data.getDataNoodle();
            arrmeat = data.getDataMeat();
            arrrice = data.getDataRice();
            arrseafood = data.getDataSeafood();
            arrtrans = data.getDataTrans();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] hot = getStringArray(arrhot);
        String[] cold = getStringArray(arrcold);
        String[] noodle = getStringArray(arrnoodle);
        String[] meat = getStringArray(arrmeat);
        String[] rice = getStringArray(arrrice);
        String[] seafood = getStringArray(arrseafood);
        String[] trans = getStringArray(arrtrans);
        
        hotList = new JList<>(model(hot));
        coldList = new JList<>(model(cold));
        seaList = new JList<>(model(seafood));
        riceList = new JList<>(model(rice));
        meatList = new JList<>(model(meat));
        noodleList = new JList<>(model(noodle));
        listTrans = new JList<>(model3(trans));

        BasePanel.setBackground(new java.awt.Color(239, 225, 198));
        BasePanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        BasePanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        BasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(239, 225, 198));
        leftPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 110), 3, true));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btMenu.setText("Menu");
        btMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        leftPanel.add(btMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 35));

        btTrans2.setText("Transactions");
        btTrans2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTrans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btTrans2ActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        leftPanel.add(btTrans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 35));

        btProfile2.setText("Profile");
        btProfile2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProfile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProfile2ActionPerformed(evt);
            }
        });
        leftPanel.add(btProfile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 35));

        btLogout2.setText("Logout");
        btLogout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftPanel.add(btLogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 100, 35));
        btLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogout2ActionPerformed(evt);
            }
        });
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("pic/Logo1.png").getImage().getScaledInstance(90,100, Image.SCALE_DEFAULT));
        logoLabel.setIcon(imageIcon);
        leftPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 100));

        BasePanel.add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 600));

        rightPanel.setBackground(new java.awt.Color(239, 225, 198));
        rightPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 110), 3, true));
        rightPanel.setMaximumSize(new java.awt.Dimension(850, 600));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProfilePanel.setBackground(new java.awt.Color(239, 225, 198));
        ProfilePanel.setMaximumSize(new java.awt.Dimension(850, 600));
        ProfilePanel.setMinimumSize(new java.awt.Dimension(850, 600));
        ProfilePanel.setPreferredSize(new java.awt.Dimension(850, 600));
        ProfilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelManag.setBackground(new java.awt.Color(102, 102, 110));
        labelManag.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelManag.setForeground(new java.awt.Color(102, 102, 110));
        labelManag.setText("MANAGER");
        ProfilePanel.add(labelManag, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, -1, -1));

        labelName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(102, 102, 110));
        labelName.setText("Name :");
        ProfilePanel.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 132, -1, -1));

        labelAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(102, 102, 110));
        labelAddress.setText("Address :");
        ProfilePanel.add(labelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 197, -1, -1));

        labelUser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelUser.setForeground(new java.awt.Color(102, 102, 110));
        labelUser.setText("Username :");
        ProfilePanel.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 259, -1, -1));

        llname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        llname.setForeground(new java.awt.Color(102, 102, 110));
        ProfilePanel.add(llname, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 132, 645, 30));

        lladdress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lladdress.setForeground(new java.awt.Color(102, 102, 110));
        ProfilePanel.add(lladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 197, 645, 30));

        lluser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lluser.setForeground(new java.awt.Color(102, 102, 110));
        ProfilePanel.add(lluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 259, 645, 30));

        //rightPanel.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600))

        menuPanel.setBackground(new java.awt.Color(239, 225, 198));
        menuPanel.setMaximumSize(new java.awt.Dimension(850, 600));
        menuPanel.setMinimumSize(new java.awt.Dimension(850, 600));
        menuPanel.setPreferredSize(new java.awt.Dimension(850, 600));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drinkLabel1.setBackground(new java.awt.Color(102, 102, 110));
        drinkLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        drinkLabel1.setForeground(new java.awt.Color(102, 102, 110));
        drinkLabel1.setText("DRINK");
        menuPanel.add(drinkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        foodLabel1.setBackground(new java.awt.Color(102, 102, 110));
        foodLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        foodLabel1.setForeground(new java.awt.Color(102, 102, 110));
        foodLabel1.setText("FOOD");
        menuPanel.add(foodLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        foodPanel.setBackground(new java.awt.Color(102, 102, 110));
        foodPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noodleLabel.setForeground(new java.awt.Color(250, 246, 234));
        noodleLabel.setText("Noodle");
        foodPanel.add(noodleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        riceLabel.setForeground(new java.awt.Color(250, 246, 234));
        riceLabel.setText("Rice");
        foodPanel.add(riceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        riceAdd.setText("Add");
        riceAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    riceAddActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        foodPanel.add(riceAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 70, 30));

        noodleAdd.setText("Add");
        noodleAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    noodleAddActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        foodPanel.add(noodleAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, 30));

        mealLabel.setForeground(new java.awt.Color(250, 246, 234));
        mealLabel.setText("Meat");
        foodPanel.add(mealLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        seaLabel.setForeground(new java.awt.Color(250, 246, 234));
        seaLabel.setText("Seafood");
        foodPanel.add(seaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        seaAdd.setText("Add");
        seaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    seaAddActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        foodPanel.add(seaAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 70, 30));

        meatAdd.setText("Add");
        meatAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    meatAddActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        foodPanel.add(meatAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 70, 30));

        subFoodPanel.setBackground(new java.awt.Color(102, 102, 110));
        subFoodPanel.setLayout(new javax.swing.BoxLayout(subFoodPanel, javax.swing.BoxLayout.X_AXIS));

        noodleScroll.setBackground(new java.awt.Color(102, 102, 110));

        noodleList.setBackground(new java.awt.Color(250, 246, 234));
        noodleList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        noodleList.setForeground(new java.awt.Color(102, 102, 110));
       
        noodleScroll.setViewportView(noodleList);
        noodleScroll.setPreferredSize(new Dimension(202,160));

        subFoodPanel.add(noodleScroll);

        riceScroll.setBackground(new java.awt.Color(102, 102, 110));

        riceList.setBackground(new java.awt.Color(250, 246, 234));
        riceList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        riceList.setForeground(new java.awt.Color(102, 102, 110));
        
        riceScroll.setViewportView(riceList);
        riceScroll.setPreferredSize(new Dimension(202,160));
        
        subFoodPanel.add(riceScroll);

        meatScroll.setBackground(new java.awt.Color(102, 102, 110));

        meatList.setBackground(new java.awt.Color(250, 246, 234));
        meatList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        meatList.setForeground(new java.awt.Color(102, 102, 110));
        
        meatScroll.setViewportView(meatList);
        meatScroll.setPreferredSize(new Dimension(202,160));

        subFoodPanel.add(meatScroll);

        seaScroll.setBackground(new java.awt.Color(102, 102, 110));

        seaList.setBackground(new java.awt.Color(250, 246, 234));
        seaList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        seaList.setForeground(new java.awt.Color(102, 102, 110));
        
        seaScroll.setViewportView(seaList);
        seaScroll.setPreferredSize(new Dimension(202,160));
        subFoodPanel.add(seaScroll);

        foodPanel.add(subFoodPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 160));

        menuPanel.add(foodPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 810, 230));

        drinkPanel.setBackground(new java.awt.Color(102, 102, 110));
        drinkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hotLabel.setForeground(new java.awt.Color(250, 246, 234));
        hotLabel.setText("Hot");
        drinkPanel.add(hotLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        coldLabel.setForeground(new java.awt.Color(250, 246, 234));
        coldLabel.setText("Cold");
        drinkPanel.add(coldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        coldAdd.setText("Add");
        coldAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    coldAddActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        drinkPanel.add(coldAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 70, 30));

        hotAdd.setText("Add");
        hotAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    hotAddActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        drinkPanel.add(hotAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 70, 30));

        subDrinkPanel.setBackground(new java.awt.Color(102, 102, 110));
        subDrinkPanel.setLayout(new javax.swing.BoxLayout(subDrinkPanel, javax.swing.BoxLayout.X_AXIS));

        hotScroll.setBackground(new java.awt.Color(102, 102, 110));

        hotList.setBackground(new java.awt.Color(250, 246, 234));
        hotList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hotList.setForeground(new java.awt.Color(102, 102, 110));
        
        hotScroll.setViewportView(hotList);
        hotScroll.setPreferredSize(new Dimension(202,160));
        subDrinkPanel.add(hotScroll);

        coldScroll.setBackground(new java.awt.Color(102, 102, 110));

        coldList.setBackground(new java.awt.Color(250, 246, 234));
        coldList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        coldList.setForeground(new java.awt.Color(102, 102, 110));
        
        coldScroll.setViewportView(coldList);
        coldScroll.setPreferredSize(new Dimension(202,160));

        subDrinkPanel.add(coldScroll);

        drinkPanel.add(subDrinkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 410, 140));

        menuPanel.add(drinkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 410, 210));

        //rightPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        transPanel.setBackground(new java.awt.Color(239, 225, 198));
        transPanel.setPreferredSize(new java.awt.Dimension(850, 600));
        transPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTrans.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTrans.setForeground(new java.awt.Color(102, 102, 110));
        labelTrans.setText("TRANSACTIONS");
        transPanel.add(labelTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 25, -1, -1));

        transLabel.setForeground(new java.awt.Color(102, 102, 110));
        transLabel.setText("");
        transPanel.add(transLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 350, -1));

        transDelete.setText("Delete");
        transDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    transDeleteButtonActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        transPanel.add(transDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        jPanel1.setBackground(new java.awt.Color(239, 225, 198));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollTrans.setBorder(null);

        listTrans.setBackground(new java.awt.Color(239, 225, 198));
        listTrans.setForeground(new java.awt.Color(102, 102, 110));
        listTrans.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  transLabel.setText(listTrans.getSelectedValue().toString());
                }
            }
        });
        scrollTrans.setViewportView(listTrans);

        jPanel1.add(scrollTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 460));

        transPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 420, 460));

        //rightPanel.add(transPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        BasePanel.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 850, 600));

        //getContentPane().add(BasePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        return BasePanel;
    }
    
    private void btLogout2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        removeAll();
        repaint();
        revalidate();
        Home panel = new Home();
        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        repaint();
        revalidate();
    }  
    
    private void btProfile2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        setPanel(ProfilePanel);
        rightPanel.repaint();
        rightPanel.revalidate();
    }    
    
    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {                                       
       rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        setPanel(menuPanel);
        rightPanel.repaint();
        rightPanel.revalidate();
    }                                      

    private void btTrans2ActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException {                                         
        Data data = new Data();
        String lastLog = data.getLastLogin();
        String[] splitted = lastLog.split("\\;");
        removeAll();
        repaint();
        revalidate();
        Manager panel = new Manager();
        panel.setPanel(panel.transPanel);
        panel.setLabel(splitted[0], splitted[1], splitted[2]);
        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        repaint();
        revalidate();
    }                                        

    private void riceAddActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                        
        // TODO add your handling code here:
        Data data = new Data();
        String str = showMultipleInputMessageDialog();
        String kosong = ";";
        if(!str.equals(kosong)){
            data.addDataRice(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Manager panel = new Manager();
            panel.setPanel(panel.menuPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                       

    private void noodleAddActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                          
        // TODO add your handling code here:
        Data data = new Data();
        String str = showMultipleInputMessageDialog();
        String kosong = ";";
        if(!str.equals(kosong)){
            data.addDataNoodle(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Manager panel = new Manager();
            panel.setPanel(panel.menuPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                         

    private void seaAddActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                       
        // TODO add your handling code here:
        Data data = new Data();
        String str = showMultipleInputMessageDialog();
        String kosong = ";";
        if(!str.equals(kosong)){
            data.addDataSeafood(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Manager panel = new Manager();
            panel.setPanel(panel.menuPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }    
    }                                      

    private void meatAddActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                        
        // TODO add your handling code here:
        Data data = new Data();
        String str = showMultipleInputMessageDialog();
        String kosong = ";";
        if(!str.equals(kosong)){
            data.addDataMeat(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Manager panel = new Manager();
            panel.setPanel(panel.menuPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                       

    private void coldAddActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                        
        // TODO add your handling code here:
        Data data = new Data();
        String str = showMultipleInputMessageDialog();
        String kosong = ";";
        if(!str.equals(kosong)){
            data.addDataCold(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Manager panel = new Manager();
            panel.setPanel(panel.menuPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                       

    private void hotAddActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                       
        // TODO add your handling code here:
        Data data = new Data();
        String str = showMultipleInputMessageDialog();
        String kosong = ";";
        if(!str.equals(kosong)){
            data.addDataHot(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Manager panel = new Manager();
            panel.setPanel(panel.menuPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }  
    private void transDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException { 
        String kosong = "";
        String select = listTrans.getSelectedValue().toString();
        if(!select.equals(kosong)){
            int option = JOptionPane.showConfirmDialog(this, "Delete transaction?", "Warning", JOptionPane.OK_CANCEL_OPTION);
            if(option == JOptionPane.OK_OPTION){
                Data data = new Data();
                ArrayList<String> dataTrans = new ArrayList();
                dataTrans = data.getDataTrans();
                int index = listTrans.getSelectedIndex();
                dataTrans.remove(index);
                data.rewritedDataTrans(dataTrans);
                String lastLog = data.getLastLogin();
                String[] splitted = lastLog.split("\\;");
                removeAll();
                repaint();
                revalidate();
                Manager panel = new Manager();
                panel.setPanel(panel.transPanel);
                panel.setLabel(splitted[0], splitted[1], splitted[2]);
                add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
                repaint();
                revalidate();   
            }
        }
    }  
    
    public void setLabel(String nama,String address, String user){
        llname.setText(nama);
        lladdress.setText(address);
        lluser.setText(user);
    }
    public static String[] getStringArray(ArrayList<String> arr)
    {
  
        // declaration and initialise String Array
        String str[] = new String[arr.size()];
  
        // ArrayList to Array Conversion
        for (int j = 0; j < arr.size(); j++) {
  
            // Assign each value to String array
            str[j] = arr.get(j);
        }
  
        return str;
    }
    
    public DefaultListModel<String> model(String[] str){
        DefaultListModel<String> myModel = new DefaultListModel<>();
        for (String s : str) {
            String[] splitted = s.split("\\;");
            String ss = splitted[0] + " - " + splitted[1];
            myModel.addElement(ss);
        }
        return myModel;
    }
    DefaultListModel<String> model3(String[] str){
        DefaultListModel<String> myModel = new DefaultListModel<>();
            for (String s : str) {
                String[] splitted = s.split("\\$");
                String[] splitted2 = splitted[0].split("\\;");
                String ss;
                String pesan = "<html>Order: " + splitted2[0];
                String tipe = "<br>Order Type: " + splitted[1];
                String harga = "<br>Price: " + splitted[2];
                String bayar = "<br>Payment: " + splitted[3];
                String kembalian = "<br>Change: "+ splitted[4];
                
                for(int i = 1; i <splitted2.length ; i++){
                    pesan+=", "+splitted2[i];
                }
                kembalian += "<br></span></html>";
                ss = pesan + tipe + harga + bayar + kembalian;
                myModel.addElement(ss);
            }
        return myModel;
    }
    
    private String showMultipleInputMessageDialog() {
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        Object[] inputFields = {"Enter Name", textField1,
                "Enter Price", textField2};

        int option = JOptionPane.showConfirmDialog(this, inputFields, "Input new menu", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        String str = textField1.getText() + ";" + textField2.getText();
        if (option == JOptionPane.CANCEL_OPTION) {
            str = ";";
        }
        return str;
    }   
    public void setPanel(JPanel panel){
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        rightPanel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -15, 850, 600));
        rightPanel.repaint();
        rightPanel.revalidate();
    }
}