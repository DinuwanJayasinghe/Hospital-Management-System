/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Dinuwan Theekshana
 */
public class JFrame_20 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_20
     */
    public JFrame_20() {

        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        Border JPanel_title__Border = BorderFactory.createMatteBorder(7, 7, 7, 7, Color.black);
        jPanel1.setBorder(JPanel_title__Border);

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Close.setBorder(Lable__Border);
        jLabel_Miniimize.setBorder(Lable__Border);
        jLabel_Ico_SHOW_Password.setBorder(Lable__Border);
        jLabel_Ico_SHOW_Retype_Password.setBorder(Lable__Border);
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
        jLabel_Ico_SHOW_Retype_Password = new javax.swing.JLabel();
        jLabel_Ico_SHOW_Password = new javax.swing.JLabel();
        jLabel_Miniimize = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_NIC_Num = new javax.swing.JTextField();
        jButton_Back = new javax.swing.JButton();
        jButton_Forgot = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jLabel_Val_NIC_NO = new javax.swing.JLabel();
        jLabel_Val_New_pw = new javax.swing.JLabel();
        jPassword_Conform_PW = new javax.swing.JPasswordField();
        jPassword_New_pw = new javax.swing.JPasswordField();
        jLabel_Val_Confirm_pw = new javax.swing.JLabel();
        jLabel_Show_Password_dont_Delete = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forgot Password");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Hospital_Management_System/icons8-password-reset-30.png"))
        );
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        jPanel1.setLayout(null);

        jLabel_Ico_SHOW_Retype_Password.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Ico_SHOW_Retype_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Ico_SHOW_Retype_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/icons8-eye-32.png"))); // NOI18N
        jLabel_Ico_SHOW_Retype_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Ico_SHOW_Retype_Password.setOpaque(true);
        jLabel_Ico_SHOW_Retype_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_Retype_PasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_Retype_PasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_Retype_PasswordMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_Ico_SHOW_Retype_Password);
        jLabel_Ico_SHOW_Retype_Password.setBounds(500, 280, 30, 30);

        jLabel_Ico_SHOW_Password.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Ico_SHOW_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Ico_SHOW_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/icons8-eye-32.png"))); // NOI18N
        jLabel_Ico_SHOW_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Ico_SHOW_Password.setOpaque(true);
        jLabel_Ico_SHOW_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_PasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_PasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Ico_SHOW_PasswordMouseExited(evt);
            }
        });
        jPanel1.add(jLabel_Ico_SHOW_Password);
        jLabel_Ico_SHOW_Password.setBounds(500, 210, 30, 30);

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
        jLabel_Miniimize.setBounds(630, 0, 30, 40);

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
        jLabel_Close.setBounds(660, 0, 30, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forgot My Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 30, 690, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NIC No :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 140, 77, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("New Password :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 210, 145, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Conform Password :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 280, 200, 20);

        jTextField_NIC_Num.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_NIC_Num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_NIC_NumKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NIC_NumKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_NIC_Num);
        jTextField_NIC_Num.setBounds(270, 140, 260, 30);

        jButton_Back.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Back.setText("<<Back");
        jButton_Back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Back);
        jButton_Back.setBounds(40, 350, 120, 40);

        jButton_Forgot.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Forgot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Forgot.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Forgot.setText("Forgot");
        jButton_Forgot.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Forgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ForgotActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Forgot);
        jButton_Forgot.setBounds(280, 350, 120, 40);

        jButton_Clear.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Clear.setText("Clear");
        jButton_Clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Clear);
        jButton_Clear.setBounds(530, 350, 120, 40);

        jLabel_Val_NIC_NO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Val_NIC_NO.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Val_NIC_NO);
        jLabel_Val_NIC_NO.setBounds(270, 170, 260, 30);

        jLabel_Val_New_pw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Val_New_pw.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Val_New_pw);
        jLabel_Val_New_pw.setBounds(270, 240, 260, 30);

        jPassword_Conform_PW.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPassword_Conform_PW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassword_Conform_PWKeyPressed(evt);
            }
        });
        jPanel1.add(jPassword_Conform_PW);
        jPassword_Conform_PW.setBounds(270, 280, 230, 30);

        jPassword_New_pw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPassword_New_pw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassword_New_pwKeyPressed(evt);
            }
        });
        jPanel1.add(jPassword_New_pw);
        jPassword_New_pw.setBounds(270, 210, 230, 30);

        jLabel_Val_Confirm_pw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Val_Confirm_pw.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Val_Confirm_pw);
        jLabel_Val_Confirm_pw.setBounds(270, 310, 260, 30);

        jLabel_Show_Password_dont_Delete.setText("jLabel3");
        jPanel1.add(jLabel_Show_Password_dont_Delete);
        jLabel_Show_Password_dont_Delete.setBounds(50, 330, 0, 16);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("V");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(530, 140, 20, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\My Java Projects\\Hospital_Management_System\\Images\\14046.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 10, 680, 390);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("V");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 150, 20, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed

        JFrame_1 f1 = new JFrame_1();
        f1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed

        jPassword_Conform_PW.setText(null);
        jTextField_NIC_Num.setText(null);
        jPassword_New_pw.setText(null);
        jLabel_Val_Confirm_pw.setText(null);
        jLabel_Val_NIC_NO.setText(null);
        jLabel_Val_New_pw.setText(null);
        jTextField_NIC_Num.grabFocus();

    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jTextField_NIC_NumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NIC_NumKeyTyped

        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_ENTER)) {

            evt.consume();
            getToolkit().beep();
            jLabel_Val_NIC_NO.setText("Please enter only numbers.");
        }

    }//GEN-LAST:event_jTextField_NIC_NumKeyTyped

    private void jLabel_MiniimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MiniimizeMouseClicked

        this.setState(JFrame_20.ICONIFIED);

    }//GEN-LAST:event_jLabel_MiniimizeMouseClicked

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked

        int a;
        getToolkit().beep();
        a = JOptionPane.showConfirmDialog(null, "Are you sure to extit the program?", "Close the program?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (a == 0) {

            this.dispose();
        }

    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_ForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ForgotActionPerformed

  
            if (jTextField_NIC_Num.getText().trim().isEmpty() && jPassword_Conform_PW.getText().trim().isEmpty() && jPassword_New_pw.getText().trim().isEmpty()) {

                getToolkit().beep();

                jLabel_Val_NIC_NO.setText("N.I.C Number is empty");
                jLabel_Val_New_pw.setText("Enter your new password.");
                jLabel_Val_Confirm_pw.setText("Conform your password.");
            }
            if (jTextField_NIC_Num.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_NIC_NO.setText("N.I.C Number is empty");

            }
            if (jPassword_New_pw.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_New_pw.setText("Enter your new password.");

            }
            if (jPassword_Conform_PW.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_Confirm_pw.setText("Conform your password.");

        } else if (jPassword_New_pw.getText().equals(jPassword_Conform_PW.getText())) {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "hospital_management_system_database";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                String query = "UPDATE useres SET Password=? ,Re_Enter_Password=? WHERE NIC_No=?";//query wka ewnass wenawa ekinekata

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, jPassword_New_pw.getText());//query eke adala feild eka yedi athi place eke number eka merhanadi parameeeter eka lesa yediya yuthuya.
                pst.setString(2, jPassword_Conform_PW.getText());
                pst.setString(3, jTextField_NIC_Num.getText());
                pst.executeUpdate();

                System.out.println(pst);
                System.out.println("1 row affected");

                JOptionPane.showMessageDialog(null, "Password change Succsessfully!!!");

                con.close();

            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                Logger.getLogger(JFrame_20.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                getToolkit().beep();

                JOptionPane.showMessageDialog(null, ex, "Error!", JOptionPane.ERROR_MESSAGE);
                this.dispose();
                JFrame_1 f1 = new JFrame_1();
                f1.setVisible(true);
            }
            jPassword_Conform_PW.setText(null);
            jPassword_New_pw.setText(null);
            jTextField_NIC_Num.setText(null);
            jTextField_NIC_Num.grabFocus();

        }else{
        
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Password is not matched", "Error!!!", JOptionPane.ERROR_MESSAGE);

            jPassword_Conform_PW.setText(null);
            jPassword_New_pw.setText(null);
            jTextField_NIC_Num.setText(null);
            jLabel_Val_New_pw.setText(null);
            jLabel_Val_Confirm_pw.setText(null);
            jLabel_Val_NIC_NO.setText(null);
            jTextField_NIC_Num.grabFocus();
        
        }

    }//GEN-LAST:event_jButton_ForgotActionPerformed

    private void jLabel_Ico_SHOW_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseClicked

        if (jLabel_Show_Password_dont_Delete.getText().equals("")) {

            jPassword_New_pw.setEchoChar((char) 0);
            jLabel_Show_Password_dont_Delete.setText("set");

        } else {

            jPassword_New_pw.setEchoChar('*');
            jLabel_Show_Password_dont_Delete.setText("");

        }
    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseClicked

    private void jLabel_Ico_SHOW_PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseEntered

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLUE);
        jLabel_Ico_SHOW_Password.setBorder(Lable__Border);
        jLabel_Ico_SHOW_Password.setForeground(Color.BLUE);

    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseEntered

    private void jLabel_Ico_SHOW_PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseExited

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_Ico_SHOW_Password.setBorder(Lable__Border);
        jLabel_Ico_SHOW_Password.setForeground(Color.BLACK);

    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseExited

    private void jLabel_Ico_SHOW_Retype_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_Retype_PasswordMouseClicked

        if (jLabel_Show_Password_dont_Delete.getText().equals("")) {

            jPassword_Conform_PW.setEchoChar((char) 0);
            jLabel_Show_Password_dont_Delete.setText("set");

        } else {

            jPassword_Conform_PW.setEchoChar('*');
            jLabel_Show_Password_dont_Delete.setText("");

        }

    }//GEN-LAST:event_jLabel_Ico_SHOW_Retype_PasswordMouseClicked

    private void jLabel_Ico_SHOW_Retype_PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_Retype_PasswordMouseEntered

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLUE);
        jLabel_Ico_SHOW_Retype_Password.setBorder(Lable__Border);
        jLabel_Ico_SHOW_Retype_Password.setForeground(Color.BLUE);

    }//GEN-LAST:event_jLabel_Ico_SHOW_Retype_PasswordMouseEntered

    private void jLabel_Ico_SHOW_Retype_PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_Retype_PasswordMouseExited

        Border Lable__Border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        jLabel_Ico_SHOW_Retype_Password.setBorder(Lable__Border);
        jLabel_Ico_SHOW_Retype_Password.setForeground(Color.BLACK);

    }//GEN-LAST:event_jLabel_Ico_SHOW_Retype_PasswordMouseExited

    private void jTextField_NIC_NumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NIC_NumKeyPressed

        jLabel_Val_NIC_NO.setText(null);

        //It use for work the enter button.
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (jTextField_NIC_Num.getText().trim().isEmpty() && jPassword_Conform_PW.getText().trim().isEmpty() && jPassword_New_pw.getText().trim().isEmpty()) {

                getToolkit().beep();

                jLabel_Val_NIC_NO.setText("N.I.C Number is empty");
                jLabel_Val_New_pw.setText("Enter your new password.");
                jLabel_Val_Confirm_pw.setText("Conform your password.");
            }
            if (jTextField_NIC_Num.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_NIC_NO.setText("N.I.C Number is empty");

            }
            if (jPassword_New_pw.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_New_pw.setText("Enter your new password.");

            }
            if (jPassword_Conform_PW.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_Confirm_pw.setText("Conform your password.");

            } else if (jPassword_New_pw.getText().equals(jPassword_Conform_PW.getText())) {

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/";
                    String db = "hospital_management_system_database";
                    String user = "root";
                    String pword = "123456";

                    Connection con = null;
                    con = DriverManager.getConnection(url + db, user, pword);

                    String query = "UPDATE useres SET Password=? ,Re_Enter_Password=? WHERE NIC_No=?";//query wka ewnass wenawa ekinekata

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, jPassword_New_pw.getText());//query eke adala feild eka yedi athi place eke number eka merhanadi parameeeter eka lesa yediya yuthuya.
                    pst.setString(2, jPassword_Conform_PW.getText());
                    pst.setString(3, jTextField_NIC_Num.getText());
                    pst.executeUpdate();

                    System.out.println(pst);
                    System.out.println("1 row affected");

                    JOptionPane.showMessageDialog(null, "Password change Succsessfully!!!");

                    con.close();

                } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                    Logger.getLogger(JFrame_20.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                    getToolkit().beep();

                    JOptionPane.showMessageDialog(null, ex, "Error!", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                    JFrame_1 f1 = new JFrame_1();
                    f1.setVisible(true);

                }
                jPassword_Conform_PW.setText(null);
                jPassword_New_pw.setText(null);
                jTextField_NIC_Num.setText(null);
                jTextField_NIC_Num.grabFocus();

            } else {

                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Password is not matched", "Error!!!", JOptionPane.ERROR_MESSAGE);

                jPassword_Conform_PW.setText(null);
                jPassword_New_pw.setText(null);
                jTextField_NIC_Num.setText(null);
                jLabel_Val_New_pw.setText(null);
                jLabel_Val_Confirm_pw.setText(null);
                jLabel_Val_NIC_NO.setText(null);
                jTextField_NIC_Num.grabFocus();

            }

        }

    }//GEN-LAST:event_jTextField_NIC_NumKeyPressed

    private void jPassword_New_pwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassword_New_pwKeyPressed

        jLabel_Val_New_pw.setText(null);

        //It use for work the enter button.
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (jTextField_NIC_Num.getText().trim().isEmpty() && jPassword_Conform_PW.getText().trim().isEmpty() && jPassword_New_pw.getText().trim().isEmpty()) {

                getToolkit().beep();

                jLabel_Val_NIC_NO.setText("N.I.C Number is empty");
                jLabel_Val_New_pw.setText("Enter your new password.");
                jLabel_Val_Confirm_pw.setText("Conform your password.");
            }
            if (jTextField_NIC_Num.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_NIC_NO.setText("N.I.C Number is empty");

            }
            if (jPassword_New_pw.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_New_pw.setText("Enter your new password.");

            }
            if (jPassword_Conform_PW.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_Confirm_pw.setText("Conform your password.");

            } else if (jPassword_New_pw.getText().equals(jPassword_Conform_PW.getText())) {

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/";
                    String db = "hospital_management_system_database";
                    String user = "root";
                    String pword = "123456";

                    Connection con = null;
                    con = DriverManager.getConnection(url + db, user, pword);

                    String query = "UPDATE useres SET Password=? ,Re_Enter_Password=? WHERE NIC_No=?";//query wka ewnass wenawa ekinekata

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, jPassword_New_pw.getText());//query eke adala feild eka yedi athi place eke number eka merhanadi parameeeter eka lesa yediya yuthuya.
                    pst.setString(2, jPassword_Conform_PW.getText());
                    pst.setString(3, jTextField_NIC_Num.getText());
                    pst.executeUpdate();

                    System.out.println(pst);
                    System.out.println("1 row affected");

                    JOptionPane.showMessageDialog(null, "Password change Succsessfully!!!");

                    con.close();

                } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                    Logger.getLogger(JFrame_20.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                    getToolkit().beep();

                    JOptionPane.showMessageDialog(null, ex, "Error!", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                    JFrame_1 f1 = new JFrame_1();
                    f1.setVisible(true);
                }
                jPassword_Conform_PW.setText(null);
                jPassword_New_pw.setText(null);
                jTextField_NIC_Num.setText(null);
                jTextField_NIC_Num.grabFocus();

            } else {

                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Password is not matched", "Error!!!", JOptionPane.ERROR_MESSAGE);

                jPassword_Conform_PW.setText(null);
                jPassword_New_pw.setText(null);
                jTextField_NIC_Num.setText(null);
                jLabel_Val_New_pw.setText(null);
                jLabel_Val_Confirm_pw.setText(null);
                jLabel_Val_NIC_NO.setText(null);
                jTextField_NIC_Num.grabFocus();

            }

        }


    }//GEN-LAST:event_jPassword_New_pwKeyPressed

    private void jPassword_Conform_PWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassword_Conform_PWKeyPressed

        jLabel_Val_Confirm_pw.setText(null);

        //It use for work the enter button.
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (jTextField_NIC_Num.getText().trim().isEmpty() && jPassword_Conform_PW.getText().trim().isEmpty() && jPassword_New_pw.getText().trim().isEmpty()) {

                getToolkit().beep();

                jLabel_Val_NIC_NO.setText("N.I.C Number is empty");
                jLabel_Val_New_pw.setText("Enter your new password.");
                jLabel_Val_Confirm_pw.setText("Conform your password.");
            }
            if (jTextField_NIC_Num.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_NIC_NO.setText("N.I.C Number is empty");

            }
            if (jPassword_New_pw.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_New_pw.setText("Enter your new password.");

            }
            if (jPassword_Conform_PW.getText().trim().isEmpty()) {

                getToolkit().beep();
                jLabel_Val_Confirm_pw.setText("Conform your password.");

            } else if (jPassword_New_pw.getText().equals(jPassword_Conform_PW.getText())) {

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/";
                    String db = "hospital_management_system_database";
                    String user = "root";
                    String pword = "123456";

                    Connection con = null;
                    con = DriverManager.getConnection(url + db, user, pword);

                    String query = "UPDATE useres SET Password=? ,Re_Enter_Password=? WHERE NIC_No=?";//query wka ewnass wenawa ekinekata

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, jPassword_New_pw.getText());//query eke adala feild eka yedi athi place eke number eka merhanadi parameeeter eka lesa yediya yuthuya.
                    pst.setString(2, jPassword_Conform_PW.getText());
                    pst.setString(3, jTextField_NIC_Num.getText());
                    pst.executeUpdate();

                    System.out.println(pst);
                    System.out.println("1 row affected");

                    JOptionPane.showMessageDialog(null, "Passwor change Succsessfully!!!");

                    con.close();

                } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                    Logger.getLogger(JFrame_20.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                    getToolkit().beep();

                    JOptionPane.showMessageDialog(null, ex, "Error!", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                    JFrame_1 f1 = new JFrame_1();
                    f1.setVisible(true);
                }
                jPassword_Conform_PW.setText(null);
                jPassword_New_pw.setText(null);
                jTextField_NIC_Num.setText(null);
                jTextField_NIC_Num.grabFocus();

            } else {

                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Password is not matched", "Error!!!", JOptionPane.ERROR_MESSAGE);

                jPassword_Conform_PW.setText(null);
                jPassword_New_pw.setText(null);
                jTextField_NIC_Num.setText(null);
                jLabel_Val_New_pw.setText(null);
                jLabel_Val_Confirm_pw.setText(null);
                jLabel_Val_NIC_NO.setText(null);
                jTextField_NIC_Num.grabFocus();

            }

        }


    }//GEN-LAST:event_jPassword_Conform_PWKeyPressed

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
            java.util.logging.Logger.getLogger(JFrame_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_20().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Forgot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Ico_SHOW_Password;
    private javax.swing.JLabel jLabel_Ico_SHOW_Retype_Password;
    private javax.swing.JLabel jLabel_Miniimize;
    private javax.swing.JLabel jLabel_Show_Password_dont_Delete;
    private javax.swing.JLabel jLabel_Val_Confirm_pw;
    private javax.swing.JLabel jLabel_Val_NIC_NO;
    private javax.swing.JLabel jLabel_Val_New_pw;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword_Conform_PW;
    private javax.swing.JPasswordField jPassword_New_pw;
    private javax.swing.JTextField jTextField_NIC_Num;
    // End of variables declaration//GEN-END:variables
}
