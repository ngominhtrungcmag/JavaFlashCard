/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcard.UI;

import flashcard.Controller.User;
import flashcrad.ConnectDB.KetNoi;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ngomi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int mouseX;
    int mouseY;
    public Login() {
        initComponents();      
        this.setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null);
        txtpassword.setBackground(new Color(0,0,0,0));
        txtusername.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(30);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 0, 51));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(250, 450));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 250, 90));

        kButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton1.setkBorderRadius(30);
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkIndicatorColor(null);
        kButton1.setkIndicatorThickness(0);
        kButton1.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton1.setkSelectedColor(new java.awt.Color(102, 0, 102));
        kButton1.setkStartColor(new java.awt.Color(102, 0, 102));
        kButton1.setLabel("Login");
        kButton1.setOpaque(false);
        kButton1.setPreferredSize(new java.awt.Dimension(70, 30));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, -1));

        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kButton2.setkBorderRadius(30);
        kButton2.setkIndicatorThickness(0);
        kButton2.setkStartColor(new java.awt.Color(102, 0, 102));
        kButton2.setLabel("Sign in");
        kButton2.setOpaque(false);
        kButton2.setPreferredSize(new java.awt.Dimension(70, 30));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 80, -1));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtpassword.setBorder(null);
        txtpassword.setOpaque(false);
        kGradientPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 70, -1));

        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 20));

        txtusername.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtusername.setBorder(null);
        txtusername.setOpaque(false);
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flashcard/UI/Rectangle 1.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 230, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flashcard/UI/Rectangle 1.png"))); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Điều khoản sử dụng.");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
         User user= new User();
        user.setUsername(txtusername.getText());    
        user.setPassword(txtpassword.getText());
        String query = "SELECT username, pass FROM USERFlashCard;";
        KetNoi connect = new KetNoi();
            connect.Mo();
            ResultSet rs = connect.LayDL(query);
        try {
            boolean check = true;
            while (rs.next())
            {
                System.out.println(rs.getString(1));
                if ((rs.getString(1).equalsIgnoreCase(user.getUsername())) && (rs.getString(2).equalsIgnoreCase(user.getPassword())))
                {
                    mainFrame mainframe = new mainFrame();
                    mainframe.setContent(user.getUsername());
                    mainframe.setTitle(user.getUsername());
                    mainframe.show(true);
                    this.show(false);
                    connect.DongKetNoi();
                    check = false;
                    break;
                }
            }
            if (check) JOptionPane.showMessageDialog(rootPane, "Tai khoan hoac mat khau sai!");
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                       

    private void btsinginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.setVisible(false);
        Signin sign = new Signin();
        sign.show(true);
    }                                        

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
               this.setVisible(false);
        Signin sign = new Signin();
        sign.show(true);
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jLabel4MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}