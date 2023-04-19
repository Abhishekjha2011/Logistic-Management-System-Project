package Logistic_MS;

import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.Connection;
//import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main_page extends javax.swing.JFrame {
    String d1=null;
    String d2=null;
    public Main_page(){
        initComponents();
        setSize(1200,600);
        setLocation(100,100);
        setResizable(false);
        setTitle("Logistics Management System");
        CurrentTimeDate();
    }
    public void CurrentTimeDate()
    {
        Thread clock;
        clock = new Thread()
        {
            public void run()
            {
                for(;;)
                {
                    Calendar cal=new GregorianCalendar();
                    Date date = new Date();
                    SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm:ss aa");
                    String time = formatTime.format(date);
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    int month=cal.get(Calendar.MONTH);
                    int year=cal.get(Calendar.YEAR);
                    
                    TFdate.setText(""+day+"/"+(month+1)+"/"+year);
                    TFtime.setText(time);
                    d1=(""+day+"/"+(month+1)+"/"+year);
                    d2=(time);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main_page.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        clock.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tra1 = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        st1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        st2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        Lo1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        Lo2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        Lo3 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel15 = new javax.swing.JLabel();
        Tra2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TraD = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TraD1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Bg1 = new javax.swing.JLabel();
        Other = new javax.swing.JPanel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Uo1 = new javax.swing.JComboBox();
        Uo2 = new javax.swing.JComboBox();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        t8 = new javax.swing.JTextField();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Uo3 = new javax.swing.JComboBox();
        Uo4 = new javax.swing.JComboBox();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        t9 = new javax.swing.JTextField();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jLabel22 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        check1 = new javax.swing.JCheckBox();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        TFtime = new javax.swing.JLabel();
        TFdate = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        Bg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Home.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Logistics Management System");
        Home.add(jLabel14);
        jLabel14.setBounds(340, 10, 620, 60);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transaction ID:");
        Home.add(jLabel1);
        jLabel1.setBounds(60, 70, 100, 20);

        Tra1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        Home.add(Tra1);
        Tra1.setBounds(160, 70, 130, 22);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sender's Name:");

        t1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sender's Address:");

        t2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sender's Contact No:");

        t3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        st1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        st1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Delhi", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        st1.setToolTipText("Select State");

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(t1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(t2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(t3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(st1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Home.add(jLayeredPane1);
        jLayeredPane1.setBounds(60, 100, 500, 180);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recevier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Receiver's Name:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Receiver's Address:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Receiver's Contact No:");

        t4.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        t5.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        t6.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        st2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        st2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select State", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Delhi", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        st2.setToolTipText("");
        st2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st2ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(t6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(st2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(jButton8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(35, 35, 35)
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton8))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Home.add(jLayeredPane2);
        jLayeredPane2.setBounds(650, 100, 500, 180);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logistic Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Type:");

        Lo1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Lo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Envalop", "Box", "Wrap", "Other" }));
        Lo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lo1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Weight:");

        Lo2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Lo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Weight", "Below 1Kg", "1Kg-10Kg", "Above 10Kg" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Service (As per Customer need):");

        Lo3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Lo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Sevice", "Standard Service", "Overnight Service", "Same Day Exp Service" }));
        Lo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lo3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Charges (Including all Taxes):");

        t7.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        t7.setForeground(new java.awt.Color(51, 0, 150));

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton11.setText("Clear");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Lo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Lo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Lo3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(t7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lo1, 0, 186, Short.MAX_VALUE)
                            .addComponent(Lo2, 0, 186, Short.MAX_VALUE)
                            .addComponent(Lo3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t7))))
                .addGap(76, 76, 76))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Lo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Lo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Lo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton11))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Home.add(jLayeredPane3);
        jLayeredPane3.setBounds(60, 290, 445, 210);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Track Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Transaction ID:");

        Tra2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jButton7.setText("Go");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton10.setText("Clear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        TraD.setColumns(20);
        TraD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TraD.setRows(5);
        jScrollPane1.setViewportView(TraD);

        TraD1.setColumns(20);
        TraD1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TraD1.setRows(5);
        jScrollPane2.setViewportView(TraD1);

        jLayeredPane4.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(Tra2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tra2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Tra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        Home.add(jLayeredPane4);
        jLayeredPane4.setBounds(650, 290, 500, 210);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton5.setText("DONE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Home.add(jButton5);
        jButton5.setBounds(540, 360, 90, 30);

        jButton4.setText("<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Home.add(jButton4);
        jButton4.setBounds(300, 70, 50, 23);

        jButton9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 15)); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Home.add(jButton9);
        jButton9.setBounds(550, 410, 70, 30);

        Bg1.setForeground(new java.awt.Color(255, 255, 255));
        Bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logistic_MS/Pictures/Pics1.jpg"))); // NOI18N
        Bg1.setText("jLabel2");
        Home.add(Bg1);
        Bg1.setBounds(0, 0, 1200, 540);

        jTabbedPane1.addTab("Home", Home);

        Other.setLayout(null);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Logistic Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Order status(from Sender):");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Transaction ID:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Order status(from Receiver):");

        Uo1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Uo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delivery Status", "Shipping", "Delivered(From Sender)", "Not Delivered", "Canceled" }));
        Uo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Uo1ActionPerformed(evt);
            }
        });

        Uo2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Uo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delivery Status", "Arraived", "Delivered(To Reciver)", "Not Delivered", "Return" }));
        Uo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Uo2ActionPerformed(evt);
            }
        });

        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Sender Confirmation");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Receiver Confirmation");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        t8.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jLayeredPane5.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(Uo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(Uo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(t8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane5Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Uo2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jLayeredPane5Layout.createSequentialGroup()
                            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17))
                            .addGap(18, 18, 18)
                            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Uo1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t8))))
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Uo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Uo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12)
                        .addGap(38, 38, 38))))
        );

        Other.add(jLayeredPane5);
        jLayeredPane5.setBounds(40, 70, 480, 220);

        jLayeredPane6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Update Logistic Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Order status(from Sender):");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Transaction ID:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Order status(from Receiver):");

        Uo3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Uo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delivery Status", "Shipping", "Delivered(From Sender)", "Not Delivered", "Canceled" }));
        Uo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Uo3ActionPerformed(evt);
            }
        });

        Uo4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Uo4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delivery Status", "Arraived", "Delivered(To Reciver)", "Not Delivered", "Return" }));
        Uo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Uo4ActionPerformed(evt);
            }
        });

        jButton15.setText("Clear");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Update Status (Sender)");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Update Status (Receiver)");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        t9.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        jLayeredPane6.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(Uo3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(Uo4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jButton15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jButton17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(t9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Uo4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jLayeredPane6Layout.createSequentialGroup()
                            .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20))
                            .addGap(18, 18, 18)
                            .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Uo3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t9))))
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Uo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Uo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton15)
                        .addGap(38, 38, 38))))
        );

        Other.add(jLayeredPane6);
        jLayeredPane6.setBounds(690, 70, 480, 220);

        jLayeredPane7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Delete Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Transaction ID:");

        t10.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        check1.setBackground(new java.awt.Color(0, 0, 51));
        check1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        check1.setForeground(new java.awt.Color(255, 255, 255));
        check1.setText("Confirm Before Delete");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });

        jButton18.setText("Delete");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Clear");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLayeredPane7.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(t10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(check1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jButton18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jButton19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(check1))
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(t10, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addGap(105, 105, 105))
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check1)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        Other.add(jLayeredPane7);
        jLayeredPane7.setBounds(40, 340, 480, 130);

        TFtime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TFtime.setForeground(new java.awt.Color(255, 255, 255));
        TFtime.setText("Time");
        Other.add(TFtime);
        TFtime.setBounds(540, 90, 130, 21);

        TFdate.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        TFdate.setForeground(new java.awt.Color(255, 255, 255));
        TFdate.setText("Date");
        Other.add(TFdate);
        TFdate.setBounds(550, 110, 130, 21);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Logistics Management System");
        Other.add(jLabel23);
        jLabel23.setBounds(340, 10, 620, 60);

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton20.setText("DONE");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        Other.add(jButton20);
        jButton20.setBounds(690, 340, 90, 30);

        Bg2.setForeground(new java.awt.Color(255, 255, 255));
        Bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logistic_MS/Pictures/Pics1.jpg"))); // NOI18N
        Bg2.setText("jLabel2");
        Other.add(Bg2);
        Bg2.setBounds(4, -4, 1190, 530);

        jTabbedPane1.addTab("Other", Other);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1200, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lo1ActionPerformed

    private void Lo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lo3ActionPerformed

    private void st2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login_FE().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Trans;
        Trans=Tra1.getText();
        String S_state=null;
        if(st1.getSelectedIndex()==1)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==2)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==3)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==4)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==5)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==6)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==7)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==8)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==9)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==10)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==11)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==12)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==13)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==14)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==15)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==16)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==17)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==18)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==19)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==20)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==21)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==22)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==23)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==24)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==25)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==26)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==27)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==28)
        {
            S_state=st1.getSelectedItem().toString();
        }else if(st1.getSelectedIndex()==29)
        {
            S_state=st1.getSelectedItem().toString(); 
        }else if(st1.getSelectedIndex()==30)
        {
            S_state=st1.getSelectedItem().toString();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Select State");
        }
        
        
        String S_name=t1.getText();
        String S_addres=t2.getText();
        String S_contact=t3.getText();
        
        if((t1.getText()==null)||(t2.getText()==null)||(t3.getText()==null))
        {
            JOptionPane.showMessageDialog(this,"Please Enter All Details of Sender.");
        }
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection c1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
                Statement s1=(Statement)c1.createStatement();
                String que1="insert into sender_lms values('"+Trans+"','"+S_name+"','"+S_addres+"','"+S_state+"','"+S_contact+"');";
                s1.executeUpdate(que1);
                JOptionPane.showMessageDialog(null,"Sender Details are Saved.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
       Tra2.setText(null);
       TraD.setText(null);
       TraD1.setText(null);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //receiver
        String Trans;
        Trans=Tra1.getText();
        String R_state=null;
        String R_name=t4.getText();
        String R_addres=t5.getText();
        String R_contact=t6.getText();
        
        if(st2.getSelectedIndex()==1)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==2)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==3)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==4)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==5)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==6)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==7)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==8)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==9)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==10)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==11)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==12)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==13)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==14)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==15)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==16)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==17)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==18)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==19)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==20)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==21)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==22)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==23)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==24)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==25)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==26)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==27)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==28)
        {
            R_state=st2.getSelectedItem().toString();
        }else if(st2.getSelectedIndex()==29)
        {
            R_state=st2.getSelectedItem().toString(); 
        }else if(st2.getSelectedIndex()==30)
        {
            R_state=st2.getSelectedItem().toString();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Select State");
        }
        
        if((t4.getText()==null)||(t5.getText()==null)||(t6.getText()==null))
        {
            JOptionPane.showMessageDialog(this,"Please Enter All Details of Sender.");
        }
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection c1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
                Statement s1=(Statement)c1.createStatement();
                String que1="insert into receiver_lms values('"+Trans+"','"+R_name+"','"+R_addres+"','"+R_state+"','"+R_contact+"');";
                s1.executeUpdate(que1);
                JOptionPane.showMessageDialog(null,"Recevier Details are Saved.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Tra1.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Tra1.setText(null);
        
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        t5.setText(null);
        t6.setText(null);
        t7.setText(null);
        
        st1.setSelectedIndex(0);
        st2.setSelectedIndex(0);
        Lo1.setSelectedIndex(0);
        Lo2.setSelectedIndex(0);
        Lo3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //sender clear
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        st1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //receiver clear
        t4.setText(null);
        t5.setText(null);
        t6.setText(null);
        st2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        //Logistic details clear
        Lo1.setSelectedIndex(0);
        Lo2.setSelectedIndex(0);
        Lo3.setSelectedIndex(0);
        t7.setText(null);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Logistic Details
        String Trans=null;
        Trans=Tra1.getText();
                
        String P_type=null;
        String P_weight=null;
        String P_service=null;
        String P_charge=t7.getText();
        //Parcel Type...
        if(Lo1.getSelectedIndex()==1)
        {
            P_type=Lo1.getSelectedItem().toString();
        }else if(Lo1.getSelectedIndex()==2)
        {
            P_type=Lo1.getSelectedItem().toString();
        }else if(Lo1.getSelectedIndex()==3)
        {
            P_type=Lo1.getSelectedItem().toString();
        }else if(Lo1.getSelectedIndex()==4)
        {
            P_type=Lo1.getSelectedItem().toString();
        }else
            JOptionPane.showMessageDialog(null,"Select Parcel Type");
        //Parcel Weight.....................
        
        if(Lo2.getSelectedIndex()==1)
        {
            P_weight=Lo2.getSelectedItem().toString();
        }else if(Lo2.getSelectedIndex()==2)
        {
            P_weight=Lo2.getSelectedItem().toString();
        }else if(Lo2.getSelectedIndex()==3)
        {
            P_weight=Lo2.getSelectedItem().toString();
        }else
            JOptionPane.showMessageDialog(null,"Select Parcel Weight");
        //Parcel Service....................

        if(Lo3.getSelectedIndex()==1)
        {
            P_service=Lo3.getSelectedItem().toString();
        }else if(Lo3.getSelectedIndex()==2)
        {
            P_service=Lo3.getSelectedItem().toString();
        }else if(Lo3.getSelectedIndex()==3)
        {
            P_service=Lo3.getSelectedItem().toString();
        }else
        {
            JOptionPane.showMessageDialog(null,"Select Parcel Weight");
        }
        if(Tra1.getText()==null)
        {
            JOptionPane.showMessageDialog(null, "Enter Transaction ID of Sender.!");
        }else
        {
            try
            {
              Class.forName("java.sql.DriverManager");
              Connection c3=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
              Statement s3=(Statement)c3.createStatement();
              String que3="insert into Parcel_lms values('"+Trans+"','"+P_type+"','"+P_weight+"','"+P_service+"','"+P_charge+"');";
              s3.executeUpdate(que3);
               JOptionPane.showMessageDialog(null,"Parcel Details are Saved.");
            }catch(Exception e)
         {
             JOptionPane.showMessageDialog(this, e.getMessage());
         }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Uo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Uo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Uo1ActionPerformed

    private void Uo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Uo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Uo2ActionPerformed

    private void Uo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Uo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Uo3ActionPerformed

    private void Uo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Uo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Uo4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        //Logistics status
        t8.setText(null);
        Uo1.setSelectedIndex(0);
        Uo2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        //Update logistics status
        t9.setText(null);
        Uo3.setSelectedIndex(0);
        Uo4.setSelectedIndex(0);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        //Deletion section
        String Trans=null;
                Trans=t10.getText();
                
        if(Trans==null)
        {
            JOptionPane.showMessageDialog(null,"Enter Transaction ID...");
        }else
        {
            if(check1.isSelected()==true)
            {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection c9=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
                Statement s9=(Statement)c9.createStatement();
                String delete1="DELETE FROM sender_lms WHERE Tr_id='"+Trans+"'";
                String delete2="DELETE FROM receiver_lms WHERE Tr_id='"+Trans+"'";
                String delete3="DELETE FROM parcel_lms WHERE Tr_id='"+Trans+"'";
                String delete4="DELETE FROM backend_send WHERE Tr_id='"+Trans+"'";
                String delete5="DELETE FROM backend_rercive WHERE Tr_id='"+Trans+"'";
                s9.execute(delete1);
                s9.execute(delete2);
                s9.execute(delete3);
                s9.execute(delete4);
                s9.execute(delete5);
                JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            }else
            {
                JOptionPane.showMessageDialog(null,"Please Confirm Before Deletion..\nSelect The CheckBox..");
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        //Other Done button
        t8.setText(null);
        t9.setText(null);
        t10.setText(null);
        Uo1.setSelectedIndex(0);
        Uo2.setSelectedIndex(0);
        Uo3.setSelectedIndex(0);
        Uo4.setSelectedIndex(0);
        check1.setSelected(false);
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        t10.setText(null);
        check1.setSelected(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        //set status sender
                String Trans=null;
                Trans=t8.getText();
                
        String stat1=null;
        if(Uo1.getSelectedIndex()==1)
        {
           stat1=Uo1.getSelectedItem().toString();
        }else if(Uo1.getSelectedIndex()==2)
        {
            stat1=Uo1.getSelectedItem().toString();
        }else if(Uo1.getSelectedIndex()==3)
        {
            stat1=Uo1.getSelectedItem().toString();
        }else if(Uo1.getSelectedIndex()==4)
        {
            stat1=Uo1.getSelectedItem().toString();
        }else
        {
            JOptionPane.showMessageDialog(null,"Select Valid Status (Sender)");
        }
        if(Trans==null)
        {
            JOptionPane.showMessageDialog(null,"Enter Transaction ID...");
        }else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection c5=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
                Statement s5=(Statement)c5.createStatement();
                String status1="insert into backend_send values('"+Trans+"','"+stat1+"','"+d1+"','"+d2+"');";
                s5.executeUpdate(status1);
                JOptionPane.showMessageDialog(null,"Sender's Status Saved");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        //Set status recevier
        String Trans=null;
                Trans=t8.getText();
                
        String stat2=null;
        if(Uo2.getSelectedIndex()==1)
        {
           stat2=Uo2.getSelectedItem().toString();
        }else if(Uo2.getSelectedIndex()==2)
        {
            stat2=Uo2.getSelectedItem().toString();
        }else if(Uo2.getSelectedIndex()==3)
        {
            stat2=Uo2.getSelectedItem().toString();
        }else if(Uo2.getSelectedIndex()==4)
        {
            stat2=Uo2.getSelectedItem().toString();
        }else
        {
            JOptionPane.showMessageDialog(null,"Select Valid Status (Reciver)");
        }
        if(Trans==null)
        {
            JOptionPane.showMessageDialog(null,"Enter Transaction ID...");
        }else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection c6=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
                Statement s6=(Statement)c6.createStatement();
                String status2="insert into backend_rercive values('"+Trans+"','"+stat2+"','"+d1+"','"+d2+"');";
                s6.executeUpdate(status2);
                JOptionPane.showMessageDialog(null,"Reciver's Status Saved");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        //Update Sender
        String Trans=null;
                Trans=t9.getText();
                
        String stat3=null;
        if(Uo3.getSelectedIndex()==1)
        {
           stat3=Uo3.getSelectedItem().toString();
        }else if(Uo3.getSelectedIndex()==2)
        {
            stat3=Uo3.getSelectedItem().toString();
        }else if(Uo3.getSelectedIndex()==3)
        {
            stat3=Uo3.getSelectedItem().toString();
        }else if(Uo3.getSelectedIndex()==4)
        {
            stat3=Uo3.getSelectedItem().toString();
        }else
        {
            JOptionPane.showMessageDialog(null,"Select Valid Status for Update:(Sender)");
        }
        if(Trans==null)
        {
            JOptionPane.showMessageDialog(null,"Enter Transaction ID...");
        }else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection c7=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
                Statement s7=(Statement)c7.createStatement();
                String update1="UPDATE backend_send SET P_status_s='"+stat3+"',Date='"+d1+"',Time='"+d2+"' WHERE Tr_id='"+Trans+"'";
                s7.execute(update1);
                JOptionPane.showMessageDialog(null,"Status Updated:(Sender)");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        //update receiver
        String Trans=null;
               Trans=t9.getText();
               
        String stat4=null;
        if(Uo4.getSelectedIndex()==1)
        {
           stat4=Uo4.getSelectedItem().toString();
        }else if(Uo4.getSelectedIndex()==2)
        {
            stat4=Uo4.getSelectedItem().toString();
        }else if(Uo4.getSelectedIndex()==3)
        {
            stat4=Uo4.getSelectedItem().toString();
        }else if(Uo4.getSelectedIndex()==4)
        {
            stat4=Uo4.getSelectedItem().toString();
        }else
        {
            JOptionPane.showMessageDialog(null,"Select Valid Status for Update:(Reciver)");
        }
        //
        if(Trans==null)
        {
           JOptionPane.showMessageDialog(null,"Enter Transaction ID..."); 
        }else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection c8=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
                Statement s8=(Statement)c8.createStatement();
                String update2="UPDATE backend_rercive SET P_status_r='"+stat4+"',Date='"+d1+"',Time='"+d2+"' WHERE Tr_id='"+Trans+"'";
                s8.execute(update2);
                JOptionPane.showMessageDialog(null,"Status Updated:(Reciver)");
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //track order
        String Trans=null;
                Trans=Tra2.getText();
                
        if(Trans==null)
        {
            JOptionPane.showMessageDialog(null,"Enter Transaction ID...");
        }else
        {
        try
        {
            Class.forName("java.sql.DriverManager");
            
            Connection c4=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_java","root","1234");
            
            Statement stq1=(Statement)c4.createStatement();
            Statement stq2=(Statement)c4.createStatement();
            Statement stq3=(Statement)c4.createStatement();
            Statement stq4=(Statement)c4.createStatement();
            
            
            String track1 = "Select Tr_id,S_name,S_add,S_state from sender_lms where Tr_id ='"+Trans+"';";
            String track2 = "Select Tr_id,R_name,R_add,R_state from receiver_lms where Tr_id ='"+Trans+"';";
            String track3 = "Select P_status_s from backend_send where Tr_id ='"+Trans+"';";
            String track4 = "Select P_status_r from backend_rercive where Tr_id ='"+Trans+"';";
            
            ResultSet rs1=stq1.executeQuery(track1);
            ResultSet rs2=stq2.executeQuery(track2);
            ResultSet rs3=stq3.executeQuery(track3);
            ResultSet rs4=stq4.executeQuery(track4);
            
            while((rs1.next())&&(rs2.next())&&(rs3.next())&&(rs4.next()))
                    {
                        String s1=rs1.getString("Tr_id");
                        String s2=rs1.getString("S_name");
                        String s3=rs1.getString("S_add");
                        String s4=rs1.getString("S_state");
                        
                        String s5=rs2.getString("Tr_id");
                        String s6=rs2.getString("R_name");
                        String s7=rs2.getString("R_add");
                        String s8=rs2.getString("R_state");
                        
                        String s9=rs3.getString("p_status_s");
                        String s10=rs4.getString("p_status_r");
                        
                        TraD.setText("--Tracking Sender--\nTransaction ID:  "+s1+"\nSender Name:  "+s2+"\nSender Address:  "+s3+"\nSender State:  "+s4+"\nSender Parcel Status:  "+s9);
                        TraD1.setText("--Tracking Reciver--\nTransaction ID:  "+s5+"\nReceiver Name:  "+s6+"\nReceiver Address:  "+s7+"\nReceiver State:  "+s8+"\nReciver Parcel Status:  "+s10);
                    }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
      }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg1;
    private javax.swing.JLabel Bg2;
    private javax.swing.JPanel Home;
    private javax.swing.JComboBox Lo1;
    private javax.swing.JComboBox Lo2;
    private javax.swing.JComboBox Lo3;
    private javax.swing.JPanel Other;
    private javax.swing.JLabel TFdate;
    private javax.swing.JLabel TFtime;
    private javax.swing.JTextField Tra1;
    private javax.swing.JTextField Tra2;
    private javax.swing.JTextArea TraD;
    private javax.swing.JTextArea TraD1;
    private javax.swing.JComboBox Uo1;
    private javax.swing.JComboBox Uo2;
    private javax.swing.JComboBox Uo3;
    private javax.swing.JComboBox Uo4;
    private javax.swing.JCheckBox check1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> st1;
    private javax.swing.JComboBox st2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
