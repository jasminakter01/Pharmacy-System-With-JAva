 
package Pharmachy_Management_Final;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Madechine_Purchase extends javax.swing.JFrame {
 Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int id=0,i=0;
    public Madechine_Purchase(String status) {
        initComponents();
        showsm();
        showssup();
        billNO();
            statusl.setText(status);
            
     if(status.equals("Admin")){
     
      }
      else{  Sample_Button.setVisible(false);
      Sample_Button1.setVisible(false);
      Sample_Button2.setVisible(false);
          Sample_Button3.setVisible(false);
          Sample_Button4.setVisible(false);
      jButton4.setVisible(false);}
    }

    private Madechine_Purchase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        today_amm = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        bill = new javax.swing.JLabel();
        bill1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        paidd = new javax.swing.JTextField();
        deu = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        OLD_ammount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Total_Ammount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Sample_Button = new javax.swing.JButton();
        Sample_Button1 = new javax.swing.JButton();
        Sample_Button2 = new javax.swing.JButton();
        sample_Bill_Button1 = new javax.swing.JButton();
        Sample_Button3 = new javax.swing.JButton();
        Sample_Button4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        statusl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Madicine", "Purchase Price", "Sales Price", "Quantity", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 870, 370);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 140, 360, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel8);
        jLabel8.setBounds(390, 140, 230, 20);

        today_amm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        today_amm.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(today_amm);
        today_amm.setBounds(30, 620, 190, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Paid :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(460, 540, 80, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(30, 90, 290, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(30, 40, 290, 40);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField5);
        jTextField5.setBounds(330, 100, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(330, 80, 150, 20);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(330, 50, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Purchase Price");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(330, 30, 130, 20);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField2);
        jTextField2.setBounds(470, 50, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sales Price");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(470, 30, 130, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(610, 30, 110, 20);

        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(610, 50, 110, 30);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("0");
        jPanel3.add(jTextField4);
        jTextField4.setBounds(730, 50, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Price");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(730, 30, 160, 20);

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(690, 90, 100, 40);

        jButton9.setBackground(new java.awt.Color(204, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(790, 90, 100, 40);

        bill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bill.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(bill);
        bill.setBounds(110, 10, 210, 20);

        bill1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bill1.setForeground(new java.awt.Color(255, 255, 255));
        bill1.setText("Bill NO :");
        jPanel3.add(bill1);
        bill1.setBounds(30, 10, 80, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Old Ammount :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 540, 160, 20);

        paidd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paidd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paiddMouseClicked(evt);
            }
        });
        paidd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paiddActionPerformed(evt);
            }
        });
        paidd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paiddKeyPressed(evt);
            }
        });
        jPanel3.add(paidd);
        paidd.setBounds(460, 560, 160, 30);

        deu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deu.setForeground(new java.awt.Color(255, 255, 255));
        deu.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                deuVetoableChange(evt);
            }
        });
        jPanel3.add(deu);
        deu.setBounds(630, 560, 180, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Due");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(630, 540, 80, 20);

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Ok");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(840, 570, 70, 40);

        OLD_ammount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OLD_ammount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(OLD_ammount);
        OLD_ammount.setBounds(30, 560, 190, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Today Ammount:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(30, 600, 190, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Total");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(240, 540, 190, 20);

        Total_Ammount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Total_Ammount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Total_Ammount);
        Total_Ammount.setBounds(240, 560, 190, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(370, 80, 1000, 660);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Purchase");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(70, 0, 750, 50);

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Purchase Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(700, 50, 160, 30);

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Supplier Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(860, 50, 140, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13);
        jLabel13.setBounds(950, 0, 50, 40);

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("-");
        jLabel105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel105MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel105);
        jLabel105.setBounds(910, 0, 40, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(370, 0, 1000, 80);

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setLayout(null);

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Stock");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(30, 280, 290, 40);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(30, 80, 290, 40);

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Purchase");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(30, 120, 290, 40);

        jButton7.setBackground(new java.awt.Color(204, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Sales");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7);
        jButton7.setBounds(30, 160, 290, 40);

        jButton8.setBackground(new java.awt.Color(204, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Madechine Info");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8);
        jButton8.setBounds(30, 200, 290, 40);

        Sample_Button.setBackground(new java.awt.Color(204, 0, 0));
        Sample_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sample_Button.setForeground(new java.awt.Color(255, 255, 255));
        Sample_Button.setText("Sample Purchase");
        Sample_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sample_ButtonActionPerformed(evt);
            }
        });
        jPanel5.add(Sample_Button);
        Sample_Button.setBounds(30, 320, 290, 40);

        Sample_Button1.setBackground(new java.awt.Color(204, 0, 0));
        Sample_Button1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sample_Button1.setForeground(new java.awt.Color(255, 255, 255));
        Sample_Button1.setText(" Purchase Show");
        Sample_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sample_Button1ActionPerformed(evt);
            }
        });
        jPanel5.add(Sample_Button1);
        Sample_Button1.setBounds(30, 360, 290, 40);

        Sample_Button2.setBackground(new java.awt.Color(204, 0, 0));
        Sample_Button2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sample_Button2.setForeground(new java.awt.Color(255, 255, 255));
        Sample_Button2.setText("Accounts");
        Sample_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sample_Button2ActionPerformed(evt);
            }
        });
        jPanel5.add(Sample_Button2);
        Sample_Button2.setBounds(30, 440, 290, 40);

        sample_Bill_Button1.setBackground(new java.awt.Color(204, 0, 0));
        sample_Bill_Button1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sample_Bill_Button1.setForeground(new java.awt.Color(255, 255, 255));
        sample_Bill_Button1.setText("Bill");
        sample_Bill_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sample_Bill_Button1ActionPerformed(evt);
            }
        });
        jPanel5.add(sample_Bill_Button1);
        sample_Bill_Button1.setBounds(30, 240, 290, 40);

        Sample_Button3.setBackground(new java.awt.Color(204, 0, 0));
        Sample_Button3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sample_Button3.setForeground(new java.awt.Color(255, 255, 255));
        Sample_Button3.setText("Pin");
        Sample_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sample_Button3ActionPerformed(evt);
            }
        });
        jPanel5.add(Sample_Button3);
        Sample_Button3.setBounds(30, 480, 290, 40);

        Sample_Button4.setBackground(new java.awt.Color(204, 0, 0));
        Sample_Button4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sample_Button4.setForeground(new java.awt.Color(255, 255, 255));
        Sample_Button4.setText("Sales Show");
        Sample_Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sample_Button4ActionPerformed(evt);
            }
        });
        jPanel5.add(Sample_Button4);
        Sample_Button4.setBounds(30, 400, 290, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 80, 370, 660);

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.setLayout(null);

        statusl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        statusl.setForeground(new java.awt.Color(153, 0, 0));
        statusl.setText("User");
        jPanel6.add(statusl);
        statusl.setBounds(0, 0, 140, 40);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 370, 80);

        setSize(new java.awt.Dimension(1369, 740));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Add_Supplier.class.getName()).log(Level.SEVERE, null, ex);
        } }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Purchase_Return pr=new Purchase_Return();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Add_Supplier s=new Add_Supplier();
        s.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
   LogingPage l=new LogingPage();
   l.setVisible(true);
   dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel105MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Madecine_Stock s=new Madecine_Stock(statusl.getText());
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  Home_PAge hp=new Home_PAge(statusl.getText());
  hp.setVisible(true);
  dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     Madechine_Purchase mp=new Madechine_Purchase(statusl.getText());
mp.setVisible(true);
        dispose();    

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Madecine_Sells ms=new Madecine_Sells(statusl.getText());
        ms.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Medicine_Info mi=new Medicine_Info(statusl.getText());
        mi.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Sample_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sample_ButtonActionPerformed
        Sample_Purchase s=new Sample_Purchase(statusl.getText());
        s.setVisible(true);
        dispose();

    }//GEN-LAST:event_Sample_ButtonActionPerformed

    void billNO(){
    int billn=0;
     try {
         String s="SELECT `id` FROM `purchase_total`";
         contest();
         st=ct.prepareCall(s);
         rs=st.executeQuery(s);
         while(rs.next()){
         
           billn=rs.getInt(1);
           
             
         }
         billn=billn+1;
         bill.setText(""+billn);
         
     } catch (SQLException ex) {
         Logger.getLogger(Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
     }


}
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

        if(today_amm.getText().isEmpty()){
            try {

                contest();
                String select="SELECT `mobile` FROM `pharmacy_management`.`supplier_info` WHERE `name`='"+jComboBox2.getSelectedItem()+"'";
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while(rs.next()){
                    jTextField5.setText(rs.getString(1));
                    jLabel7.setText(""+jComboBox2.getSelectedItem());
                    jLabel8.setText(""+jTextField5.getText());
                }
            } catch (SQLException ex) {
                Logger.getLogger(Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            JOptionPane.showMessageDialog(rootPane, "Please Click OK");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        try {
            contest();
            String select="SELECT `purchase_p`,`sell_p` FROM `pharmacy_management`.`madecin_info` WHERE `madecine_name`='"+jComboBox1.getSelectedItem()+"'";
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        int a=0,b=0,c=0;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(jComboBox1.getSelectedIndex()<=0){

                JOptionPane.showMessageDialog(rootPane, "Medicine is empty");
                jComboBox1.requestFocus();
            }else if(jTextField3.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Quantity is empty");
                jTextField3.requestFocus();
            }else{
                a=Integer.parseInt(jTextField1.getText());
                b=Integer.parseInt(jTextField3.getText());
                c=a*b;
                jTextField4.setText(""+c);
                jComboBox2.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jComboBox1.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(rootPane, "Medicine is Empty");
            jComboBox1.requestFocus();
        }else if(jComboBox2.getSelectedIndex()<=0){
            JOptionPane.showMessageDialog(rootPane, "Supplier is Empty");
            jComboBox2.requestFocus();
        }
        else if(jTextField3.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Quantity is Empty");
            jTextField3.requestFocus();
        }
        else if(jTextField4.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Total Price is Empty");
            jTextField3.requestFocus();
        }else{

             int tp=0,ammount=0,paid=0,a1=0,p1=0,d=0,todayp=0;
      Date dt = new Date();
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     try {
         contest();
         String ms="SELECT `medecine`,`quantity`,`p_price` FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `id`='"+bill.getText()+"' AND `medecine`='"+jComboBox1.getSelectedItem()+"' AND `status` = 'main'";
   st=ct.prepareCall(ms);
     rs=st.executeQuery(ms);
        if(rs.next()){
            int q=rs.getInt(2)+Integer.parseInt(jTextField3.getText()); 
            int t=rs.getInt(3)*q;
              String qup="UPDATE `pharmacy_management`.`purchase` SET `quantity` = '"+q+"',`total_price` = '"+t+"' WHERE `id` = '"+bill.getText()+"'  AND `sname` = '"+jLabel7.getText()+"' AND `medecine` = '"+jComboBox1.getSelectedItem()+"' AND `date` = '"+df.format(dt)+"' AND `status` = 'main'";
            
               ps = ct.prepareCall(qup);
                int mu=ps.executeUpdate();
                if(mu>0){
                
             //supplier theke age purchase kora hoyeche kina dekhbe
             String suppliername="SELECT `s_name` FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"'AND `status` = 'main'";
              st=ct.prepareCall(suppliername);
              rs=st.executeQuery(suppliername);
         if(rs.next()){
         
           //madechin purchase hhowar por dekhbe j total e ei bill nota ache kina
             String id="SELECT `id` FROM `purchase_total` WHERE `id`='"+bill.getText()+"'";
         
         st=ct.prepareCall(id);
         rs=st.executeQuery(id);
        
         if(rs.next()){
              a1=0;
              todayp=0;
              p1=0;
          String ta="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"'AND `status` = 'main'";
         st=ct.prepareCall(ta);
         rs=st.executeQuery(ta);
        if(rs.next()){
         a1=rs.getInt(1);
         }
         String pa="SELECT SUM(`paid`) FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"'AND `status` = 'main'";
         st=ct.prepareCall(pa);
         rs=st.executeQuery(pa);
        if(rs.next()){
       p1=rs.getInt(1);
         }
        String ab="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `id`='"+bill.getText()+"'";
         st=ct.prepareCall(ab);
         rs=st.executeQuery(ab);
        if(rs.next()){
     todayp=rs.getInt(1);
         }
        
          // a1=a1+Integer.parseInt(jTextField4.getText());
        d=a1-p1;
         String Up="UPDATE `pharmacy_management`.`purchase_total` SET `ammount` = '"+todayp+"',`total_ammount` = '"+d+"' WHERE `id` = '"+bill.getText()+"'AND `s_name` = '"+jLabel7.getText()+"' AND `status` = 'main' AND `date` = '"+df.format(dt)+"'";
         ps = ct.prepareCall(Up);
                int mu1=ps.executeUpdate();
                if(mu1>0){
                
                
                }
        
        
         }else{
              a1=0;
              p1=0;
              todayp=0;
         String ta="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(ta);
         rs=st.executeQuery(ta);
        if(rs.next()){
         a1=rs.getInt(1);
         }
         String pa="SELECT SUM(`paid`) FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(pa);
         rs=st.executeQuery(pa);
        if(rs.next()){
       p1=rs.getInt(1);
         }
        String ab="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `id`='"+bill.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(ab);
         rs=st.executeQuery(ab);
        if(rs.next()){
     todayp=rs.getInt(1);
         }
        
        
        d=a1-p1;
        String ptin="INSERT INTO `pharmacy_management`.`purchase_total` (`id`, `s_name`, `mobile`, `ammount`, `total_ammount`,`status`, `date`) VALUES (?,?,?,?,?,?,?);";
         ps=ct.prepareCall(ptin);
         ps.setString(1,bill.getText());
         ps.setString(2,jLabel7.getText());
         ps.setString(3,jLabel8.getText());
         ps.setString(4,""+todayp);
         ps.setString(5,""+d);
         ps.setString(6,"main");
         ps.setString(7,df.format(dt));
         ps.executeUpdate();
        
        
         }
         
             
         }else{
              a1=0;
              p1=0;
              todayp=0;
         String ta="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(ta);
         rs=st.executeQuery(ta);
        if(rs.next()){
         a1=rs.getInt(1);
         }
         String pa="SELECT SUM(`paid`) FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(pa);
         rs=st.executeQuery(pa);
        if(rs.next()){
       p1=rs.getInt(1);
         }
        String ab="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `id`='"+bill.getText()+"'";
         st=ct.prepareCall(ab);
         rs=st.executeQuery(ab);
        if(rs.next()){
     todayp=rs.getInt(1);
         }
        
          // a1=a1+Integer.parseInt(jTextField4.getText());
        d=a1-p1;
         String in_total="INSERT INTO `pharmacy_management`.`purchase_total` (`id`,`s_name`,`mobile`,`ammount`,`total_ammount`,`date`,`status`) VALUES (?,?,?,?,?,?,?)";
         ps=ct.prepareCall(in_total);
         ps.setString(1,bill.getText());
         ps.setString(2,jLabel7.getText());
         ps.setString(3,jLabel8.getText());
         ps.setString(4,""+todayp);
         ps.setString(5,""+d);
         ps.setString(6,df.format(dt));
          ps.setString(7,"main");
        ps.executeUpdate();
         }
         
              showtext();
                                jTextField1.setText("");
                                jTextField2.setText("");
                                jTextField3.setText("");
                                jTextField4.setText("");
                                jComboBox1.setSelectedIndex(0);
             
                
                }
              
        }else{
         String in="INSERT INTO `pharmacy_management`.`purchase` (`id`,`sname`,`number`,`medecine`,`p_price`,`s_price`,`quantity`,`total_price`,`date`,`status`)VALUES (?,?,?,?,?,?,?,?,?,?)";
         ps=ct.prepareCall(in);
         ps.setInt(1,Integer.parseInt(bill.getText()));
         ps.setString(2,jLabel7.getText());
         ps.setString(3,jLabel8.getText());
         ps.setString(4,jComboBox1.getSelectedItem().toString());
         ps.setString(5,jTextField1.getText());
         ps.setString(6,jTextField2.getText());
         ps.setString(7,jTextField3.getText());
         ps.setString(8,jTextField4.getText());
         ps.setString(9,df.format(dt));
             ps.setString(10,"main");
         int m=ps.executeUpdate();
         if(m>0){
             //supplier theke age purchase kora hoyeche kina dekhbe
             String suppliername="SELECT `s_name` FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"' AND `status` = 'main'";
              st=ct.prepareCall(suppliername);
              rs=st.executeQuery(suppliername);
         if(rs.next()){
         
           //madechin purchase hhowar por dekhbe j total e ei bill nota ache kina
             String id="SELECT `id` FROM `purchase_total` WHERE `id`='"+bill.getText()+"'";
         
         st=ct.prepareCall(id);
         rs=st.executeQuery(id);
         if(rs.next()){
              a1=0;
              todayp=0;
              p1=0;
          String ta="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(ta);
         rs=st.executeQuery(ta);
        if(rs.next()){
         a1=rs.getInt(1);
         }
         String pa="SELECT SUM(`paid`) FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(pa);
         rs=st.executeQuery(pa);
        if(rs.next()){
       p1=rs.getInt(1);
         }
        String ab="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `id`='"+bill.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(ab);
         rs=st.executeQuery(ab);
        if(rs.next()){
     todayp=rs.getInt(1);
         }
        
          // a1=a1+Integer.parseInt(jTextField4.getText());
        d=a1-p1;
         String Up="UPDATE `pharmacy_management`.`purchase_total` SET `ammount` = '"+todayp+"',`total_ammount` = '"+d+"' WHERE `id` = '"+bill.getText()+"'AND `s_name` = '"+jLabel7.getText()+"' AND `status` = 'main' AND `date` = '"+df.format(dt)+"'";
         ps = ct.prepareCall(Up);
                int mu=ps.executeUpdate();
                if(mu>0){
                
                
                }
        
        
         }else{
              a1=0;
              p1=0;
              todayp=0;
         String ta="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(ta);
         rs=st.executeQuery(ta);
        if(rs.next()){
         a1=rs.getInt(1);
         }
         String pa="SELECT SUM(`paid`) FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(pa);
         rs=st.executeQuery(pa);
        if(rs.next()){
       p1=rs.getInt(1);
         }
        String ab="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `id`='"+bill.getText()+"'";
         st=ct.prepareCall(ab);
         rs=st.executeQuery(ab);
        if(rs.next()){
     todayp=rs.getInt(1);
         }
        
        
        d=a1-p1;
        String ptin="INSERT INTO `pharmacy_management`.`purchase_total` (`id`, `s_name`, `mobile`, `ammount`, `total_ammount`,`status`, `date`) VALUES (?,?,?,?,?,?,?);";
         ps=ct.prepareCall(ptin);
         ps.setString(1,bill.getText());
         ps.setString(2,jLabel7.getText());
         ps.setString(3,jLabel8.getText());
         ps.setString(4,""+todayp);
         ps.setString(5,""+d);
         ps.setString(6,"main");
         ps.setString(7,df.format(dt));
         ps.executeUpdate();
        
        
         }
         
             
         }else{
              a1=0;
              p1=0;
              todayp=0;
         String ta="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(ta);
         rs=st.executeQuery(ta);
        if(rs.next()){
         a1=rs.getInt(1);
         }
         String pa="SELECT SUM(`paid`) FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(pa);
         rs=st.executeQuery(pa);
         if(rs.next()){
            p1=rs.getInt(1); 
         }
        String ab="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `id`='"+bill.getText()+"'";
        st=ct.prepareCall(ab);
        rs=st.executeQuery(ab);
        if(rs.next()){
        todayp=rs.getInt(1);
        } 
        
         d=a1-p1;
         String in_total="INSERT INTO `pharmacy_management`.`purchase_total` (`id`,`s_name`,`mobile`,`ammount`,`total_ammount`,`date`,`status`) VALUES (?,?,?,?,?,?,?)";
         ps=ct.prepareCall(in_total);
         ps.setString(1,bill.getText());
         ps.setString(2,jLabel7.getText());
         ps.setString(3,jLabel8.getText());
         ps.setString(4,""+todayp);
         ps.setString(5,""+d);      
         ps.setString(6,df.format(dt));
         ps.setString(7,"main");
         ps.executeUpdate();       
         }
         
              showtext();
                                jTextField1.setText("");
                                jTextField2.setText("");
                                jTextField3.setText("");
                                jTextField4.setText("");
                                jComboBox1.setSelectedIndex(0);
              }
         
        }
         
         
     } catch (SQLException ex) {
         Logger.getLogger(Pharmachy_Management_Final.Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        today_amm.setText("");
        jLabel8.setText("");
        i=0;
        jLabel7.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        OLD_ammount.setText("");
        Total_Ammount.setText("");
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
        billNO();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void paiddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paiddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_paiddMouseClicked

    private void paiddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paiddKeyPressed
     
 if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
if(Total_Ammount.getText().isEmpty()){
JOptionPane.showMessageDialog(rootPane, "Total Ammount Empty...");
}else if(paidd.getText().isEmpty()){
JOptionPane.showMessageDialog(rootPane, "Paid Ammount Empty...");
}else{
    int t=Integer.parseInt(Total_Ammount.getText());
    int p=Integer.parseInt(paidd.getText());
    int d=t-p;
deu.setText(""+d);

}
   
     
     
 }        
        
        
    }//GEN-LAST:event_paiddKeyPressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
     if(jLabel7.getText().isEmpty()){
    JOptionPane.showMessageDialog(rootPane, "Supplier Name is Empty");
    
    } else if(jLabel8.getText().isEmpty()){
    JOptionPane.showMessageDialog(rootPane, "Supplier Numbber is Empty");
    
    }else if(today_amm.getText().isEmpty()){
    JOptionPane.showMessageDialog(rootPane, "Total Ammount is Empty");
    
    } else if(paidd.getText().isEmpty()){
    JOptionPane.showMessageDialog(rootPane, "Paid Ammount is Empty");
    
    }else{
       
         try {
             Date dt = new Date();
             DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
             
             String up="UPDATE `pharmacy_management`.`purchase_total` SET `paid` = '"+paidd.getText()+"' WHERE `id` = '"+bill.getText()+"' AND `s_name` = '"+jLabel7.getText()+"' AND `mobile` = '"+jLabel8.getText()+"'";
             ps = ct.prepareCall(up);
             int m=ps.executeUpdate();
             if(m>0){
                 Bill_Paid b=new Bill_Paid(bill.getText(),jLabel7.getText(),jLabel8.getText(),"main");
                  
             b.setVisible(true); 
             today_amm.setText("");
             jLabel8.setText("");
             i=0;
             jLabel7.setText("");
             jComboBox1.setSelectedIndex(0);
             jComboBox2.setSelectedIndex(0);
             jTextField1.setText("");
             jTextField2.setText("");
             jTextField3.setText("");
             jTextField4.setText("");
             jTextField5.setText("");
             Total_Ammount.setText("");
             OLD_ammount.setText("");
             DefaultTableModel dtt=(DefaultTableModel) jTable1.getModel();
             dtt.setRowCount(0);
             billNO();
             paidd.setText("");
             deu.setText("");
            
             }
             
             
             
                  } catch (SQLException ex) {
             Logger.getLogger(Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
         }

    }




    }//GEN-LAST:event_jButton10ActionPerformed

    private void paiddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paiddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paiddActionPerformed

    private void deuVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_deuVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_deuVetoableChange

    private void Sample_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sample_Button1ActionPerformed
        Purchase_Show ps=new Purchase_Show(statusl.getText());
        ps.setVisible(true);
        dispose();
    }//GEN-LAST:event_Sample_Button1ActionPerformed

    private void Sample_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sample_Button2ActionPerformed
        Accounts ps=new Accounts(statusl.getText());
        ps.setVisible(true);
        dispose();
    }//GEN-LAST:event_Sample_Button2ActionPerformed

    private void sample_Bill_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sample_Bill_Button1ActionPerformed
    
     Home_PAge  h=new Home_PAge(statusl.getText());
     h.setVisible(true); 
     Bill_Paid_1 hp=new Bill_Paid_1(statusl.getText());
      
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_sample_Bill_Button1ActionPerformed

    private void Sample_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sample_Button3ActionPerformed
        Create_Login_Pin ps=new Create_Login_Pin();
        ps.setVisible(true);

    }//GEN-LAST:event_Sample_Button3ActionPerformed

    private void Sample_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sample_Button4ActionPerformed
        Sells_Show ps=new Sells_Show(statusl.getText());
        ps.setVisible(true);
        dispose();
    }//GEN-LAST:event_Sample_Button4ActionPerformed
 
  void showtext(){
   int p1=0,a1=0,todayp=0,d=0;
     try {
         DefaultTableModel dtt=(DefaultTableModel) jTable1.getModel();
         
         contest();
         
         Integer n=Integer.parseInt(jTextField4.getText());
         i=n+i;
         dtt.addRow(new Object[]{jComboBox1.getSelectedItem(),jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText()});
         
         
         today_amm.setText(""+i);
         
         String ta="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `status` = 'main' AND `id` NOT IN("+bill.getText()+")";
         st=ct.prepareCall(ta);
         rs=st.executeQuery(ta);
         if(rs.next()){
             a1=rs.getInt(1);
         }
         String pa="SELECT SUM(`paid`) FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jLabel7.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(pa);
         rs=st.executeQuery(pa);
         if(rs.next()){
             p1=rs.getInt(1);
         }
         String ab="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jLabel7.getText()+"' AND `id`='"+bill.getText()+"' AND `status` = 'main'";
         st=ct.prepareCall(ab);
         rs=st.executeQuery(ab);
         if(rs.next()){
             todayp=rs.getInt(1);
         }
         
         
         OLD_ammount.setText(""+(a1-p1));
         today_amm.setText(""+todayp);
         Total_Ammount.setText(""+((a1+todayp)-p1));
       
         
       
         
     } catch (SQLException ex) {
         Logger.getLogger(Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
     }

} 
  
  void showsm(){
        try {
            jComboBox1.removeAllItems();
            jComboBox1.addItem("Madecine");
            contest();
            String select="SELECT `madecine_name` FROM `pharmacy_management`.`madecin_info`";
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          jComboBox1.addItem(rs.getString(1));
          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }

}
  
    void showssup(){
        try {
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Supplier");
            contest();
            String select="SELECT `name` FROM `pharmacy_management`.`supplier_info` ";
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          jComboBox2.addItem(rs.getString(1));
          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }

}
  
    
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
            java.util.logging.Logger.getLogger(Madechine_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Madechine_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Madechine_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Madechine_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Madechine_Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OLD_ammount;
    private javax.swing.JButton Sample_Button;
    private javax.swing.JButton Sample_Button1;
    private javax.swing.JButton Sample_Button2;
    private javax.swing.JButton Sample_Button3;
    private javax.swing.JButton Sample_Button4;
    private javax.swing.JLabel Total_Ammount;
    private javax.swing.JLabel bill;
    private javax.swing.JLabel bill1;
    private javax.swing.JLabel deu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField paidd;
    private javax.swing.JButton sample_Bill_Button1;
    private javax.swing.JLabel statusl;
    private javax.swing.JLabel today_amm;
    // End of variables declaration//GEN-END:variables
}
