/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination_management_system;

import static examination_management_system.UserPage.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author majma
 */
public class UserResult extends javax.swing.JFrame {

    /**
     * Creates new form UserResult
     */
    static String stdid="";
    public void string(String sid){
        stdid=sid;
    }
    public UserResult() {
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
        examid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        tscore = new javax.swing.JTextField();
        mscore = new javax.swing.JTextField();
        stat = new javax.swing.JTextField();
        edate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Result");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("Exam ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 20));
        getContentPane().add(examid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 230, 40));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Exam Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 110, 20));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Exam Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 110, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setText("Status");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, 20));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setText("Total Score Awarded");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 150, 20));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel8.setText("Maximum Score");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 110, 20));

        ename.setEditable(false);
        ename.setBackground(new java.awt.Color(255, 255, 255));
        ename.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        getContentPane().add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 260, 30));

        tscore.setEditable(false);
        tscore.setBackground(new java.awt.Color(255, 255, 255));
        tscore.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        getContentPane().add(tscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 260, 30));

        mscore.setEditable(false);
        mscore.setBackground(new java.awt.Color(255, 255, 255));
        mscore.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        getContentPane().add(mscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 260, 30));

        stat.setEditable(false);
        stat.setBackground(new java.awt.Color(255, 255, 255));
        stat.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        getContentPane().add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 260, 30));

        edate.setEditable(false);
        edate.setBackground(new java.awt.Color(255, 255, 255));
        edate.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        getContentPane().add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 260, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled-2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 510, 270));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Projectleader.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from result where sid='"+stdid+"' and eid='"+examid.getText()+"'");
            rs.next();
            tscore.setText(rs.getString("awarded"));
            mscore.setText(rs.getString("max"));
            stat.setText(rs.getString("status"));
            rs = st.executeQuery("select ename, date from exam where eid='"+examid.getText()+"'");
            rs.next();
            ename.setText(rs.getString("ename"));
            edate.setText(rs.getString("date"));
            con.close();
        } catch (Exception e) {
            System.err.println(e);
            String sr = ("No such a result in "+examid.getText().toUpperCase());
            JOptionPane.showMessageDialog(examid, sr);
        }
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
            java.util.logging.Logger.getLogger(UserResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edate;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField examid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mscore;
    private javax.swing.JTextField stat;
    private javax.swing.JTextField tscore;
    // End of variables declaration//GEN-END:variables
}
