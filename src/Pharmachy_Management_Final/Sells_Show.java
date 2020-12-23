
package Pharmachy_Management_Final;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel; 
public class Sells_Show extends javax.swing.JFrame {
    Connection ct=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public Sells_Show(String status) {
        initComponents();
     statusl.setText(status);
      
    }

    private Sells_Show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        statusl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pharmacy Management");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(530, 0, 800, 80);

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
        jLabel105.setBounds(1260, 0, 40, 40);

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
        jLabel13.setBounds(1300, 0, 50, 40);

        statusl.setBackground(new java.awt.Color(204, 0, 0));
        statusl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        statusl.setForeground(new java.awt.Color(153, 0, 0));
        statusl.setText("User");
        jPanel2.add(statusl);
        statusl.setBounds(0, 0, 140, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 370, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sales Show");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(430, 0, 840, 60);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1320, 0, 50, 40);

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("-");
        jLabel106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel106MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel106);
        jLabel106.setBounds(1280, 0, 40, 40);
        jPanel1.add(jCalendar2);
        jCalendar2.setBounds(390, 80, 480, 250);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Month");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(880, 200, 220, 40);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Year");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(880, 240, 220, 40);

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Day");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(880, 160, 220, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Price", "Quantity", "Total Price", "date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(390, 350, 970, 340);

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setLayout(null);

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Stock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(30, 280, 290, 40);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
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
        jPanel3.add(jButton6);
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
        jPanel3.add(jButton7);
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
        jPanel3.add(jButton8);
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
        jPanel3.add(Sample_Button);
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
        jPanel3.add(Sample_Button1);
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
        jPanel3.add(Sample_Button2);
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
        jPanel3.add(sample_Bill_Button1);
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
        jPanel3.add(Sample_Button3);
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
        jPanel3.add(Sample_Button4);
        Sample_Button4.setBounds(30, 400, 290, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 80, 370, 660);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 750);

        setSize(new java.awt.Dimension(1365, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel105MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
         dispose();
        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
   LogingPage l=new LogingPage();
   l.setVisible(true);        dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel106MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel106MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
               SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM");
     //JOptionPane.showMessageDialog(rootPane, ""+sf.format(jCalendar2.getDate()));
          
            String s="SELECT `madecine`, `s_price`, `quantity`, `total price`, `date` FROM `pharmacy_management`.`sells` WHERE `date` LIKE '%"+sf.format(jCalendar2.getDate())+"%'";
            contest();
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            ps=ct.prepareCall(s);
            rs=ps.executeQuery();
            while(rs.next()){
            dt.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDate(5)});   }  
        } catch (SQLException ex) {
            Logger.getLogger(Sells_Show.class.getName()).log(Level.SEVERE, null, ex);
        }        
 
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   try {
               SimpleDateFormat sf=new SimpleDateFormat("yyyy");
     //JOptionPane.showMessageDialog(rootPane, ""+sf.format(jCalendar2.getDate()));
          
            String s="SELECT `madecine`, `s_price`, `quantity`, `total price`, `date` FROM `pharmacy_management`.`sells` WHERE `date` LIKE '%"+sf.format(jCalendar2.getDate())+"%'";
            contest();
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            ps=ct.prepareCall(s);
            rs=ps.executeQuery();
            while(rs.next()){
          //  jComboBox1.addItem(rs.getString(1));
             dt.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDate(5)});   }  
        } catch (SQLException ex) {
            Logger.getLogger(Sells_Show.class.getName()).log(Level.SEVERE, null, ex);
        }        
 
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   try {
               SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
     //JOptionPane.showMessageDialog(rootPane, ""+sf.format(jCalendar2.getDate()));
          
            String s="SELECT `madecine`, `s_price`, `quantity`, `total price`, `date` FROM `pharmacy_management`.`sells` WHERE `date`='"+sf.format(jCalendar2.getDate())+"'";
            contest();
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            ps=ct.prepareCall(s);
            rs=ps.executeQuery();
            while(rs.next()){
          //  jComboBox1.addItem(rs.getString(1));
            dt.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDate(5)});
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Sells_Show.class.getName()).log(Level.SEVERE, null, ex);
        }        
 
    }//GEN-LAST:event_jButton4ActionPerformed
public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Add_Supplier.class.getName()).log(Level.SEVERE, null, ex);
        } }



    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Madecine_Stock s=new Madecine_Stock(statusl.getText());
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Sells_Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sells_Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sells_Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sells_Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sells_Show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sample_Button;
    private javax.swing.JButton Sample_Button1;
    private javax.swing.JButton Sample_Button2;
    private javax.swing.JButton Sample_Button3;
    private javax.swing.JButton Sample_Button4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sample_Bill_Button1;
    private javax.swing.JLabel statusl;
    // End of variables declaration//GEN-END:variables
}
