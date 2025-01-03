/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinuwan Theekshana
 */
public class JFrame_30 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_10
     */
    public JFrame_30() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        javax.swing.border.Border JPanel_title__Border = BorderFactory.createMatteBorder(7, 7, 7, 7, Color.black);
        jPanel1.setBorder(JPanel_title__Border);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_Back = new javax.swing.JButton();
        jButton_Print = new javax.swing.JButton();
        jButton_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Print Preview");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Hospital_Management_System/Printer-icon.png"))
        );
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 7, true));
        jPanel1.setLayout(null);

        jTextArea1.setColumns(5);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 790, 550);

        jButton_Back.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Back.setText("<<Back");
        jButton_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Back);
        jButton_Back.setBounds(20, 570, 120, 40);

        jButton_Print.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Print.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Print.setText("Print");
        jButton_Print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrintActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Print);
        jButton_Print.setBounds(350, 570, 120, 40);

        jButton_Close.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Close.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Close.setText("Close");
        jButton_Close.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Close);
        jButton_Close.setBounds(670, 570, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null, "Are you sure to close the print preview.", "Close print preview", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);

        if (a == 0) {

            this.dispose();

        }

    }//GEN-LAST:event_jButton_CloseActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed

        this.dispose();
        JFrame_11 f11 = new JFrame_11();
        f11.setVisible(true);
       
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrintActionPerformed

        try {
            jTextArea1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(JFrame_30.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_PrintActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //mehi t yanu TAB ganada n yanu ENTER gananda wei.
        jTextArea1.append("\t\t ST. ANNE'S HOSPITAL(pvt).Ltd - Sri Lanka \n\n"
                + "\t\t\t Channeling Details \n\n"
                +"" + JFrame_11.jLabel_Time.getText() + "\t\t\t\t\t"  + JFrame_11.jLabel_Date.getText() +"\n\n"
                + "\t\t=====================================================================\n\n"
                + "Channeling Number : \t\t" + JFrame_11.jTextField_Channel_Number.getText() + "\n\n"
                + "Patient Name : \t\t\t" + JFrame_11.jTextField_Patient_Name.getText() + "\n\n"
                + "Doctor' s Name : \t\t" + JFrame_11.jTextField_Doctors_Name.getText() + "\n\n"
                + "Patient Telphone Number : \t" + JFrame_11.jTextField_Patient_Tel_No.getText() + "\n\n"
                + "Patient Address : \t\t" + JFrame_11.jTextField_Patient_Address.getText() + "\n\n"
                + "Channeling Cost : \t\t" + JFrame_11.jTextField_Channeling_Cost.getText() + "\n\n"
                + "Duration Period : \t\t" + JFrame_11.jTextField_Duration_Period.getText() + "\n\n"
                + "\t\t===============Thank You!================\n"
                
        );


    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(JFrame_30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_30().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Close;
    private javax.swing.JButton jButton_Print;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
