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

public class Cashier extends Control{
    private JPanel BasePanel;
    private JPanel ProfilePanel;
    private JLabel bestLabel;
    private JList<String> bestList;
    private JPanel bestPanel;
    private JScrollPane bestScroll;
    private JButton btLogout;
    private JButton btOrder;
    private JButton btProfile;
    private JButton btTrans;
    private JButton coldAdd;
    private JLabel coldLabel;
    private JList<String> coldList;
    private JLabel coldOrderLabel;
    private JScrollPane coldScroll;
    private JLabel drinkLabel1;
    private JPanel drinkPanel;
    private JLabel foodLabel1;
    private JPanel foodPanel;
    private JButton hotAdd;
    private JLabel hotLabel;
    private JList<String> hotList;
    private JLabel hotOrderLabel;
    private JScrollPane hotScroll;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel labelAddress;
    private JLabel labelCash;
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
    private JList<String> meatList;
    private JLabel meatOrderLabel;
    private JScrollPane meatScroll;
    private JButton noodleAdd;
    private JLabel noodleLabel;
    private JList<String> noodleList;
    private JLabel noodleOrderLabel;
    private JScrollPane noodleScroll;
    private JButton orderButton;
    private JComboBox<String> orderCombo;
    private JLabel orderLabel;
    private JList<String> orderList;
    public JPanel orderPanel;
    private JButton riceAdd;
    private JLabel riceLabel;
    private JList<String> riceList;
    private JLabel riceOrderLabel;
    private JScrollPane riceScroll;
    private JPanel rightPanel;
    private JScrollPane scrollTrans;
    private JButton seaAdd;
    private JLabel seaLabel;
    private JList<String> seaList;
    private JLabel seaOrderLabel;
    private JScrollPane seaScroll;
    private JPanel subBestPanel;
    private JPanel subDrinkPanel;
    private JPanel subFoodPanel;
    public JPanel transPanel;
    private JLabel yourLabel;
    private JScrollPane yourScroll;
    private JButton resetButton;

    public JPanel myPanel(){
        BasePanel = new JPanel();
        leftPanel = new JPanel();
        btOrder = new JButton();
        btTrans = new JButton();
        btProfile = new JButton();
        btLogout = new JButton();
        logoLabel = new JLabel();
        rightPanel = new JPanel();
        ProfilePanel = new JPanel();
        labelCash = new JLabel();
        labelName = new JLabel();
        labelAddress = new JLabel();
        labelUser = new JLabel();
        llname = new JLabel();
        lladdress = new JLabel();
        lluser = new JLabel();
        orderPanel = new JPanel();
        orderLabel = new JLabel();
        drinkLabel1 = new JLabel();
        foodLabel1 = new JLabel();
        orderButton = new JButton();
        orderCombo = new JComboBox<>();
        foodPanel = new JPanel();
        noodleLabel = new JLabel();
        riceLabel = new JLabel();
        riceOrderLabel = new JLabel();
        noodleOrderLabel = new JLabel();
        riceAdd = new JButton();
        noodleAdd = new JButton();
        mealLabel = new JLabel();
        seaLabel = new JLabel();
        seaOrderLabel = new JLabel();
        meatOrderLabel = new JLabel();
        seaAdd = new JButton();
        meatAdd = new JButton();
        subFoodPanel = new JPanel();
        noodleScroll = new JScrollPane();
        
        riceScroll = new JScrollPane();
        
        meatScroll = new JScrollPane();
        
        seaScroll = new JScrollPane();
        
        drinkPanel = new JPanel();
        hotLabel = new JLabel();
        coldLabel = new JLabel();
        coldAdd = new JButton();
        hotAdd = new JButton();
        coldOrderLabel = new JLabel();
        hotOrderLabel = new JLabel();
        subDrinkPanel = new JPanel();
        hotScroll = new JScrollPane();

        coldScroll = new JScrollPane();
        
        bestPanel = new JPanel();
        bestLabel = new JLabel();
        yourLabel = new JLabel();
        subBestPanel = new JPanel();
        bestScroll = new JScrollPane();
        
        yourScroll = new JScrollPane();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        transPanel = new JPanel();
        labelTrans = new JLabel();
        scrollTrans = new JScrollPane();

        resetButton = new JButton();
        
        Data data = new Data();
        ArrayList<String> arrhot = new ArrayList();
        ArrayList<String> arrcold = new ArrayList();
        ArrayList<String> arrnoodle = new ArrayList();
        ArrayList<String> arrmeat = new ArrayList();
        ArrayList<String> arrrice = new ArrayList();
        ArrayList<String> arrseafood = new ArrayList();
        ArrayList<String> orderArr = new ArrayList();
        ArrayList<String> transArr = new ArrayList();
        ArrayList<String> bestArr = new ArrayList();
        
        try {
            arrhot = data.getDataHot();
            arrcold = data.getDataCold();
            arrnoodle = data.getDataNoodle();
            arrmeat = data.getDataMeat();
            arrrice = data.getDataRice();
            arrseafood = data.getDataSeafood();
            orderArr = data.getThisOrder();
            transArr = data.getDataTrans();
            bestArr = data.getDataBest();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] hot = getStringArray(arrhot);
        String[] cold = getStringArray(arrcold);
        String[] noodle = getStringArray(arrnoodle);
        String[] meat = getStringArray(arrmeat);
        String[] rice = getStringArray(arrrice);
        String[] seafood = getStringArray(arrseafood);
        String[] listOrder = getStringArray(orderArr);
        String[] trans = getStringArray(transArr);
        String[] best = getStringArray(bestArr);
        
        hotList = new JList<>(model(hot));
        coldList = new JList<>(model(cold));
        seaList = new JList<>(model(seafood));
        riceList = new JList<>(model(rice));
        meatList = new JList<>(model(meat));
        noodleList = new JList<>(model(noodle));
        orderList = new JList<>(model2(listOrder));
        listTrans = new JList<>(model3(trans));
        bestList = new JList<>(model4(best));
        
        BasePanel.setBackground(new java.awt.Color(239, 225, 198));
        BasePanel.setMaximumSize(new java.awt.Dimension(1000, 600));
        BasePanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        BasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(239, 225, 198));
        leftPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 110), 3, true));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btOrder.setText("Order");
        btOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btOrderActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        leftPanel.add(btOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 35));

        btTrans.setText("Transactions");
        btTrans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btTransActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        leftPanel.add(btTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 35));

        btProfile.setText("Profile");
        btProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btProfileActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        leftPanel.add(btProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 35));

        btLogout.setText("Logout");
        btLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        leftPanel.add(btLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 100, 35));
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("pic/Logo1.png").getImage().getScaledInstance(90,100, Image.SCALE_DEFAULT));
        logoLabel.setIcon(imageIcon);
        leftPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 100));

        BasePanel.add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 600));

        rightPanel.setBackground(new java.awt.Color(239, 225, 198));
        rightPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 110), 3, true));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProfilePanel.setBackground(new java.awt.Color(239, 225, 198));
        ProfilePanel.setPreferredSize(new java.awt.Dimension(850, 600));
        ProfilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCash.setBackground(new java.awt.Color(102, 102, 110));
        labelCash.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelCash.setForeground(new java.awt.Color(102, 102, 110));
        labelCash.setText("CASHIER");
        ProfilePanel.add(labelCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 23, -1, -1));

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
        llname.setText("Name");
        ProfilePanel.add(llname, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 132, 645, 30));

        lladdress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lladdress.setForeground(new java.awt.Color(102, 102, 110));
        lladdress.setText("Address");
        ProfilePanel.add(lladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 197, 645, 30));

        lluser.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lluser.setForeground(new java.awt.Color(102, 102, 110));
        lluser.setText("User");
        ProfilePanel.add(lluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 259, 645, 30));

        //rightPanel.add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        orderPanel.setBackground(new java.awt.Color(239, 225, 198));
        orderPanel.setPreferredSize(new java.awt.Dimension(850, 600));
        orderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderLabel.setBackground(new java.awt.Color(102, 102, 110));
        orderLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        orderLabel.setForeground(new java.awt.Color(102, 102, 110));
        orderLabel.setText("ORDER");
        orderPanel.add(orderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        drinkLabel1.setBackground(new java.awt.Color(102, 102, 110));
        drinkLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        drinkLabel1.setForeground(new java.awt.Color(102, 102, 110));
        drinkLabel1.setText("DRINK");
        orderPanel.add(drinkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        foodLabel1.setBackground(new java.awt.Color(102, 102, 110));
        foodLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        foodLabel1.setForeground(new java.awt.Color(102, 102, 110));
        foodLabel1.setText("FOOD");
        orderPanel.add(foodLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        orderButton.setText("Order");
        orderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    orderButtonActionPerformed(evt);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        orderPanel.add(orderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, -1, -1));
        
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    resetButtonActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        orderPanel.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, -1, -1));

        orderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dine In", "Take Away" }));
        orderPanel.add(orderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 110, -1));

        foodPanel.setBackground(new java.awt.Color(102, 102, 110));
        foodPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noodleLabel.setForeground(new java.awt.Color(250, 246, 234));
        noodleLabel.setText("Noodle");
        foodPanel.add(noodleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        riceLabel.setForeground(new java.awt.Color(250, 246, 234));
        riceLabel.setText("Rice");
        foodPanel.add(riceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        riceOrderLabel.setForeground(new java.awt.Color(250, 246, 234));
        riceOrderLabel.setText("");
        foodPanel.add(riceOrderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        noodleOrderLabel.setForeground(new java.awt.Color(250, 246, 234));
        noodleOrderLabel.setText("");
        foodPanel.add(noodleOrderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        riceAdd.setText("Add");
        riceAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    riceAddActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
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

        seaOrderLabel.setForeground(new java.awt.Color(250, 246, 234));
        seaOrderLabel.setText("");
        foodPanel.add(seaOrderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        meatOrderLabel.setForeground(new java.awt.Color(250, 246, 234));
        meatOrderLabel.setText("");
        foodPanel.add(meatOrderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        seaAdd.setText("Add");
        seaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    seaAddActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
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
        noodleList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  noodleOrderLabel.setText(noodleList.getSelectedValue().toString());
                }
            }
        });
        
        noodleScroll.setViewportView(noodleList);
        noodleScroll.setPreferredSize(new Dimension(202,160));
        
        subFoodPanel.add(noodleScroll);

        riceScroll.setBackground(new java.awt.Color(102, 102, 110));

        riceList.setBackground(new java.awt.Color(250, 246, 234));
        riceList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        riceList.setForeground(new java.awt.Color(102, 102, 110));
        riceList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  riceOrderLabel.setText(riceList.getSelectedValue().toString());
                }
            }
        });
        
        riceScroll.setViewportView(riceList);
        riceScroll.setPreferredSize(new Dimension(202,160));
        
        subFoodPanel.add(riceScroll);

        meatScroll.setBackground(new java.awt.Color(102, 102, 110));

        meatList.setBackground(new java.awt.Color(250, 246, 234));
        meatList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        meatList.setForeground(new java.awt.Color(102, 102, 110));
        meatList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  meatOrderLabel.setText(meatList.getSelectedValue().toString());
                }
            }
        });
        
        meatScroll.setViewportView(meatList);
        meatScroll.setPreferredSize(new Dimension(202,160));
            
        subFoodPanel.add(meatScroll);

        seaScroll.setBackground(new java.awt.Color(102, 102, 110));

        seaList.setBackground(new java.awt.Color(250, 246, 234));
        seaList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        seaList.setForeground(new java.awt.Color(102, 102, 110));
        seaList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  seaOrderLabel.setText(seaList.getSelectedValue().toString());
                }
            }
        });
        
        seaScroll.setViewportView(seaList);
        seaScroll.setPreferredSize(new Dimension(202,160));
        
        subFoodPanel.add(seaScroll);

        foodPanel.add(subFoodPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 160));

        orderPanel.add(foodPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 810, 230));

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
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        drinkPanel.add(hotAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 70, 30));

        coldOrderLabel.setForeground(new java.awt.Color(250, 246, 234));
        coldOrderLabel.setText("");
        drinkPanel.add(coldOrderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        hotOrderLabel.setForeground(new java.awt.Color(250, 246, 234));
        hotOrderLabel.setText("");
        drinkPanel.add(hotOrderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        subDrinkPanel.setBackground(new java.awt.Color(102, 102, 110));
        subDrinkPanel.setLayout(new javax.swing.BoxLayout(subDrinkPanel, javax.swing.BoxLayout.X_AXIS));

        hotScroll.setBackground(new java.awt.Color(102, 102, 110));

        hotList.setBackground(new java.awt.Color(250, 246, 234));
        hotList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hotList.setForeground(new java.awt.Color(102, 102, 110));
        hotList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  hotOrderLabel.setText(hotList.getSelectedValue().toString());
                }
            }
        });
        
        hotScroll.setViewportView(hotList);
        hotScroll.setPreferredSize(new Dimension(202,160));

        subDrinkPanel.add(hotScroll);

        coldScroll.setBackground(new java.awt.Color(102, 102, 110));

        coldList.setBackground(new java.awt.Color(250, 246, 234));
        coldList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        coldList.setForeground(new java.awt.Color(102, 102, 110));
        coldList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  coldOrderLabel.setText(coldList.getSelectedValue().toString());
                }
            }
        });
        
        coldScroll.setViewportView(coldList);
        coldScroll.setPreferredSize(new Dimension(202,160));
        
        subDrinkPanel.add(coldScroll);

        drinkPanel.add(subDrinkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 410, 140));

        orderPanel.add(drinkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 410, 210));

        bestPanel.setBackground(new java.awt.Color(102, 102, 110));
        bestPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bestLabel.setForeground(new java.awt.Color(250, 246, 234));
        bestLabel.setText("Best Selling");
        bestPanel.add(bestLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        yourLabel.setForeground(new java.awt.Color(250, 246, 234));
        yourLabel.setText("Your Order");
        bestPanel.add(yourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        subBestPanel.setBackground(new java.awt.Color(102, 102, 110));
        subBestPanel.setLayout(new javax.swing.BoxLayout(subBestPanel, javax.swing.BoxLayout.X_AXIS));

        bestScroll.setBackground(new java.awt.Color(102, 102, 110));

        bestList.setBackground(new java.awt.Color(250, 246, 234));
        bestList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bestList.setForeground(new java.awt.Color(102, 102, 110));
        bestScroll.setViewportView(bestList);
        bestScroll.setPreferredSize(new Dimension(202,160));
        subBestPanel.add(bestScroll);

        yourScroll.setBackground(new java.awt.Color(102, 102, 110));

        orderList.setBackground(new java.awt.Color(250, 246, 234));
        orderList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        orderList.setForeground(new java.awt.Color(102, 102, 110));

        yourScroll.setViewportView(orderList);
        
        yourScroll.setPreferredSize(new Dimension(202,160));

        subBestPanel.add(yourScroll);

        bestPanel.add(subBestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 380, 180));

        orderPanel.add(bestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 380, 210));

        jLabel1.setForeground(new java.awt.Color(102, 102, 110));
        jLabel1.setText("Total: ");
        orderPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 110));
        try {
            jLabel2.setText(totalHarga());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
        }
        orderPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 60, -1));

        //rightPanel.add(orderPanel, "card2");

        transPanel.setBackground(new java.awt.Color(239, 225, 198));
        transPanel.setPreferredSize(new java.awt.Dimension(850, 600));
        transPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTrans.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTrans.setForeground(new java.awt.Color(102, 102, 110));
        labelTrans.setText("TRANSACTIONS");
        transPanel.add(labelTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 25, -1, -1));

        scrollTrans.setBorder(null);

        listTrans.setBackground(new java.awt.Color(239, 225, 198));
        listTrans.setForeground(new java.awt.Color(102, 102, 110));
        scrollTrans.setViewportView(listTrans);

        transPanel.add(scrollTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 69, 791, 456));

        //rightPanel.add(transPanel, "card2");

        BasePanel.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 850, 600));

       // getContentPane().add(BasePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
       return BasePanel;
    }
    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        removeAll();
        repaint();
        revalidate();
        Control panel = new Home();
        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        repaint();
        revalidate();
    }  
    
    private void btProfileActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException {    
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        setPanel(ProfilePanel);
        rightPanel.repaint();
        rightPanel.revalidate();
    }    
    
    private void btOrderActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException {                                       
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        setPanel(orderPanel);
        rightPanel.repaint();
        rightPanel.revalidate();
    }                                      

    
    private void btTransActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException {                                         
        Data data = new Data();
        String lastLog = data.getLastLogin();
        String[] splitted = lastLog.split("\\;");
        removeAll();
        repaint();
        revalidate();
        Cashier panel = new Cashier();
        panel.setPanel(panel.transPanel);
        panel.setLabel(splitted[0], splitted[1], splitted[2]);
        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        repaint();
        revalidate();
    }                                                                                 
    
    private void coldAddActionPerformed(java.awt.event.ActionEvent evt) throws IOException { 
        Data data = new Data();
        String str = coldOrderLabel.getText();
        String kosong = "";
        if(!str.equals(kosong)){
            data.addThisOrder(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Cashier panel = new Cashier();
            panel.setPanel(panel.orderPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                       

    private void hotAddActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {                                       
        Data data = new Data();
        String str = hotOrderLabel.getText();
        String kosong = "";
        if(!str.equals(kosong)){
            data.addThisOrder(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Cashier panel = new Cashier();
            panel.setPanel(panel.orderPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                      

    private void riceAddActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {                                        
        Data data = new Data();
        String str = riceOrderLabel.getText();
        String kosong = "";
        if(!str.equals(kosong)){
            data.addThisOrder(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Cashier panel = new Cashier();
            panel.setPanel(panel.orderPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                       

    private void noodleAddActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {                                          
        Data data = new Data();
        String str = noodleOrderLabel.getText();
        String kosong = "";
        if(!str.equals(kosong)){
            data.addThisOrder(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Cashier panel = new Cashier();
            panel.setPanel(panel.orderPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                         
    private void seaAddActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {                                       
        Data data = new Data();
        String str = seaOrderLabel.getText();
        String kosong = "";
        if(!str.equals(kosong)){
            data.addThisOrder(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Cashier panel = new Cashier();
            panel.setPanel(panel.orderPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                      
    private void meatAddActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {  
        Data data = new Data();
        String str = meatOrderLabel.getText();
        String kosong = "";
        if(!str.equals(kosong)){
            data.addThisOrder(str);
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Cashier panel = new Cashier();
            panel.setPanel(panel.orderPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate();
        }
    }                                       
    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {                                           
        Data data = new Data();
        String total = jLabel2.getText();
        int Total =  Integer.parseInt(total);
        ArrayList<String> listOrder = new ArrayList();
        listOrder = data.getThisOrder();
        JTextField textField1 = new JTextField();
        Object[] inputFields = {"Total Price: " + total,
            "Order Method: " + orderCombo.getSelectedItem().toString(),
            " ",
            "Total Payment: ", textField1};
        
        String kosong = "";
        int option = JOptionPane.showConfirmDialog(this, inputFields, "Payment", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(option == JOptionPane.OK_OPTION && !textField1.getText().equals(kosong)){
            int inp = Integer.parseInt(textField1.getText());
            int kembalian = inp - Total;
            String Kembalian = Integer.toString(kembalian);
            JOptionPane.showMessageDialog(this, "Total Change: " + Kembalian, "Change", JOptionPane.PLAIN_MESSAGE);
            String str = "" + listOrder.get(1);
            for(int i = 2; i < listOrder.size(); i++){
                str+= ";" + listOrder.get(i);
            }
            str += "$" + orderCombo.getSelectedItem().toString();
            str += "$" + total;
            str += "$" + textField1.getText();
            str += "$" + kembalian;
            
            data.addDataTrans(str);
            data.newOrder();
            String lastLog = data.getLastLogin();
            String[] splitted = lastLog.split("\\;");
            removeAll();
            repaint();
            revalidate();
            Cashier panel = new Cashier();
            panel.setPanel(panel.orderPanel);
            panel.setLabel(splitted[0], splitted[1], splitted[2]);
            add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
            repaint();
            revalidate(); 
        }
    }   
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                           
        Data data = new Data();
        data.newOrder();
        String lastLog = data.getLastLogin();
        String[] splitted = lastLog.split("\\;");
        removeAll();
        repaint();
        revalidate();
        Cashier panel = new Cashier();
        panel.setPanel(panel.orderPanel);
        panel.setLabel(splitted[0], splitted[1], splitted[2]);
        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
        repaint();
        revalidate(); 
    }   
    public void setLabel(String nama,String address, String user){
        llname.setText(nama);
        lladdress.setText(address);
        lluser.setText(user);
    }
    public static String[] getStringArray(ArrayList<String> arr){
  
        // declaration and initialise String Array
        String str[] = new String[arr.size()];
  
        // ArrayList to Array Conversion
        for (int j = 0; j < arr.size(); j++) {
  
            // Assign each value to String array
            str[j] = arr.get(j);
        }
  
        return str;
    }
    DefaultListModel<String> model(String[] str){
        DefaultListModel<String> myModel = new DefaultListModel<>();
        for (String s : str) {
            String[] splitted = s.split("\\;");
            String ss = splitted[0] + "-" + splitted[1];
            myModel.addElement(ss);
        }
        return myModel;
    }
    DefaultListModel<String> model2(String[] str){
        DefaultListModel<String> myModel = new DefaultListModel<>();
        for (String s : str) {
            String ss = s;
            if(!ss.equals("null-0")){
                myModel.addElement(ss);               
            }
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
    DefaultListModel<String> model4(String[] str){
        DefaultListModel<String> myModel = new DefaultListModel<>();
            for (int i = 0; i < str.length; i++) {
                String[] splitted = str[i].split("\\;");
                String ss = splitted[0];
                myModel.addElement(ss);
                if(i == 4){
                    break;
                }
            }
        return myModel;
    }
    public void setPanel(JPanel panel){
        rightPanel.removeAll();
        rightPanel.repaint();
        rightPanel.revalidate();
        rightPanel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -15, 850, 600));
        rightPanel.repaint();
        rightPanel.revalidate();     
    }
    String totalHarga() throws FileNotFoundException{
        Data data = new Data();
        ArrayList<String> dataOrder = new ArrayList();
        dataOrder = data.getThisOrder();
        String[] Order = getStringArray(dataOrder);
        int Total = 0;
        for(String i : Order){
            String[] splitted = i.split("\\-");
            String str = splitted[1];
            int j = Integer.parseInt(str);
            Total += j;
        }
        String mystr = Integer.toString(Total);
        return mystr;
    }
    
}
     