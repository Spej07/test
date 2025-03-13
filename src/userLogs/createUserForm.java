/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogs;

import admin.userDashboard;
import dbConnector.dbConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javaapplication1.FILLUPFORM.username;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gwapo ko
 */
public class createUserForm extends javax.swing.JFrame {

 
  

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }
  
    
    public boolean duplicateCheck(){
        
    dbConnector dbc = new dbConnector();
        
     try{
            String query = "SELECT * FROM user  WHERE r_username = '" +usn.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
           
            if(resultSet.next()){
               
                username = resultSet.getString("r_username");
                if(usn.equals(usn.getText())){
                JOptionPane.showMessageDialog(null, "Username is already used!");
                usn.setText("");
                }
                return true;
        }else{
                
                return false;
     }
     }catch(SQLException ex){
         System.out.println(""+ex);
         return false;
     }
    }
    
  public boolean UpdateCheck() {

    dbConnector dbc = new dbConnector();

    try {
        String query = "SELECT * FROM user WHERE r_username = '" + usn.getText() + "' AND r_id != '" + rid.getText() + "'"; 

        ResultSet resultSet = dbc.getData(query);

        if (resultSet.next()) {
            String username = resultSet.getString("r_username");
            if (username.equals(usn.getText())) {
                JOptionPane.showMessageDialog(null, "Username is already used!");
                usn.setText("");
            }
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        System.out.println("" + ex);
        return false;
    }
}
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        rln = new javax.swing.JTextField();
        usn = new javax.swing.JTextField();
        pwd = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        rfn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adds = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User ID:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Last Name:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("UserName:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PWD STATUS:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("User Type:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        rid.setEnabled(false);
        rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridActionPerformed(evt);
            }
        });
        jPanel3.add(rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 52, 139, -1));
        jPanel3.add(rln, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 114, 147, -1));
        jPanel3.add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 138, -1));
        jPanel3.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 138, -1));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jPanel3.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 120, -1));

        add.setBackground(new java.awt.Color(0, 102, 102));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 66, -1));

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 11, -1, -1));

        delete.setBackground(new java.awt.Color(0, 102, 102));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 11, 89, -1));

        clear.setBackground(new java.awt.Color(0, 102, 102));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 11, -1, -1));

        cancel.setBackground(new java.awt.Color(0, 102, 102));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 11, -1, -1));

        refresh.setBackground(new java.awt.Color(0, 102, 102));
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel3.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 11, -1, -1));
        jPanel3.add(rfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 83, 138, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("First Name:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Address:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, -1, -1));
        jPanel3.add(adds, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 148, 147, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Account Type:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 120, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Age:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel3.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 147, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Password:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        jPanel3.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 138, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 510, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ridActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (rfn.getText().isEmpty() || rln.getText().isEmpty() || usn.getText().isEmpty()
        || pwd.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!");
} else if (pwd.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
    pwd.setText("");
} else {

    dbConnector dbc = new dbConnector();

    if (dbc.insertData("INSERT INTO user(r_fname, r_lname, r_username, r_password, r_address, r_age, r_type,r_pwdstatus, r_status) "
            + "VALUES('" + rfn.getText() + "', '" + rln.getText() + "', '"
            + usn.getText() + "', '" + pwd.getText() + "', '" + adds.getText() + "','" + age.getText() + "','" + pwd.getText() + "','" + ut.getSelectedItem().toString() + "', 'PENDING')")) {
        JOptionPane.showMessageDialog(null, "Register Successfully");
        JOptionPane.showMessageDialog(null, "Inserted Successfully!");
        userDashboard udb = new userDashboard();
        udb.setVisible(true);
        this.dispose();

    } else {
        JOptionPane.showMessageDialog(null, "Connection Error!");
    }
}
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if(rfn.getText().isEmpty()|| rln.getText().isEmpty()||adds.getText().isEmpty()||usn.getText().isEmpty()||
            pwd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pwd.getText().length() <8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 and above");
            pwd.setText("");
        }else if(UpdateCheck()){
            System.out.println("Duplicate Exist!");
        }else{

            dbConnector dbc = new dbConnector();
            dbc.updateData("UPDATE user SET r_fname = '"+rfn.getText()+"', r_lname = '"+rln.getText()+"', "
                + "r_address = '"+adds.getText()+"', r_username = '"+usn.getText()+"', r_password = '"+pwd.getText()+"', "
                + "r_type = '"+ut.getSelectedItem()+"', r_status = '"+"' WHERE r_id = '"+rid.getText()+"'");

        }
        {
            userDashboard adb = new userDashboard();
            adb.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        userDashboard adb = new userDashboard();
            adb.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JTextField adds;
    public javax.swing.JTextField age;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    public javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ps;
    public javax.swing.JTextField pwd;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField rfn;
    public javax.swing.JTextField rid;
    public javax.swing.JTextField rln;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JButton update;
    public javax.swing.JTextField usn;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables

  

    
}
