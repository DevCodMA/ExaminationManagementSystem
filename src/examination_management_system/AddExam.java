/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author majma
 */
public class AddExam extends javax.swing.JFrame {

    /**
     * Creates new form AddExam
     */
    String examID;
    public AddExam() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        min = new javax.swing.JTextField();
        max = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dt1 = new javax.swing.JComboBox<>();
        dt3 = new javax.swing.JComboBox<>();
        dt2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Examination");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Exam ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 24, 140, 30));

        eid.setEditable(false);
        eid.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        eid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eidFocusLost(evt);
            }
        });
        getContentPane().add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 250, 40));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Exam Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 95, 140, 30));

        ename.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ename.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                enameFocusLost(evt);
            }
        });
        getContentPane().add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 340, 40));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("Exam Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, 30));

        min.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 40));

        max.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        getContentPane().add(max, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, 40));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setText("Maximum Marks");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, 120, 30));

        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 130, 40));

        jButton2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 130, 40));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("Minimum Marks");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 175, 120, 30));

        dt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(dt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 70, 40));

        dt3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        getContentPane().add(dt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 70, 40));

        dt2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        getContentPane().add(dt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 70, 40));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel7.setText("Time in Minutes");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 335, 120, 30));

        time.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ename.setText("");
        min.setText("");
        max.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id, name, mn, mx, tm, dt;
        id = eid.getText();
        name = ename.getText();
        mn = min.getText();
        mx = max.getText();
        dt = dt2.getSelectedItem().toString()+" "+dt1.getSelectedItem().toString()+", "+dt3.getSelectedItem().toString();
        tm = time.getText();
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
            Statement st=con.createStatement();
            st.executeUpdate("insert into exam values('"+id+"','"+name+"',"+mx+","+mn+",'"+dt+"',"+tm+")");
            JOptionPane.showMessageDialog(min, "Exam Registered");
            ename.setText("");
            min.setText("");
            max.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(min, "Exam is not registered", "Error", 2);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void eidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eidFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_eidFocusLost

    private void enameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enameFocusLost
        // TODO add your handling code here:
        String[] name = ename.getText().toUpperCase().split(" ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy");  
        LocalDateTime now = LocalDateTime.now(); 
        eid.setText(String.valueOf(name[0].charAt(0))+String.valueOf(name[0].charAt(1))+String.valueOf(name[1].charAt(0))+String.valueOf(name[1].charAt(1))+dtf.format(now));
    }//GEN-LAST:event_enameFocusLost

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
            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dt1;
    private javax.swing.JComboBox<String> dt2;
    private javax.swing.JComboBox<String> dt3;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField ename;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField max;
    private javax.swing.JTextField min;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
