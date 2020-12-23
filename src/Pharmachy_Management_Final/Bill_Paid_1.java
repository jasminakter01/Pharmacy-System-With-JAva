
package Pharmachy_Management_Final;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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


public class Bill_Paid_1 extends javax.swing.JFrame {

      Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    public Bill_Paid_1(String status) {
        initComponents();
        billNO();
         statusl.setText(status);
        if(statusl.getText().equals("User")){ 
             try {
                jComboBox2.removeAllItems();
                jComboBox2.addItem("Supplier");
                contest();
                String select="SELECT `s_name` FROM `purchase_total` WHERE `status`='main' GROUP BY `s_name`";
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while(rs.next()){
                 jComboBox2.addItem(""+rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        
       jComboBox1.removeAllItems();
       jComboBox1.addItem("main");
        
        }else if(statusl.getText().equals("Admin")){
           jComboBox1.removeAllItems();
           jComboBox1.addItem("main");
           jComboBox1.addItem("sample");
            try {       jLabel4.setText("main");
                jComboBox2.removeAllItems();
                jComboBox2.addItem("Supplier");
                contest();
                String select="SELECT `s_name` FROM `purchase_total` WHERE `status`='main' GROUP BY `s_name`";
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while(rs.next()){
                 jComboBox2.addItem(""+rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
        }
   //shows();hows2();
        total.setVisible(false);
        jLabel7.setVisible(false);
      //s
    }

    private Bill_Paid_1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dat = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        deu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bill1 = new javax.swing.JLabel();
        bill = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        statusl = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        Total = new javax.swing.JTextField();
        Deu = new javax.swing.JTextField();
        Paid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mobile :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(430, 100, 60, 20);

        dat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(dat);
        dat.setBounds(470, 50, 120, 30);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField1);
        jTextField1.setBounds(490, 100, 110, 30);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField2);
        jTextField2.setBounds(80, 100, 340, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 100, 60, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(420, 50, 50, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Date", "Ammount", "Paid", "Due"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 580, 380);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Paid");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(270, 520, 160, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Due");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(430, 520, 170, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Ammount");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(130, 520, 130, 20);

        paid.setEditable(false);
        paid.setBackground(new java.awt.Color(255, 255, 255));
        paid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(paid);
        paid.setBounds(270, 540, 160, 30);

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel3.add(total);
        total.setBounds(130, 540, 140, 30);

        deu.setEditable(false);
        deu.setBackground(new java.awt.Color(255, 255, 255));
        deu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(deu);
        deu.setBounds(430, 540, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("..................................................................");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(60, 600, 200, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Client Signature");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(60, 620, 200, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Authorized Signature");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(400, 620, 200, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("..................................................................");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(400, 600, 200, 20);

        bill1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bill1.setForeground(new java.awt.Color(255, 255, 255));
        bill1.setText("Sl:");
        jPanel3.add(bill1);
        bill1.setBounds(20, 50, 30, 22);

        bill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bill.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(bill);
        bill.setBounds(50, 50, 210, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(240, 80, 630, 660);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Bill");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(200, 0, 700, 50);

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Bill");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(200, 0, 700, 50);

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Bill");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(200, 0, 700, 50);

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));
        jPanel6.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Bill");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(200, 0, 700, 50);

        statusl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        statusl.setForeground(new java.awt.Color(153, 0, 0));
        statusl.setText("Admin");
        jPanel6.add(statusl);
        statusl.setBounds(0, 0, 140, 40);

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("-");
        jLabel105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel105MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel105);
        jLabel105.setBounds(930, 10, 40, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel13);
        jLabel13.setBounds(970, 10, 50, 40);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 0, 1040, 80);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, 0, 1040, 80);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 1110, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1110, 80);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "main", "sample" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(10, 120, 190, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Name" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(10, 160, 190, 30);

        Total.setEditable(false);
        Total.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Total);
        Total.setBounds(10, 220, 190, 30);

        Deu.setEditable(false);
        Deu.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Deu);
        Deu.setBounds(10, 340, 190, 30);

        Paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PaidKeyPressed(evt);
            }
        });
        jPanel1.add(Paid);
        Paid.setBounds(10, 280, 190, 30);

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 70, 130, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Paid Ammount");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(10, 260, 120, 14);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Due Ammount");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 320, 120, 14);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Total Ammount");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(10, 200, 120, 14);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Paid");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 400, 100, 40);

        id.setForeground(new java.awt.Color(204, 0, 0));
        id.setText("jLabel23");
        jPanel1.add(id);
        id.setBounds(40, 30, 120, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 240, 660);

        jPanel7.setBackground(new java.awt.Color(204, 0, 0));
        jPanel7.setLayout(null);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);
        jButton2.setBounds(40, 40, 80, 23);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(870, 80, 170, 660);

        setSize(new java.awt.Dimension(1037, 744));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void shows(){
    int t=0,p=0,d=0,co=0;
          try {
             //    sl.setText("Bill No :"+bill);
             // jTextField2.setText(""+supname);
              //jTextField1.setText(""+num);
               Date dtr = new Date();
             DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
              //  DateFormat dfm = new SimpleDateFormat("yyyy-MM");
             dat.setText(""+df.format(dtr));
             
              String coun="SELECT COUNT(`id`) FROM `purchase_total` WHERE `s_name`='"+jComboBox2.getSelectedItem()+"'AND `status` = '"+jComboBox1.getSelectedItem()+"'";
              contest();
              
              ps=ct.prepareCall(coun);
              rs=ps.executeQuery();
              if(rs.next()){
            co=rs.getInt(1);
               }
              String s="SELECT `id`,`date`,(`ammount`)AS `Per Bill Ammount`,`paid`,(`total_ammount`-`paid`)AS`deu`FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jComboBox2.getSelectedItem()+"'AND `status` = '"+jComboBox1.getSelectedItem()+"'";
              contest();
              DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
             dt.setRowCount(0);
            ps=ct.prepareCall(s);
              rs=ps.executeQuery();
          
if(co<=5){
    while(rs.next()){
           dt.addRow(new Object[]{rs.getInt(1),
             rs.getDate(2),rs.getInt(3),rs.getInt(4),rs.getInt(5) });
                  
              }
}
else{
                co=co-5;
            int co2=0;
             
              while(rs.next()){
           if(co2==co){
           dt.addRow(new Object[]{rs.getInt(1),
             rs.getDate(2),rs.getInt(3),rs.getInt(4),rs.getInt(5) });
             
           }else{
           co2=co2+1;
           } 
              }}
          
              
          } catch (SQLException ex) {
              Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
          }



}
void shows2(){
    int t=0,p=0,d=0;
    bill.setText(""+id.getText());
    jTextField1.setText(""+jLabel4.getText());
          try {
                 
              String s="SELECT `id`,`date`,(`ammount`)AS `Per Bill Ammount`,`paid`,(`total_ammount`-`paid`)AS`deu`FROM `pharmacy_management`.`purchase_total` WHERE `id`='"+bill.getText()+"' AND `status` = '"+jComboBox1.getSelectedItem()+"'";
              contest();
            
              ps=ct.prepareCall(s);
              rs=ps.executeQuery();
              if(rs.next()){
           
                paid.setText(""+rs.getInt(4));
              deu.setText(""+rs.getInt(5));
              
              }
              
              
          } catch (SQLException ex) {
              Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
          }



}
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel105MouseClicked

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
     
        try {int a1=0,p1=0;
        contest();
        String m="SELECT `mobile` FROM `purchase_total` WHERE`s_name`='"+jComboBox2.getSelectedItem()+"'";
         st=ct.prepareCall(m);
              rs=st.executeQuery(m);
              if(rs.next()){
                jLabel4.setText(""+rs.getString(1));
              }
        
              String ta="SELECT SUM(`total_price`) FROM `purchase` WHERE `sname`='"+jComboBox2.getSelectedItem()+"' AND `status` = '"+jComboBox1.getSelectedItem()+"' ";
              st=ct.prepareCall(ta);
              rs=st.executeQuery(ta);
              if(rs.next()){
                a1=rs.getInt(1);
              }
              String pa="SELECT SUM(`paid`) FROM `pharmacy_management`.`purchase_total` WHERE `s_name`='"+jComboBox2.getSelectedItem()+"' AND `status` = '"+jComboBox1.getSelectedItem()+"'";
              st=ct.prepareCall(pa);
              rs=st.executeQuery(pa);
              if(rs.next()){
                  p1=rs.getInt(1);
              }
    
 Total.setText(""+(a1-p1));
     } 
     
     
     catch (SQLException ex) {
              Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
   
        if(jComboBox1.getSelectedIndex()==2){
           
         try {       jLabel4.setText("sample");
                jComboBox2.removeAllItems();
                jComboBox2.addItem("Supplier");
                contest();
                String select="SELECT `s_name` FROM `purchase_total` WHERE `status`='main' GROUP BY `s_name`";
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while(rs.next()){
                 jComboBox2.addItem(""+rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }else if(jComboBox1.getSelectedIndex()==1){
          try {       jLabel4.setText("sample");
                jComboBox2.removeAllItems();
                jComboBox2.addItem("Supplier");
                contest();
                String select="SELECT `s_name` FROM `purchase_total` WHERE `status`='sample' GROUP BY `s_name`";
                st = ct.prepareCall(select);
                rs = st.executeQuery(select);
                while(rs.next()){
                 jComboBox2.addItem(""+rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
                     
        
        
        
        
     
        
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed
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
         id.setText(""+billn);
         
     } catch (SQLException ex) {
         Logger.getLogger(Madechine_Purchase.class.getName()).log(Level.SEVERE, null, ex);
     }


}
  
    private void PaidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaidKeyPressed
   if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if(jComboBox2.getSelectedIndex()<=0){
   JOptionPane.showMessageDialog(rootPane, "Suplier Name Are Not Select....");
   jComboBox2.requestFocus();}

   else if(Total.getText().isEmpty()){
   JOptionPane.showMessageDialog(rootPane, "Taotal Ammount Empty");}
   else{
   
   int a=Integer.parseInt(Total.getText());
   int b=Integer.parseInt(Paid.getText());
   Deu.setText(""+(a-b));
      
   
   
   
   }    
   }    
        
    }//GEN-LAST:event_PaidKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(jComboBox2.getSelectedIndex()<=0){
         JOptionPane.showMessageDialog(rootPane, "Supplier Name Is Empty...");
         jComboBox2.requestFocus();
         }else if(Paid.getText().isEmpty()){
           JOptionPane.showMessageDialog(rootPane, "Paid Is Empty...");
           Paid.requestFocus();
         }else{
        
        
        try {
              Date dt = new Date();
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         
              String in="INSERT INTO `pharmacy_management`.`purchase_total` (`id`,`s_name`,`mobile`,`ammount`,`total_ammount`,`paid`,`status`,`date`) VALUES (?,?,?,?,?,?,?,?)";
              contest(); 
              
              ps=ct.prepareCall(in);
              ps.setInt(1,Integer.parseInt(id.getText()));
              ps.setString(2,jComboBox2.getSelectedItem().toString());
              ps.setString(3,jLabel4.getText());
              ps.setString(4,"0"); 
              ps.setString(5,Total.getText()); 
              ps.setString(6,Paid.getText()); 
              ps.setString(7,jComboBox1.getSelectedItem().toString());
              ps.setString(8,df.format(dt)); 
              int m=ps.executeUpdate();
              if(m>0){ 
                   shows();
                  shows2();
                  
                 // DefaultTableModel dt1=(DefaultTableModel) jTable1.getModel();
                 // dt1.removeRow(0);
                 jTextField2.setText(""+jComboBox2.getSelectedItem());
                  jComboBox1.setSelectedIndex(0);
                  jComboBox2.setSelectedIndex(0);
                  Total.setText("");
                  Paid.setText("");
                  Deu.setText(""); 
                 billNO();
              JOptionPane.showMessageDialog(rootPane, "Payement Paid");
              
              }
          } catch (SQLException ex) {
              Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
          }
     
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         PrinterJob job=PrinterJob.getPrinterJob();
   job.setJobName("Print Data");
   job.setPrintable(new Printable() {
       @Override
       public int print(Graphics pg, PageFormat pf, int PageNum){
           //To change body of generated methods, choose Tools | Templates.
      if(PageNum>0){
            return NO_SUCH_PAGE;}
Graphics2D g2=(Graphics2D) pg;
g2.translate(pf.getImageableX(),pf.getImageableX());
 g2.scale(1,0.8);  
   jPanel3.print(g2);
       return Printable.PAGE_EXISTS;
       }
   });
   if(job.printDialog()==true){
   JOptionPane.showMessageDialog(this,"Print success..");
   try{
   job.print();
   }catch(PrinterException P){
   
   }
   dispose();
   
   }else{JOptionPane.showMessageDialog(this,"Failed...");}
        
     
    }//GEN-LAST:event_jButton2ActionPerformed
 
    public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy_management", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Bill_Paid_1.class.getName()).log(Level.SEVERE, null, ex);
        } }
  
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
            java.util.logging.Logger.getLogger(Bill_Paid_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_Paid_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_Paid_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_Paid_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Bill_Paid_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Deu;
    private javax.swing.JTextField Paid;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel bill;
    private javax.swing.JLabel bill1;
    private javax.swing.JLabel dat;
    private javax.swing.JTextField deu;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField paid;
    private javax.swing.JLabel statusl;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
