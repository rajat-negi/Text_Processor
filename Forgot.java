/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Forgot extends javax.swing.JFrame {
    
     int OTP;

    /**
     * Creates new form Forgot
     */
    public Forgot() {
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

        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOtp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cpass = new javax.swing.JPasswordField();
        jpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 42, 95, 23));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 44, 114, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("OTP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 85, 73, 23));

        txtOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtpActionPerformed(evt);
            }
        });
        getContentPane().add(txtOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 87, 114, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 137, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 186, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 30));

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 44, -1, -1));
        getContentPane().add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 186, 114, 30));
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 140, 114, 28));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String uname = username.getText();
        String otp = txtOtp.getText();
        String pwd = String.valueOf(jpass.getPassword());
        String cpwd = String.valueOf(cpass.getPassword());
        String password =  "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        
        
        
       if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username is Mandotory");
        
            if(otp.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Otp is Mandotory");
            }
            
            if(pwd.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Password is Mandotory");
            }
            
            if(cpwd.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Confirm Password is Mandotory");
            }
        }
       else if(!pwd.equals(cpwd))
        {
           JOptionPane.showMessageDialog(null, "Password do not match"); 
        }
       
       else if(Integer.parseInt(txtOtp.getText())!= OTP)
       {
        JOptionPane.showMessageDialog(null, "OTP is incorrect");   
       }
       
       else if(!pwd.matches(password))
        {
           JOptionPane.showMessageDialog(null, " \n 1.At least 8 chars\n" +
"\n" +
"        2.Contains at least one digit\n" +
"\n" +
"        3.Contains at least one lower alpha char and one upper alpha char\n" +
"\n" +
"        4.Contains at least one char within a set of special chars (@#%$^ etc.)\n" +
"\n" +
"        5.Does not contain space, tab, etc.");  
        }
       
       else
       {
         
          try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //ResultSet
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
           
            String query = "Update signup set pass= '"+jpass.getText()+"' , cpass= '"+cpass.getText()+"' where uname = '"+username.getText()+"' ";
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Password Updated");
            
            
            
              
            
        }
          catch(ClassNotFoundException | SQLException | HeadlessException e)
          {
              JOptionPane.showMessageDialog(null,e);
          }
       
        }
      
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String uname = username.getText();
          if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username is Mandotory");
        }
          
         else
          {
          try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //ResultSet
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
              String sql = "Select mob from signup where uname=?";
                String user = username.getText();
                String useraftertrim = user.trim();
                System.out.println(useraftertrim);
                
                
               
                PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
                pst.setString(1,useraftertrim);
                
                 ResultSet rs = pst.executeQuery();
               
               String mob1=null;
                
                if(rs.next())
                {
                    mob1 = rs.getString("mob");
                    System.out.println(mob1);
                    System.out.println(rs.next());
                }
                
               
    
                if(mob1!=null)
                {
                    JOptionPane.showMessageDialog(null,"Username is Correct");
                    try {
                        // Construct data
                        String apiKey = "apikey=" + "wiHdywV5SrM-a68xJQpbZnU2EsmoolXAsrz5K2y1A1";
                        Random rand = new Random();
                        OTP = rand.nextInt(999999);
                        String name = username.getText();
                        
                        String message = "&message=" + "Hey " + name+ " Your OTP is " +OTP;
                        String sender = "&sender=" + "Mr Perfect";
                        String numbers = "&numbers=" + (mob1=rs.getString("mob"));
                        String submob = "+" + mob1.substring(0,4) + "*****" + mob1.substring(9);
                        
                        // Send data
                        HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
                        String data = apiKey + numbers + message + sender;
                        conn.setDoOutput(true);
                        conn.setRequestMethod("POST");
                        conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
                        conn.getOutputStream().write(data.getBytes("UTF-8"));
                        final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        final StringBuffer stringBuffer = new StringBuffer();
                        String line;
                        while ((line = rd.readLine()) != null) {
                            stringBuffer.append(line);
                        }
                        rd.close();
                        JOptionPane.showMessageDialog(null,"Otp send Successfully to" + submob);
                        
                        
                        //return sResult;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,"Error SMS "+e);
                        //return "Error "+e;
                    }
                    
                    
                    
                    
                    //Close actual window
                    
                    
                    
                    
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Username is incorrect");
                    username.setText(null);
                    
                    
                }
        } 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
          }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtpActionPerformed

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
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField txtOtp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
