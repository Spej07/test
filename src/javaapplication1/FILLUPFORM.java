/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;



import config.java.passwordHasher;
import dbConnector.dbConnector;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import userLogs.login;


/**
 *
 * @author Gwapo ko
 */
public class FILLUPFORM extends javax.swing.JFrame {

    private String ex;

    /**
     * Creates new form FILLUPFORM
     */
    public FILLUPFORM() {
        initComponents();
    }
 public static String  username;
   public boolean duplicateCheck() {

    dbConnector dbc = new dbConnector();

    try {
        String query = "SELECT * FROM user WHERE r_username = '" + usname.getText() + "'"; 

        ResultSet resultSet = dbc.getData(query);

        if (resultSet.next()) {
            username = resultSet.getString("r_username");
            if (usname.equals(usname.getText())) {
                JOptionPane.showMessageDialog(null, "Username is already used!");
                usname.setText("");
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

        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        usern = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        stats = new javax.swing.JLabel();
        agee = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        usname = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        adds = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PWD = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();

        jLabel4.setText("AGE:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons8-health-100 (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel1.setText("RESIDNT REGISTER FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 220, 20));

        jPanel41.setBackground(new java.awt.Color(255, 255, 102));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel41.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        name.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        name.setText("FIRSTNAME:");
        jPanel41.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        age.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        age.setText("LASTNAME:");
        jPanel41.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        usern.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        usern.setText("USERNAME:");
        jPanel41.add(usern, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));

        dob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dob.setText("PASSWORD:");
        jPanel41.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        phone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phone.setText("ADDRESS:");
        jPanel41.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        stats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stats.setText("AGE:");
        jPanel41.add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        agee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageeActionPerformed(evt);
            }
        });
        jPanel41.add(agee, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, -1));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel41.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 170, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel41.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 170, -1));

        usname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnameActionPerformed(evt);
            }
        });
        jPanel41.add(usname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 170, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel41.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, -1));

        adds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsActionPerformed(evt);
            }
        });
        jPanel41.add(adds, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("PWD STATUS:");
        jPanel41.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel41.add(PWD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 180, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Resident" }));
        jPanel41.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void addsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addsActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void ageeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           if(fname.getText().isEmpty()|| lname.getText().isEmpty()||usname.getText().isEmpty()||password.getText().isEmpty()||
                agee.getText().isEmpty()|| adds.getText().isEmpty()|| PWD.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "All fields are required!");   
        }else if(password.getText().length() <8){
        JOptionPane.showMessageDialog(null, "Password character should be 8 and above");
        password.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
        }else{
        dbConnector dbc = new dbConnector();
        try{
        String pass = passwordHasher.hashPassword(password.getText());
        String imagePath = "uploads/" + usname.getText() + ".jpg"; 
        
        if(dbc.insertData("INSERT INTO user (r_fname, r_lname, r_username, r_password, r_age,r_address, r_pwdstatus , r_type, r_status) "
                + "VALUES('" + fname.getText() + "', '" + lname.getText() + "', '"
                + usname.getText() + "', '" +pass+ "', '" + agee.getText() + "','"
                + adds.getText() + "','" + PWD.getText() + "','" + type.getSelectedItem() + "', 'PENDING')")) {
        
        JOptionPane.showMessageDialog(null, "Inserted Success!");
            login lfr = new login();
            lfr.setVisible(true);
            this.dispose();
        }else{
        JOptionPane.showMessageDialog(null, "Connection Error!");      
        }     
        }catch(NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
        }
    
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
            java.util.logging.Logger.getLogger(FILLUPFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FILLUPFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FILLUPFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FILLUPFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FILLUPFORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PWD;
    private javax.swing.JTextField adds;
    private javax.swing.JLabel age;
    private javax.swing.JTextField agee;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel name;
    private javax.swing.JTextField password;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel stats;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JLabel usern;
    private javax.swing.JTextField usname;
    // End of variables declaration//GEN-END:variables



  


}
