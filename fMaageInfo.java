/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fmanager;
import code.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author malee
 */
public class fMaageInfo extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst= null;
    ResultSet rs=null;
    private Object BDconect;

    /**
     * Creates new form fMaageInfo
     */
    public fMaageInfo() {
        //initComponents();
         //link database connection class
        //conn = BDconect.connect();
        tableload();
    }
     public void tableload(){
        try{
           String sql="SELECT Salary_id,Emp_id_s,Attendance_id_s,Basic_salary,Employee_status,OT_hours,OT_rate,LastMonth_salary,Net_salary FROM payroll "; 
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           tablenew.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        nsal = new javax.swing.JTextField();
        salid = new javax.swing.JTextField();
        empid = new javax.swing.JTextField();
        attid = new javax.swing.JTextField();
        othrs = new javax.swing.JTextField();
        otrate = new javax.swing.JTextField();
        bsal = new javax.swing.JTextField();
        lmsal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablenew = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1186, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 90, 159));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\malee\\OneDrive\\Documents\\oop project\\java-ui-dashboard-001-main\\part 3\\ui-dashboard-001\\src\\com\\employee\\icon\\add-friend (2).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 120));

        jTextField1.setBackground(new java.awt.Color(35, 90, 159));
        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Manage Salary Details");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 410, 50));

        jLabel2.setBackground(new java.awt.Color(35, 90, 159));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 120, 40));

        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 36, 300, 40));

        jLabel3.setBackground(new java.awt.Color(35, 90, 159));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Net Salary");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, -1, -1));

        jLabel4.setBackground(new java.awt.Color(35, 90, 159));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salary ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel5.setBackground(new java.awt.Color(35, 90, 159));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel6.setBackground(new java.awt.Color(35, 90, 159));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Attendence ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel7.setBackground(new java.awt.Color(35, 90, 159));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("OT Hours");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel8.setBackground(new java.awt.Color(35, 90, 159));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OT Rate");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        jLabel10.setBackground(new java.awt.Color(35, 90, 159));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Basic Salary");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, -1, -1));

        jLabel11.setBackground(new java.awt.Color(35, 90, 159));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Last Month Salary");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, -1, -1));

        status.setBackground(new java.awt.Color(0, 153, 255));
        status.setForeground(new java.awt.Color(0, 51, 51));
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Admin", "Finance Manager", "HR Manager", "Training Manager", "Employee" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 250, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 422, 240, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 322, 240, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 240, 40));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 250, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 322, 240, 30));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 240, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 240, 20));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 240, 10));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        nsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsalActionPerformed(evt);
            }
        });
        jPanel1.add(nsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 240, 40));

        salid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidActionPerformed(evt);
            }
        });
        jPanel1.add(salid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, 40));

        empid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empidActionPerformed(evt);
            }
        });
        jPanel1.add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, 40));

        attid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attidActionPerformed(evt);
            }
        });
        jPanel1.add(attid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 240, 40));

        othrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othrsActionPerformed(evt);
            }
        });
        jPanel1.add(othrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 240, 40));

        otrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrateActionPerformed(evt);
            }
        });
        jPanel1.add(otrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 240, 40));

        bsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalActionPerformed(evt);
            }
        });
        jPanel1.add(bsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 240, 40));

        lmsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmsalActionPerformed(evt);
            }
        });
        jPanel1.add(lmsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 240, 40));

        tablenew.setBackground(new java.awt.Color(204, 204, 255));
        tablenew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Salaryid", "Empid", "AttendenceID", "BasicSalary", "EmpStatus", "OTHours", "OTRate", "LastMonthSal", "NetSalary"
            }
        ));
        tablenew.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablenew.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablenew);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 1130, 200));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Delete");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, 110, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Save");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 459, 110, 40));

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setText("Update");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 110, 40));

        jButton4.setBackground(new java.awt.Color(0, 204, 255));
        jButton4.setText("Clear");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 100, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\malee\\OneDrive\\Documents\\oop project\\java-ui-dashboard-001-main\\part 3\\ui-dashboard-001\\src\\com\\employee\\icon\\round.png")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 200, 210));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\malee\\OneDrive\\Documents\\sahan OOP project\\back.png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nsalActionPerformed

    private void empidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empidActionPerformed

    private void attidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attidActionPerformed

    private void othrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_othrsActionPerformed

    private void otrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrateActionPerformed

    private void bsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bsalActionPerformed

    private void lmsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lmsalActionPerformed

    private void salidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salidActionPerformed

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
            java.util.logging.Logger.getLogger(fMaageInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMaageInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMaageInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMaageInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fMaageInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attid;
    private javax.swing.JTextField bsal;
    private javax.swing.JTextField empid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lmsal;
    private javax.swing.JTextField nsal;
    private javax.swing.JTextField othrs;
    private javax.swing.JTextField otrate;
    private javax.swing.JTextField salid;
    private javax.swing.JComboBox status;
    private javax.swing.JTable tablenew;
    // End of variables declaration//GEN-END:variables
}
