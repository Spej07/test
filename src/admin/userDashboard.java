/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dbConnector.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import userLogs.createUserForm;

/**
 *
 * @author Gwapo ko
 */
public class userDashboard extends javax.swing.JFrame {

    /**
     * Creates new form userDashboard
     */
    public userDashboard() {
        initComponents();
    }

    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT r_id, r_fname, r_lname, r_address, u_status FROM user");
            data.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        p_add = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        p_add1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USERS TABLE FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 637, -1));

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-user-96.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 120, 100));

        acc_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        jPanel2.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 356, 120, 24));

        acc_name1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name1.setText("USERS");
        jPanel2.add(acc_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 100, 24));

        aa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aa.setText("Current User:");
        jPanel2.add(aa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 321, 100, 24));

        p_add.setBackground(new java.awt.Color(255, 255, 255));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD");

        javax.swing.GroupLayout p_addLayout = new javax.swing.GroupLayout(p_add);
        p_add.setLayout(p_addLayout);
        p_addLayout.setHorizontalGroup(
            p_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_addLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        p_addLayout.setVerticalGroup(
            p_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_addLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(56, 56, 56))
        );

        jPanel2.add(p_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, 33));

        p_add1.setBackground(new java.awt.Color(255, 255, 255));
        p_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add1MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EDIT");

        javax.swing.GroupLayout p_add1Layout = new javax.swing.GroupLayout(p_add1);
        p_add1.setLayout(p_add1Layout);
        p_add1Layout.setHorizontalGroup(
            p_add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_add1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        p_add1Layout.setVerticalGroup(
            p_add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_add1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel2.add(p_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 120, 380));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(data);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 57, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        createUserForm crf = new createUserForm();
        crf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
        Color hovercolor = null;
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
        Color navcolor = null;
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseClicked
        int rowIndex = data.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = data.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM user WHERE r_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                if(rs.next()){
                    createUserForm crf = new createUserForm();
                    crf.rid.setText(""+rs.getInt("r_id"));
                    crf.rfn.setText(""+rs.getString("r_fname"));
                    crf.rln.setText(""+rs.getString("r_lname"));
                    crf.adds.setText(""+rs.getString("r_address"));
                    crf.usn.setText(""+rs.getString("r_username"));
                    crf.ps.setText(""+rs.getString("r_password"));
                    crf.ut.setSelectedItem(""+rs.getString("r_type"));
                    crf.us.setSelectedItem(""+rs.getString("r_status"));
                    crf.image.setIcon(crf.ResizeImage(rs.getString("r_image"),null, crf.image));
                    crf.oldpath = rs.getString("r_image");
                    crf.path = rs.getString("r_image");
                    crf.destination = rs.getString("r_image");
                    crf.add.setEnabled(false);
                    crf.update.setEnabled(true);
                    crf.setVisible(true);

                    if(rs.getString("r_image").isEmpty()){
                        crf.select.setEnabled(true);
                        crf.remove.setEnabled(false);
                    }else{
                        crf.select.setEnabled(false);
                        crf.remove.setEnabled(true);
                    }

                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }

    }//GEN-LAST:event_p_add1MouseClicked

    private void p_add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseEntered
        Color hovercolor = null;
        p_add1.setBackground(hovercolor);
    }//GEN-LAST:event_p_add1MouseEntered

    private void p_add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseExited
        Color navcolor = null;
        p_add1.setBackground(navcolor);
    }//GEN-LAST:event_p_add1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adminDashboard adb = new adminDashboard();
        adb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aa;
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JTable data;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_add1;
    // End of variables declaration//GEN-END:variables
}
