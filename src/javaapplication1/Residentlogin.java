/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import dbConnector.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gwapo ko
 */
public class Residentlogin extends javax.swing.JFrame {

    /**
     * Creates new form Residentlogin
     */
    public Residentlogin() {
        initComponents();
    }
{
        initComponents();
    }
      static String status1;
    static String type1;
    public static boolean loginAccount(String username, String password){
          dbConnector db = new dbConnector();
        try{
            String query = "SELECT * FROM user WHERE username = '"+ username +"' AND pass = '"+password+"'";
            ResultSet resultSet = db.getData(query);
           
            if(resultSet.next()){
              
                status1 = resultSet.getString("status"); 
                type1 = resultSet.getString("type");
                 
                  return true;
            }else{
                return false; 
            }
        }catch(SQLException e){
           
            return false;
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ADUSERT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons8-caretaker-80.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 300));

        jDesktopPane1.setBackground(new java.awt.Color(255, 204, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("RESIDENT LOGIN");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 11, -1, 37));

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        ADUSERT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ADUSERT.setText("USER:");
        jDesktopPane1.add(ADUSERT, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 128, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText(" PASS:");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 163, -1, -1));
        jDesktopPane1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 130, 210, 30));

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        jDesktopPane1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 220, -1));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 350, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dbConnector db = new dbConnector();
        if (uname.getText().isEmpty() && pw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your username & password !!.");
        } else if (uname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please cannot be empty.");
        } else if (pw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty.");
        } else {
            if (loginAccount(uname.getText(), pw.getText())) {
                if (!status1.equals("Active")) {
                    JOptionPane.showMessageDialog(null, "Pending Account, Please wait for the approval");
                } else {
            JOptionPane.showMessageDialog(null, "Login successful!");
                        
            if (type1.equals("Admin")) {
                Records  rd= new Records();
                rd.setVisible(true);
                this.dispose();
            }  else {
                JOptionPane.showMessageDialog(null, "No account type found!");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Invalid Account, Please register first !!" );
    }
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 Main m = new Main();
        m.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Residentlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Residentlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Residentlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Residentlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Residentlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADUSERT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
