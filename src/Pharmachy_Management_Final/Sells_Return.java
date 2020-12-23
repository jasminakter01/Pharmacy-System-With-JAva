
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

public class Sells_Return extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int tp=0,pp=0,ta=0;
    public Sells_Return() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jyear = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jmonth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jday = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jyear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jyear.setText("2020");
        jyear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jyearMouseClicked(evt);
            }
        });
        jyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jyearKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jyearKeyTyped(evt);
            }
        });
        jPanel1.add(jyear);
        jyear.setBounds(200, 90, 40, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Year");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 70, 40, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 90, 20, 30);

        jmonth.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jmonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jmonth.setText("01");
        jmonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmonthMouseClicked(evt);
            }
        });
        jmonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmonthKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jmonthKeyTyped(evt);
            }
        });
        jPanel1.add(jmonth);
        jmonth.setBounds(140, 90, 40, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 90, 20, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Month");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 70, 40, 20);

        jday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jday.setText("01");
        jday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdayMouseClicked(evt);
            }
        });
        jday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdayKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdayKeyTyped(evt);
            }
        });
        jPanel1.add(jday);
        jday.setBounds(80, 90, 40, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sales Quantity");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 220, 110, 20);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(70, 180, 170, 30);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(70, 140, 170, 30);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(70, 240, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Day");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 70, 40, 20);

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(70, 290, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Return");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 270, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sells Return");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 0, 280, 40);

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 40, 400, 10);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(200, 240, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sales Price");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 220, 110, 20);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(200, 290, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Return Ammount");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 270, 110, 20);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cop.jpg"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 340, 70, 60);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(350, 0, 50, 40);

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("-");
        jLabel105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel105MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel105);
        jLabel105.setBounds(310, 0, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 430);

        setSize(new java.awt.Dimension(401, 429));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Add_Supplier.class.getName()).log(Level.SEVERE, null, ex);
        } }
    private void jdayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdayKeyPressed
        // TODO add your handling code here:
        
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             int d=Integer.parseInt(jday.getText());
             if(d>31){
             JOptionPane.showMessageDialog(rootPane, "Wrong Input..");
             }else{
           jmonth.requestFocus();
             jmonth.setText("");}
           
        }
          
    }//GEN-LAST:event_jdayKeyPressed

    private void jmonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmonthKeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int d=Integer.parseInt(jmonth.getText());
             if(d>12){
             JOptionPane.showMessageDialog(rootPane, "Wrong Input..");
             }else{
           jyear.requestFocus();
             jyear.setText("");}
        }
    }//GEN-LAST:event_jmonthKeyPressed

    private void jyearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jyearKeyPressed
        // TODO add your handling code here:
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         if(jday.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "day is empty....");
             jday.requestFocus();
         }else if(jmonth.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "month is empty....");
             jmonth.requestFocus();
         }else if(jyear.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "year is empty....");
             jyear.requestFocus();
         }else{
               shows();}
               
        }
    }//GEN-LAST:event_jyearKeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        try {
            contest(); 
            String year=jyear.getText();
            String month=jmonth.getText();
            String day=jday.getText();
            String date=""+year+"-"+month+"-"+day;
            String select="SELECT `quantity`,`total price`,`s_price` FROM `sells` WHERE `date`='"+date+"' AND `customer name`='"+jComboBox2.getSelectedItem()+"' AND `madecine`='"+jComboBox1.getSelectedItem()+"'";
          
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          jTextField4.setText(""+rs.getInt(1));
                                tp=rs.getInt(2);
                                jTextField6.setText(""+rs.getInt(2));
                                pp=rs.getInt(3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sells_Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        showsm();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
      
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if(jTextField4.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(rootPane, "Sorry purchase Quantity is Empty....");
        }else{
            int purq=Integer.parseInt(jTextField4.getText());
            
             int r=Integer.parseInt(jTextField5.getText());
             if(purq<r){
             JOptionPane.showMessageDialog(rootPane, "Sorry Large quantity Not Allow....");
             }else{
             jTextField7.setText(""+r*pp);}
        
        }
        }
         
         
         
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdayMouseClicked
        // TODO add your handling code here:
        jday.setText("");
    }//GEN-LAST:event_jdayMouseClicked

    private void jmonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmonthMouseClicked
        // TODO add your handling code here:
        jmonth.setText("");
    }//GEN-LAST:event_jmonthMouseClicked

    private void jyearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jyearMouseClicked
        // TODO add your handling code here:
        jyear.setText("");
    }//GEN-LAST:event_jyearMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
   if(jTextField4.getText().isEmpty()){
           JOptionPane.showMessageDialog(rootPane, "quantity is empty....");
           
           }else if(jTextField7.getText().isEmpty()){
           JOptionPane.showMessageDialog(rootPane, "Return Price is empty....");
           
           }else{
               try {
                   int a=Integer.parseInt(jTextField4.getText());
                    int b=Integer.parseInt(jTextField5.getText());
                    int c=a-b;
                 Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         String year=jyear.getText();
            String month=jmonth.getText();
            String day=jday.getText();
            String date=""+year+"-"+month+"-"+day;
            int d=pp*c;
            int m=tp-d;
            contest();
            String s="SELECT `ammount` FROM `sells_ammount` WHERE `customer_Name`='"+jComboBox2.getSelectedItem()+"' AND `date`='"+date+"'";
             st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while(rs.next()){
         
            int aa=Integer.parseInt(jTextField7.getText());
               ta=rs.getInt(1)-aa;
            }
                   String up="UPDATE `pharmacy_management`.`sells` SET `quantity` = '"+c+"',`total price` = '"+d+"' WHERE `customer name`= '"+jComboBox2.getSelectedItem()+"' AND `madecine` = '"+jComboBox1.getSelectedItem()+"' AND `date` = '"+date+"'";
                
                   ps = ct.prepareCall(up);
                   ps.execute();
 
    //
    
                   String up2="UPDATE `pharmacy_management`.`sells_ammount` SET `ammount` = '"+ta+"' WHERE `customer_Name` = '"+jComboBox2.getSelectedItem()+"' AND `date` = '"+date+"'";
                
                   ps = ct.prepareCall(up2);
                   ps.execute();
                   
                   String in="INSERT INTO `pharmacy_management`.`sells_return` (`cname`,`madecine`,`quantity`,`price`,`date`) VALUES (?,?,?,?,?)";
              
                   ps=ct.prepareCall(in);
                ps.setString(1,jComboBox2.getSelectedItem().toString()); 
                ps.setString(2,jComboBox1.getSelectedItem().toString());
                ps.setString(3,jTextField5.getText());
                ps.setString(4,jTextField7.getText());
                  ps.setString(5,df.format(dt));
               
                int mm=ps.executeUpdate();
                if(m>0){
                     JOptionPane.showMessageDialog(rootPane, "Madecine return....."); 
                    
                      jday.setText("01");
                       jmonth.setText("01");
                        jyear.setText("2020");
                        jComboBox1.removeAllItems();
                        jComboBox1.addItem("Medicine");
                        jComboBox2.removeAllItems();
                        jComboBox2.addItem("Customer");
                        jTextField4.setText("");
                        jTextField5.setText("");
                        jTextField6.setText("");
                        jTextField7.setText("");
                     
                }
  
                  
  
  
  
               } catch (SQLException ex) {
                   Logger.getLogger(Sells_Return.class.getName()).log(Level.SEVERE, null, ex);
               }
           
           
           }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel105MouseClicked

    private void jdayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdayKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        
        
        
    }//GEN-LAST:event_jdayKeyTyped

    private void jmonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmonthKeyTyped
  char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jmonthKeyTyped

    private void jyearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jyearKeyTyped
        
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jyearKeyTyped

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         jComboBox1.requestFocus();
         
         }
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         jTextField5.requestFocus();
                  }
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
    
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

      void shows(){
        try {
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Customer");
            contest(); 
            String year=jyear.getText();
            String month=jmonth.getText();
            String day=jday.getText();
            String date=""+year+"-"+month+"-"+day;
            String select="SELECT `customer name` FROM `sells` WHERE `date`='"+date+"' GROUP BY `customer name`";
          
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          jComboBox2.addItem(rs.getString(1));
          jComboBox2.requestFocus();
                     }
        } catch (SQLException ex) {
            Logger.getLogger(Sells_Return.class.getName()).log(Level.SEVERE, null, ex);
        }

}
         void showsm(){
        try {
            jComboBox1.removeAllItems();
            jComboBox1.addItem("Madecine");
            contest(); 
            String year=jyear.getText();
            String month=jmonth.getText();
            String day=jday.getText();
            String date=""+year+"-"+month+"-"+day;
            String select="SELECT `madecine` FROM `sells` WHERE `date`='"+date+"' AND `customer name`='"+jComboBox2.getSelectedItem()+"'";
          
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          jComboBox1.addItem(rs.getString(1));
          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sells_Return.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Sells_Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sells_Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sells_Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sells_Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sells_Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jday;
    private javax.swing.JTextField jmonth;
    private javax.swing.JTextField jyear;
    // End of variables declaration//GEN-END:variables
}
