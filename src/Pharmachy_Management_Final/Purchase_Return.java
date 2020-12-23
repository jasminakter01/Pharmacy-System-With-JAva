
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

public class Purchase_Return extends javax.swing.JFrame {

    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    int tp=0,pp=0,ta=0,dta=0;
    public Purchase_Return() {
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
        madecine = new javax.swing.JComboBox<>();
        supplier = new javax.swing.JComboBox<>();
        p_quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        retur = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        p_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ret_ammount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        Bill = new javax.swing.JComboBox<>();

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
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel5.setText("Purchase Quantity");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 240, 110, 20);

        madecine.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        madecine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine" }));
        madecine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                madecineActionPerformed(evt);
            }
        });
        madecine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                madecineKeyPressed(evt);
            }
        });
        jPanel1.add(madecine);
        madecine.setBounds(70, 210, 170, 30);

        supplier.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier" }));
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        supplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierKeyPressed(evt);
            }
        });
        jPanel1.add(supplier);
        supplier.setBounds(70, 130, 170, 30);

        p_quantity.setEditable(false);
        p_quantity.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(p_quantity);
        p_quantity.setBounds(70, 260, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Day");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 70, 40, 20);

        retur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returMouseClicked(evt);
            }
        });
        retur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                returKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                returKeyTyped(evt);
            }
        });
        jPanel1.add(retur);
        retur.setBounds(70, 310, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Return");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 290, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Purchase Return");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 310, 40);

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

        p_price.setEditable(false);
        p_price.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(p_price);
        p_price.setBounds(200, 260, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Purchase Price");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 240, 110, 20);

        ret_ammount.setEditable(false);
        ret_ammount.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ret_ammount);
        ret_ammount.setBounds(200, 310, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Return Ammount");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 290, 110, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cop.jpg"))); // NOI18N
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11MouseMoved(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 360, 140, 60);

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

        Bill.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bill.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bill No" }));
        Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillActionPerformed(evt);
            }
        });
        Bill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BillKeyPressed(evt);
            }
        });
        jPanel1.add(Bill);
        Bill.setBounds(70, 170, 170, 30);

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
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             int d=Integer.parseInt(jday.getText());
             if(d>31){
             JOptionPane.showMessageDialog(ret_ammount, "Wrong Input");
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
             JOptionPane.showMessageDialog(ret_ammount, "Wrong Input");
             }else{jyear.requestFocus();
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

    private void madecineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_madecineActionPerformed
        // TODO add your handling code here:
        try {
            contest(); 
            String year=jyear.getText();
            String month=jmonth.getText();
            String day=jday.getText();
            String date=""+year+"-"+month+"-"+day;
        String select="SELECT `quantity`,`total_price`,`p_price` FROM `pharmacy_management`.`purchase` WHERE `date`='"+date+"' AND `sname`='"+supplier.getSelectedItem()+"' AND `medecine`='"+madecine.getSelectedItem()+"'AND `status`='main'";
     //     String select="SELECT SUM(`quantity`),SUM(`total_price`),`p_price` FROM `pharmacy_management`.`purchase` WHERE `date`='"+date+"' AND `sname`='"+supplier.getSelectedItem()+"' AND `medecine`='"+madecine.getSelectedItem()+"'AND `status`='main' GROUP BY `medecine`";
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          p_quantity.setText(""+rs.getInt(1));
                                tp=rs.getInt(2);
                                p_price.setText(""+rs.getInt(2));
                                pp=rs.getInt(3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Purchase_Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_madecineActionPerformed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        // TODO add your handling code here:
       showbil();
       //showsm();
    }//GEN-LAST:event_supplierActionPerformed

    private void returKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_returKeyPressed
      
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if(p_quantity.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(rootPane, "Sorry purchase Quantity is Empty....");
        }else{
            int purq=Integer.parseInt(p_quantity.getText());
            
             int r=Integer.parseInt(retur.getText());
             if(purq<r){
             JOptionPane.showMessageDialog(rootPane, "Sorry Large quantity Not Allow....");
                      ret_ammount.setText("");
             }else{
             ret_ammount.setText(""+r*pp);
          
             }
        
        }
        }
         
         
         
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_returKeyPressed

    private void jdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdayMouseClicked
        // TODO add your handling code here:
        jday.setText("");
         supplier.removeAllItems();
            supplier.addItem("Supplier");
    }//GEN-LAST:event_jdayMouseClicked

    private void jmonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmonthMouseClicked
        // TODO add your handling code here:
        supplier.removeAllItems();
            supplier.addItem("Supplier");
            jmonth.setText("");
    }//GEN-LAST:event_jmonthMouseClicked

    private void jyearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jyearMouseClicked
        // TODO add your handling code here:
         supplier.removeAllItems();
            supplier.addItem("Supplier");
            jyear.setText("");
    }//GEN-LAST:event_jyearMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
   if(p_quantity.getText().isEmpty()){
           JOptionPane.showMessageDialog(rootPane, "quantity is empty....");
           
           }else if(ret_ammount.getText().isEmpty()){
           JOptionPane.showMessageDialog(rootPane, "Return Price is empty....");
           
           }else{
               int purq=Integer.parseInt(p_quantity.getText());
            
             int r=Integer.parseInt(retur.getText());
             if(purq<r){
             JOptionPane.showMessageDialog(rootPane, "Sorry Large quantity Not Allow....");
                      ret_ammount.setText("");
             }else{
               
               
               try {
                   int a=Integer.parseInt(p_quantity.getText());
                    int b=Integer.parseInt(retur.getText());
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
            String s="SELECT `ammount`,`total_ammount` FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+supplier.getSelectedItem()+"' AND `date`='"+date+"' AND `id`='"+Bill.getSelectedItem()+"' AND `status`='main'";
             st = ct.prepareCall(s);
            rs = st.executeQuery(s);
            while(rs.next()){
         
            int aa=Integer.parseInt(ret_ammount.getText());
               ta=rs.getInt(1)-aa;
               dta=rs.getInt(2)-aa;
            }
                   String up="UPDATE `pharmacy_management`.`purchase` SET `quantity` = '"+c+"',`total_price` = '"+d+"' WHERE `sname` = '"+supplier.getSelectedItem()+"' AND `medecine` = '"+madecine.getSelectedItem()+"' AND `date` = '"+date+"' AND `id`='"+Bill.getSelectedItem()+"' AND `status`='main'";
                
                   ps = ct.prepareCall(up);
                   ps.execute();
 
    //
    
                   String up2="UPDATE `pharmacy_management`.`purchase_total` SET `ammount` = '"+ta+"',`total_ammount`='"+dta+"' WHERE `s_name` = '"+supplier.getSelectedItem()+"' AND `date` = '"+date+"' AND `id`='"+Bill.getSelectedItem()+"' AND `status`='main'";
                 
                   ps = ct.prepareCall(up2);
                   ps.execute();
                   
                   String in="INSERT INTO `pharmacy_management`.`puchase_returen` (`sname`,`medecne`,`quantity`,`price`,`date`,`status`) VALUES (?,?,?,?,?,?)";
              
                   ps=ct.prepareCall(in);
                ps.setString(1,supplier.getSelectedItem().toString()); 
                ps.setString(2,madecine.getSelectedItem().toString());
                ps.setString(3,retur.getText());
                ps.setString(4,ret_ammount.getText());
                  ps.setString(5,df.format(dt));
                   ps.setString(6,"main");
                int mm=ps.executeUpdate();
                if(m>0){
                     JOptionPane.showMessageDialog(rootPane, "Madecine return....."); 
                     jday.setText("01");
                      jmonth.setText("01"); 
                      jyear.setText("2020");
                      supplier.removeAllItems();
                         madecine.removeAllItems();
                      supplier.addItem("Supplier");
                      madecine.addItem("Medicine");
                      p_quantity.setText("");
                      p_price.setText("");
                      retur.setText("");
                      ret_ammount.setText("");
                      jday.requestFocus();
                }
  
                  
  
  
  
               } catch (SQLException ex) {
                   Logger.getLogger(Purchase_Return.class.getName()).log(Level.SEVERE, null, ex);
               }
           
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

    private void jyearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jyearKeyTyped
 char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
          
        
    }//GEN-LAST:event_jyearKeyTyped

    private void supplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         madecine.requestFocus();
         }
    }//GEN-LAST:event_supplierKeyPressed

    private void jdayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdayKeyTyped
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_jdayKeyTyped

    private void jmonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmonthKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_jmonthKeyTyped

    private void madecineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_madecineKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         retur.requestFocus();
         
         }
    }//GEN-LAST:event_madecineKeyPressed

    private void returMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returMouseClicked
        // TODO add your handling code here:
        ret_ammount.setText("");
    }//GEN-LAST:event_returMouseClicked

    private void returKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_returKeyTyped
        // TODO add your handling code here:
        
        
          char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_returKeyTyped

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
     jLabel11.setText("Save");
    }//GEN-LAST:event_jLabel11MouseMoved

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
           jLabel11.setText("");
    }//GEN-LAST:event_jLabel11MouseExited

    private void BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillActionPerformed
      
        showsm();
    }//GEN-LAST:event_BillActionPerformed

    private void BillKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BillKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillKeyPressed

      void shows(){
        try {
            supplier.removeAllItems();
            supplier.addItem("Supplier");
            contest(); 
            String year=jyear.getText();
            String month=jmonth.getText();
            String day=jday.getText();
            String date=""+year+"-"+month+"-"+day;
            String select="SELECT `sname` FROM `pharmacy_management`.`purchase` WHERE `date`='"+date+"' AND `status`='main' GROUP BY `sname`";
          
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          supplier.addItem(rs.getString(1));
          
            }
            supplier.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(Purchase_Return.class.getName()).log(Level.SEVERE, null, ex);
        }

}
         void showsm(){
        try {
            madecine.removeAllItems();
            madecine.addItem("Medicine");
              p_quantity.setText("");
          p_price.setText("");
          retur.setText("");
          ret_ammount.setText("");
            contest(); 
            String year=jyear.getText();
            String month=jmonth.getText();
            String day=jday.getText();
            String date=""+year+"-"+month+"-"+day;
            String select="SELECT `medecine` FROM `pharmacy_management`.`purchase` WHERE `date`='"+date+"' AND `sname`='"+supplier.getSelectedItem()+"' AND `id`='"+Bill.getSelectedItem()+"' AND `status`='main' GROUP BY `medecine`";
          
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          madecine.addItem(rs.getString(1));
        
            }
        } catch (SQLException ex) {
            Logger.getLogger(Purchase_Return.class.getName()).log(Level.SEVERE, null, ex);
        }

}
         void showbil(){
        try {
            madecine.removeAllItems();
           madecine.addItem("Medicine");
             Bill.removeAllItems();
           Bill.addItem("Bill No");
              p_quantity.setText("");
          p_price.setText("");
          retur.setText("");
          ret_ammount.setText("");
            contest(); 
            String year=jyear.getText();
            String month=jmonth.getText();
            String day=jday.getText();
            String date=""+year+"-"+month+"-"+day;
            String select="SELECT `id` FROM `pharmacy_management`.`purchase` WHERE `date`='"+date+"' AND `sname`='"+supplier.getSelectedItem()+"' AND `status`='main' GROUP BY `id`";
          
            st = ct.prepareCall(select);
            rs = st.executeQuery(select);
            while(rs.next()){
          Bill.addItem(rs.getString(1));
        
            }
        } catch (SQLException ex) {
            Logger.getLogger(Purchase_Return.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Purchase_Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase_Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase_Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase_Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Purchase_Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bill;
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
    private javax.swing.JTextField jday;
    private javax.swing.JTextField jmonth;
    private javax.swing.JTextField jyear;
    private javax.swing.JComboBox<String> madecine;
    private javax.swing.JTextField p_price;
    private javax.swing.JTextField p_quantity;
    private javax.swing.JTextField ret_ammount;
    private javax.swing.JTextField retur;
    private javax.swing.JComboBox<String> supplier;
    // End of variables declaration//GEN-END:variables
}
