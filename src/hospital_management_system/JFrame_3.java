/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Dinuwan Theekshana
 */
public class JFrame_3 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_3
     */
    public JFrame_3() {
        initComponents();
        

        //set the form location in the screen.
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        //Add the border.
        Border JPanel_title__Border = BorderFactory.createMatteBorder(7, 7, 7, 7, Color.black);
        jPanel1.setBorder(JPanel_title__Border);

        // Add border and give colour for the minmize & close buttons.
        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Close.setBorder(Lable__Border);
        jLabel_Miniimize.setBorder(Lable__Border);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Miniimize = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jButton_Back = new javax.swing.JButton();
        jButton_LgOut = new javax.swing.JButton();
        jButton_Next1 = new javax.swing.JButton();
        jButton_user_setting = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome Page");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Hospital_Management_System/42491-hospital-icon.png")));
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        jPanel1.setLayout(null);

        jLabel_Miniimize.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Miniimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Miniimize.setText("-");
        jLabel_Miniimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Miniimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MiniimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MiniimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MiniimizeMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_Miniimize);
        jLabel_Miniimize.setBounds(700, 10, 30, 30);

        jLabel_Close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_Close);
        jLabel_Close.setBounds(730, 10, 30, 30);

        jButton_Back.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Back.setText("Close");
        jButton_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Back);
        jButton_Back.setBounds(420, 510, 120, 40);

        jButton_LgOut.setBackground(new java.awt.Color(0, 84, 140));
        jButton_LgOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_LgOut.setForeground(new java.awt.Color(255, 255, 255));
        jButton_LgOut.setText("Logout");
        jButton_LgOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_LgOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_LgOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LgOutActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_LgOut);
        jButton_LgOut.setBounds(230, 510, 120, 40);

        jButton_Next1.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Next1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Next1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next1.setText("Next>>");
        jButton_Next1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Next1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Next1);
        jButton_Next1.setBounds(610, 510, 120, 40);

        jButton_user_setting.setBackground(new java.awt.Color(0, 84, 140));
        jButton_user_setting.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_user_setting.setForeground(new java.awt.Color(255, 255, 255));
        jButton_user_setting.setText("Mange User");
        jButton_user_setting.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_user_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_user_setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_user_settingActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_user_setting);
        jButton_user_setting.setBounds(50, 510, 120, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\My Java Projects\\Hospital_Management_System\\Images\\Welcome - Form.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 750, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_user_settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_user_settingActionPerformed

        JFrame_25 f25 = new JFrame_25();
        f25.setVisible(true);

    }//GEN-LAST:event_jButton_user_settingActionPerformed

    private void jButton_Next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next1ActionPerformed

        this.dispose();
        JFrame_4 f4 = new JFrame_4();
        f4.setVisible(true);

    }//GEN-LAST:event_jButton_Next1ActionPerformed

    private void jLabel_MiniimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MiniimizeMouseClicked

        this.setState(JFrame_1.ICONIFIED);

    }//GEN-LAST:event_jLabel_MiniimizeMouseClicked

    private void jLabel_MiniimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MiniimizeMouseEntered

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_Miniimize.setBorder(Lable__Border);
        jLabel_Miniimize.setForeground(Color.WHITE);

    }//GEN-LAST:event_jLabel_MiniimizeMouseEntered

    private void jLabel_MiniimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MiniimizeMouseExited

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Miniimize.setBorder(Lable__Border);
        jLabel_Miniimize.setForeground(Color.BLACK);

    }//GEN-LAST:event_jLabel_MiniimizeMouseExited

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked

        int a;
        getToolkit().beep();
        a = JOptionPane.showConfirmDialog(null, "Are you sure to extit the program?", "Close the program?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (a == 0) {

           this.dispose();

        }

    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseEntered

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
        jLabel_Close.setBorder(Lable__Border);
        jLabel_Close.setForeground(Color.WHITE);

    }//GEN-LAST:event_jLabel_CloseMouseEntered

    private void jLabel_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseExited

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Close.setBorder(Lable__Border);
        jLabel_Close.setForeground(Color.BLACK);

    }//GEN-LAST:event_jLabel_CloseMouseExited

    private void jButton_LgOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LgOutActionPerformed

        int c;
        c = JOptionPane.showConfirmDialog(null, "Are you sure to you went to logout the system", "Logout System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (c == 0) {
            JFrame_10 f10 = new JFrame_10();
            f10.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton_LgOutActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed

         int b;
        b = JOptionPane.showConfirmDialog(null, "Are you sure to close the program now?", "Close the program...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (b == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jButton_BackActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_LgOut;
    private javax.swing.JButton jButton_Next1;
    private javax.swing.JButton jButton_user_setting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Miniimize;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
