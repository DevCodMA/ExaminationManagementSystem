/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author majma
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form UserpPage
     */
    static String user = "180021030987";
    static String sname = "";
    public UserPage(String uname) {
        initComponents();
        user = uname;
//        System.err.println(user);
        this.setResizable(false);
    }
    
    USettings us = new USettings(user);
    ExamPortal ep = new ExamPortal();
    UserResult ur = new UserResult();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        etable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        userString = new javax.swing.JLabel();
        examid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etable.setAutoCreateRowSorter(true);
        etable.setFont(new java.awt.Font("Century", 0, 13)); // NOI18N
        etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam ID", "Exam Name", "Exam Time (Minutes)", "Exam Date", "Maximum Score", "Minimum Score"
            }
        ));
        etable.setRowHeight(30);
        jScrollPane1.setViewportView(etable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 850, 250));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Exam ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 150, 40));

        userString.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        userString.setForeground(new java.awt.Color(255, 255, 255));
        userString.setText("Welcome User");
        userString.setHorizontalTextPosition(JLabel.RIGHT);
        userString.setIconTextGap(8);
        getContentPane().add(userString, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 290, 30));
        getContentPane().add(examid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 240, 40));

        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setText("Start Exam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 130, 40));

        jButton2.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jButton2.setText("Account Settings");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, 60));

        jButton3.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jButton3.setText("Download certificate");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 180, 60));

        jButton4.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 180, 60));

        jButton5.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jButton5.setText("Results");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Projectleader.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        jMenu1.setText("Account Settings");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Results");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Logout");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        uname.setHorizontalTextPosition(JLabel.RIGHT);
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select sname from stddetails where sid='"+user+"'");
            rs.next();
            sname = rs.getString("sname");
            userString.setText("Welcome "+rs.getString("sname"));
            rs = st.executeQuery("select count(*) from exam");
            rs.next();
            int rc = Integer.parseInt(rs.getString("count(*)"));
            DefaultTableModel dtm = (DefaultTableModel) etable.getModel();
            dtm.setRowCount(rc);
            etable.setModel(dtm);
            int counter = 0;
            rs = st.executeQuery("select * from exam");
            while(rs.next()){
                etable.setValueAt(rs.getString("eid"), counter, 0);
                etable.setValueAt(rs.getString("ename"), counter, 1);
                etable.setValueAt(rs.getString("time"), counter, 2);
                etable.setValueAt(rs.getString("date"), counter, 3);
                etable.setValueAt(rs.getString("max"), counter, 4);
                etable.setValueAt(rs.getString("min"), counter, 5);
                counter++;
            }
            
            con.close();
        } catch (Exception e) {
            System.err.println("DB Error");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] month = {
            "JAN",
            "FEB",
            "MAR",
            "APR",
            "MAY",
            "JUN",
            "JUL",
            "AUG",
            "SEP",
            "OCT",
            "NOV",
            "DEC"
        };
        String cdate = "";
        String eid = examid.getText();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from exam where eid='"+eid+"'");
            rs.next();
            String fdate = rs.getString("date");
            rs=st.executeQuery("select sid from result where eid='"+eid+"'");
            rs.next();
            if(user.equals(rs.getString("sid"))){
                JOptionPane.showMessageDialog(ep, "Already attend this exam!");
            }else{
            Date d = new Date();
            cdate += month[d.getMonth()]+" "+d.getDate()+", "+(d.getYear()+1900);
            if(/*fdate.equals(cdate)*/true){
                ep.string(sname, user, eid);
                if(!ep.isShowing())
                    ep.setVisible(true); 
            }else{
                JOptionPane.showMessageDialog(this, "Selected exam is not active!");
            }
            }
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        us.string(user);
        if(!us.isShowing()){
            us.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ur.string(user);
        if(!ur.isShowing())
            ur.setVisible(true);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.err.println("Username: "+user);
                try {
                    Thread.sleep(500);
                    new UserPage(user).setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable etable;
    private javax.swing.JTextField examid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel userString;
    // End of variables declaration//GEN-END:variables
}
