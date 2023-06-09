/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination_management_system;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author majma
 */
public class ViewQuestion extends javax.swing.JFrame {

    /**
     * Creates new form ViewQuestion
     */
    String cname[] = {
        "Question ID",
        "Exam Name",
        "Question",
        "Option A",
        "Option B",
        
    };
    public ViewQuestion() {
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

        tbtn = new javax.swing.JToggleButton();
        exam = new javax.swing.JComboBox<>();
        tpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        qtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Question Bank");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbtn.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tbtn.setText("Filter");
        tbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnActionPerformed(evt);
            }
        });
        getContentPane().add(tbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 110, 40));

        getContentPane().add(exam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 40));

        tpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qtable.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        qtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question ID", "Exam Name", "Question", "Option A", "Option B", "Option C", "Option D", "Answer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        qtable.setRowHeight(30);
        jScrollPane1.setViewportView(qtable);

        tpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        getContentPane().add(tpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 840, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        try {
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery("select ename from exam");
            while(rs.next()){
                exam.addItem(rs.getString("ename"));
            }
            int rc = 0;
            rs = st.executeQuery("select count(*) from question");
            rs.next();
            rc = Integer.parseInt(rs.getString("count(*)"));
//            qtable.set
            rs = st.executeQuery("select * from question");
           
            DefaultTableModel dtm = (DefaultTableModel) qtable.getModel();
            dtm.setRowCount(rc);
            qtable.setModel(dtm);
            int counter = 0;
            
            while(rs.next()){
                qtable.setValueAt(rs.getString("qid"), counter, 0);
                qtable.setValueAt(rs.getString("exam"), counter, 1);
                qtable.setValueAt(rs.getString("qstn"), counter, 2);
                qtable.setValueAt(rs.getString("op1"), counter, 3);
                qtable.setValueAt(rs.getString("op2"), counter, 4);
                qtable.setValueAt(rs.getString("op3"), counter, 5);
                qtable.setValueAt(rs.getString("op4"), counter, 6);
                qtable.setValueAt(rs.getString("ans"), counter, 7);
                counter++;
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println("DB Error");
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void tbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnActionPerformed
        // TODO add your handling code here:
//        exam.getSelectedItem().toString()
          System.err.println(tbtn.isSelected());
          if(tbtn.isSelected()){                           
            try {

                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
                Statement st=con.createStatement();
                int rc = 0;
                ResultSet rs = st.executeQuery("select count(*) from question where exam = '"+exam.getSelectedItem().toString()+"'");
                rs.next();
                rc = Integer.parseInt(rs.getString("count(*)"));
                DefaultTableModel dtm = (DefaultTableModel) qtable.getModel();
                dtm.setRowCount(rc);
                qtable.setModel(dtm);
                rs = st.executeQuery("select * from question where exam = '"+exam.getSelectedItem().toString()+"'");
                int counter = 0;
                while(rs.next()){
                    qtable.setValueAt(rs.getString("qid"), counter, 0);
                    qtable.setValueAt(rs.getString("exam"), counter, 1);
                    qtable.setValueAt(rs.getString("qstn"), counter, 2);
                    qtable.setValueAt(rs.getString("op1"), counter, 3);
                    qtable.setValueAt(rs.getString("op2"), counter, 4);
                    qtable.setValueAt(rs.getString("op3"), counter, 5);
                    qtable.setValueAt(rs.getString("op4"), counter, 6);
                    qtable.setValueAt(rs.getString("ans"), counter, 7);
                    counter++;
                }

                con.close();

            } catch (Exception e) {
                System.err.println("DB Error");
            }
          }else{
            
              try {
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ems","root","");
                    Statement st=con.createStatement();
                    int rc = 0;
                    ResultSet rs = st.executeQuery("select count(*) from question");
                    rs.next();
                    rc = Integer.parseInt(rs.getString("count(*)"));
        //            qtable.set
                    rs = st.executeQuery("select * from question");

                    DefaultTableModel dtm = (DefaultTableModel) qtable.getModel();
                    dtm.setRowCount(rc);
                    qtable.setModel(dtm);
                    int counter = 0;

                    while(rs.next()){
                        qtable.setValueAt(rs.getString("qid"), counter, 0);
                        qtable.setValueAt(rs.getString("exam"), counter, 1);
                        qtable.setValueAt(rs.getString("qstn"), counter, 2);
                        qtable.setValueAt(rs.getString("op1"), counter, 3);
                        qtable.setValueAt(rs.getString("op2"), counter, 4);
                        qtable.setValueAt(rs.getString("op3"), counter, 5);
                        qtable.setValueAt(rs.getString("op4"), counter, 6);
                        qtable.setValueAt(rs.getString("ans"), counter, 7);
                        counter++;
                    }

                    con.close();
              } catch (Exception e) {
                  System.err.println("DB Error");
              }
          }
    }//GEN-LAST:event_tbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> exam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable qtable;
    private javax.swing.JToggleButton tbtn;
    private javax.swing.JPanel tpanel;
    // End of variables declaration//GEN-END:variables
}
