/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmachy_Management_Final;

 
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jasmi
 */
public class LogingPage extends javax.swing.JFrame {

 
      Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    public LogingPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 20, 300, 200);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pharmacy Mangement");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 240, 290, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 450);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 50, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(590, 0, 50, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 70, 340, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("User Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 150, 320, 20);

        user.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });
        jPanel1.add(user);
        user.setBounds(310, 180, 320, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 220, 320, 20);

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(310, 250, 320, 30);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Login");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 160, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(380, 310, 160, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create New User Account");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 370, 270, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(300, 0, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 450);

        setSize(new java.awt.Dimension(642, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
        } }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Create_User_Pass c=new Create_User_Pass();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      if(user.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "User Name Is Empty..");
      user.requestFocus();
      }else if(password.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Password Is Empty..");
      password.requestFocus();
      } else{
          if(jComboBox1.getSelectedIndex()==0)
          {
          try {
              String s="SELECT  `username`, `password` FROM `pharmacy_management`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              contest();
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
                  Home_PAge hp=new Home_PAge((String) jComboBox1.getSelectedItem());
                  hp.setVisible(true);
                  dispose();
                  
              }else{
              JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");
              
              
              }   } catch (SQLException ex) {
              Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          }else{
           try {
              String s="SELECT  `username`, `password` FROM `pharmacy_management`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              contest();
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
                  Home_PAge hp=new Home_PAge(""+jComboBox1.getSelectedItem());
                  hp.setVisible(true);
                  dispose();
                  
              }else{
              JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");
              
              
              }   } catch (SQLException ex) {
              Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          
          
          
          }
          
          
          
          
          
          
          
          
          
      }
        
        
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_userKeyTyped

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        password.requestFocus();
        
        }
        
        
        
    }//GEN-LAST:event_userKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    if(user.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "User Name Is Empty..");
      user.requestFocus();
      }else if(password.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Password Is Empty..");
      password.requestFocus();
      } else{
          if(jComboBox1.getSelectedIndex()==0)
          {
          try {
              String s="SELECT  `username`, `password` FROM `pharmacy_management`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              contest();
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
                  Home_PAge hp=new Home_PAge(""+jComboBox1.getSelectedItem());
                  hp.setVisible(true);
                  dispose();
                  
              }else{
              JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");
              
              
              }   } catch (SQLException ex) {
              Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          }else{
           try {
              String s="SELECT  `username`, `password` FROM `pharmacy_management`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              contest();
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
                  Home_PAge hp=new Home_PAge(""+jComboBox1.getSelectedItem());
                  hp.setVisible(true);
                  dispose();
                  
              }else{
              JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");
              
              
              }   } catch (SQLException ex) {
              Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          
          
          
          }
          
          
          
          
          
          
          
          
          
      }
        
        
        
        
        }
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new LogingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}