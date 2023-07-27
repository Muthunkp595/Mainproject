package Project;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Dis1 extends javax.swing.JFrame {
 public Dis1() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtuser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jcshow_password = new javax.swing.JCheckBox();
        bexit = new javax.swing.JButton();
        blogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(120, 128, 188));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN SCHOOL ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("USER NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jtuser.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jtuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.add(jtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 194, -1));

        jPassword.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 194, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jcshow_password.setBackground(new java.awt.Color(102, 102, 255));
        jcshow_password.setText("show password");
        jcshow_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshow_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(jcshow_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, -1));

        bexit.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        bexit.setText("EXIT");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        jPanel1.add(bexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        blogin.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        blogin.setText("LOGIN");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        jPanel1.add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/log3.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_bexitActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed

        if(jtuser.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please fill out the username");
        }

        else if  (jPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"wrong username or password","message",JOptionPane.ERROR_MESSAGE);

        }
        else if  (jtuser.getText().contains("muthu")&&jPassword.getText().contains("12345678")){
            JForme2 jf=new JForme2();
            jf.show();
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"please fill out the password");
        }
    }//GEN-LAST:event_bloginActionPerformed

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshow_passwordActionPerformed

        if(jcshow_password.isSelected()){
            jPassword.setEchoChar((char)0);
        }
        else{
            jPassword.setEchoChar('*');

        }
    }//GEN-LAST:event_jcshow_passwordActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dis1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton blogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JCheckBox jcshow_password;
    private javax.swing.JTextField jtuser;
    // End of variables declaration//GEN-END:variables
}
