package Project;

import Project.Frame3;
import Project.Dis1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muthu
 */
public class JForme2 extends javax.swing.JFrame {

    /**
     * Creates new form JForme2
     */
    public JForme2() {
        initComponents();
    }

//    JForme2() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    JForme2() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        mybutton3 = new Newpro.Mybutton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        gallary = new javax.swing.JButton();
        aboutbtn = new javax.swing.JButton();
        Register = new Newpro.Mybutton();
        Reportcard = new Newpro.Mybutton();
        FEES = new Newpro.Mybutton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        mybutton3.setText("mybutton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setText("SCHOOL MANAGEMENT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 470, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1225, 116, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setText("GO BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, -1, -1));

        gallary.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        gallary.setText("Gallery");
        gallary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gallaryActionPerformed(evt);
            }
        });
        jPanel1.add(gallary, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        aboutbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        aboutbtn.setText("About us");
        aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbtnActionPerformed(evt);
            }
        });
        jPanel1.add(aboutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        Register.setText("REGISTER");
        Register.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 260, 50));

        Reportcard.setText("REPORTCARD");
        Reportcard.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        Reportcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportcardActionPerformed(evt);
            }
        });
        jPanel1.add(Reportcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 260, 57));

        FEES.setText("FEES COUNTER");
        FEES.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        FEES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEESActionPerformed(evt);
            }
        });
        jPanel1.add(FEES, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 280, 52));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/img27.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -100, 1250, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FEESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEESActionPerformed
        // TODO add your handling code here:
        Feesframe ff=new Feesframe();
        ff.show();
        dispose();
    }//GEN-LAST:event_FEESActionPerformed

    private void ReportcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportcardActionPerformed
        // TODO add your handling code here:
        Reportcard rc=new Reportcard();
        rc.show();
        dispose();
    }//GEN-LAST:event_ReportcardActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:

        Frame3 f3= new Frame3();
        f3.show();
        dispose();
    }//GEN-LAST:event_RegisterActionPerformed

    private void aboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbtnActionPerformed
        // TODO add your handling code here:
        jForme3 jf=new jForme3();
        jf.show();
        dispose();
    }//GEN-LAST:event_aboutbtnActionPerformed

    private void gallaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gallaryActionPerformed
        // TODO add your handling code here:
        loc1 l1=new loc1();
        l1.show();
        dispose();
    }//GEN-LAST:event_gallaryActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Dis1 d1=new Dis1();
        d1.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JForme2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JForme2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JForme2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JForme2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JForme2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Newpro.Mybutton FEES;
    private Newpro.Mybutton Register;
    private Newpro.Mybutton Reportcard;
    private javax.swing.JButton aboutbtn;
    private javax.swing.JButton gallary;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private Newpro.Mybutton mybutton3;
    // End of variables declaration//GEN-END:variables
}
