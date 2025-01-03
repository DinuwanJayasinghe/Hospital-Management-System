/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

/**
 *
 * @author Dinuwan Theekshana
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class JFrame_1 extends javax.swing.JFrame {

    private JFrame frame;

    int attempt = 0;

    /**
     * Creates new form JFrame_1
     */
    public JFrame_1() {

        initComponents();
        jLabel_Show_Password_dont_Delete.setVisible(false);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel_ICO_Username = new javax.swing.JLabel();
        jTextField_User_Name = new javax.swing.JTextField();
        jLabel_Ico_SHOW_Password = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel3_Admin_pannel = new javax.swing.JLabel();
        jButton_Log = new javax.swing.JButton();
        jButton_Clr = new javax.swing.JButton();
        jButton_Cnsl = new javax.swing.JButton();
        jLabel_Val_PWord = new javax.swing.JLabel();
        jLabel_Val_UName1 = new javax.swing.JLabel();
        jLabel_Miniimize = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Show_Password_dont_Delete = new javax.swing.JLabel();
        jLabel_ICO_PW1 = new javax.swing.JLabel();
        jLabel3_Forgot_Password = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login to Hospital Management System");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Hospital_Management_System/hospital-sign-icon-1.png"))
        );
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login to Hospital Management System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 800, 40);

        jLabel_ICO_Username.setBackground(new java.awt.Color(0, 153, 255));
        jLabel_ICO_Username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ICO_Username.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_ICO_Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ICO_Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/Office-Girl-icon.png"))); // NOI18N
        jLabel_ICO_Username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ICO_Username.setOpaque(true);
        jPanel1.add(jLabel_ICO_Username);
        jLabel_ICO_Username.setBounds(230, 320, 40, 40);

        jTextField_User_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_User_Name.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_User_Name.setText("Username");
        jTextField_User_Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField_User_Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_User_NameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_User_NameFocusLost(evt);
            }
        });
        jTextField_User_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_User_NameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextField_User_Name);
        jTextField_User_Name.setBounds(290, 320, 270, 40);

        jLabel_Ico_SHOW_Password.setBackground(new java.awt.Color(0, 153, 255));
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
        jLabel_Ico_SHOW_Password.setBounds(520, 420, 40, 40);

        jPasswordField_Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordField_Password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_Password.setText("password");
        jPasswordField_Password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_PasswordFocusLost(evt);
            }
        });
        jPasswordField_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_PasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField_Password);
        jPasswordField_Password.setBounds(290, 420, 230, 40);

        jLabel3_Admin_pannel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3_Admin_pannel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_Admin_pannel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/Login key.png"))); // NOI18N
        jLabel3_Admin_pannel.setText("<<Open Admin Panel >>");
        jLabel3_Admin_pannel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3_Admin_pannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_Admin_pannelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3_Admin_pannelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3_Admin_pannelMouseExited(evt);
            }
        });
        jPanel1.add(jLabel3_Admin_pannel);
        jLabel3_Admin_pannel.setBounds(310, 570, 230, 30);

        jButton_Log.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Log.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Log.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Log.setText("Login");
        jButton_Log.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Log);
        jButton_Log.setBounds(360, 620, 120, 40);

        jButton_Clr.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Clr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Clr.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Clr.setText("Clear");
        jButton_Clr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Clr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClrActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Clr);
        jButton_Clr.setBounds(90, 620, 120, 40);

        jButton_Cnsl.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Cnsl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Cnsl.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cnsl.setText("Cancel");
        jButton_Cnsl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Cnsl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cnsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CnslActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Cnsl);
        jButton_Cnsl.setBounds(610, 620, 120, 40);

        jLabel_Val_PWord.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Val_PWord.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Val_PWord);
        jLabel_Val_PWord.setBounds(290, 470, 230, 20);

        jLabel_Val_UName1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Val_UName1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Val_UName1);
        jLabel_Val_UName1.setBounds(290, 370, 230, 20);

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
        jLabel_Miniimize.setBounds(750, 10, 30, 30);

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
        jLabel_Close.setBounds(780, 10, 30, 30);

        jLabel_Show_Password_dont_Delete.setText("jLabel3");
        jPanel1.add(jLabel_Show_Password_dont_Delete);
        jLabel_Show_Password_dont_Delete.setBounds(50, 330, 0, 14);

        jLabel_ICO_PW1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel_ICO_PW1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ICO_PW1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_ICO_PW1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ICO_PW1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/password-manager-icon.png"))); // NOI18N
        jLabel_ICO_PW1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_ICO_PW1.setOpaque(true);
        jPanel1.add(jLabel_ICO_PW1);
        jLabel_ICO_PW1.setBounds(230, 420, 40, 40);

        jLabel3_Forgot_Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3_Forgot_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_Forgot_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/icons8-password-reset-30.png"))); // NOI18N
        jLabel3_Forgot_Password.setText("<<Forgot My Password >>");
        jLabel3_Forgot_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3_Forgot_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_Forgot_PasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3_Forgot_PasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3_Forgot_PasswordMouseExited(evt);
            }
        });
        jPanel1.add(jLabel3_Forgot_Password);
        jLabel3_Forgot_Password.setBounds(310, 520, 230, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/Hospital-512.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 90, 800, 510);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/g5AQGj.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 800, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CnslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CnslActionPerformed

        int a;
        getToolkit().beep();
        a = JOptionPane.showConfirmDialog(null, "Are you sure to you went to close this program now?", "Close Program", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {
            System.exit(a);
        }

    }//GEN-LAST:event_jButton_CnslActionPerformed

    private void jButton_LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogActionPerformed

        if (jTextField_User_Name.getText().trim().isEmpty() && jPasswordField_Password.getText().trim().isEmpty()) {

            jLabel_Val_UName1.setText("Usernme is empty.");
            jLabel_Val_PWord.setText("Password is empty.");
        } else if (jTextField_User_Name.getText().trim().isEmpty()) {
            jLabel_Val_UName1.setText("Usernme is empty.");
        } else if (jPasswordField_Password.getText().trim().isEmpty()) {
            jLabel_Val_PWord.setText("Password is empty.");
        }

        if (jTextField_User_Name.getText().equals("username") && jPasswordField_Password.getText().equals("password")) {

            jLabel_Val_UName1.setText("Usernme is empty.");
            jLabel_Val_PWord.setText("Password is empty.");

        } else if (jTextField_User_Name.getText().equals("username")) {
            jLabel_Val_UName1.setText("Usernme is empty.");
        } else if (jPasswordField_Password.getText().equals("password")) {
            jLabel_Val_PWord.setText("Password is empty.");
        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "hospital_management_system_database";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                String query = "SELECT * FROM useres WHERE Usename=? and Password=?";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, jTextField_User_Name.getText());
                pst.setString(2, jPasswordField_Password.getText());

                ResultSet res = pst.executeQuery();

                if (res.next()) {

                  //  JOptionPane.showMessageDialog(null, "Username and Password is matched.", "Login Succsessfully", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    JFrame_2 f2 = new JFrame_2();
                    f2.setVisible(true);

                } else {

                    getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Username and Password is does not matched.", "Login Unsuccsessfully", JOptionPane.ERROR_MESSAGE);

                    jTextField_User_Name.setText(null);
                    jPasswordField_Password.setText(null);
                    jLabel_Val_PWord.setText(null);
                    jLabel_Val_UName1.setText(null);
                    jTextField_User_Name.grabFocus();

                    attempt += 1;

                    if (attempt == 4) {

                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "You enter wrong username or password four times. There for the system is stoped", "System Error!!!", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);

                    }
                }

                con.close();

            } catch (Exception ex) {

                Logger.getLogger(JFrame_1.class.getName()).log(Level.SEVERE, null, ex);
                getToolkit().beep();

                JOptionPane.showMessageDialog(null, ex, "Connection Error", JOptionPane.ERROR_MESSAGE);

                jTextField_User_Name.setText(null);
                jPasswordField_Password.setText(null);
                jLabel_Val_UName1.setText(null);
                jLabel_Val_PWord.setText(null);
                jTextField_User_Name.grabFocus();

            }
        }
    }//GEN-LAST:event_jButton_LogActionPerformed

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

    private void jTextField_User_NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_User_NameFocusGained

        //That is clear the text felds and show "username".
        if (jTextField_User_Name.getText().trim().toLowerCase().equals("username")) {

            jTextField_User_Name.setText(null);
            jTextField_User_Name.setForeground(Color.BLACK);

        }

        //change icon border
        Border JPanel_title__Border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.YELLOW);//me code eken add karanna puluwan RGB colours vitharai.
        jLabel_ICO_Username.setBorder(JPanel_title__Border);
        jLabel_Ico_SHOW_Password.setBorder(JPanel_title__Border);

    }//GEN-LAST:event_jTextField_User_NameFocusGained

    private void jTextField_User_NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_User_NameFocusLost

        if (jTextField_User_Name.getText().trim().equals("") || jTextField_User_Name.getText().trim().toLowerCase().equals("username")) {

            jTextField_User_Name.setText("username");
            jTextField_User_Name.setForeground(new Color(153, 153, 153));//me code eken apita kamthi patak add karanna puluwan
        }

        jLabel_ICO_Username.setBorder(null);//Remove the border.

    }//GEN-LAST:event_jTextField_User_NameFocusLost

    private void jPasswordField_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordFocusGained

        //That is clear the text felds and show "password".
        String pass = String.valueOf(jPasswordField_Password.getPassword());

        if (pass.trim().toLowerCase().equals("password")) {

            jPasswordField_Password.setText(null);
            jPasswordField_Password.setForeground(Color.BLACK);

        }

        //change icon border
        Border JPanel_title__Border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.YELLOW);//me code eken add karanna puluwan RGB colours vitharai.
        jLabel_ICO_PW1.setBorder(JPanel_title__Border);
        jLabel_Ico_SHOW_Password.setBorder(JPanel_title__Border);

    }//GEN-LAST:event_jPasswordField_PasswordFocusGained

    private void jPasswordField_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordFocusLost

        String pass = String.valueOf(jPasswordField_Password.getPassword());

        if (pass.trim().equals("") || jPasswordField_Password.getText().trim().toLowerCase().equals("password")) {

            jPasswordField_Password.setText("password");
            jPasswordField_Password.setForeground(new Color(153, 153, 153));//me code eken apita kamthi patak add karanna puluwan
        }

        jLabel_ICO_PW1.setBorder(null);//Remove the border

    }//GEN-LAST:event_jPasswordField_PasswordFocusLost

    private void jLabel_Ico_SHOW_PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseEntered

        Border Lable__Border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);
        jLabel_Ico_SHOW_Password.setBorder(Lable__Border);

    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseEntered

    private void jLabel_Ico_SHOW_PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseExited

        Border Lable__Border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.YELLOW);
        jLabel_Ico_SHOW_Password.setBorder(Lable__Border);

    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseExited

    private void jLabel_MiniimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MiniimizeMouseClicked

        this.setState(JFrame_1.ICONIFIED);

    }//GEN-LAST:event_jLabel_MiniimizeMouseClicked

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked

        int a;
        getToolkit().beep();
        a = JOptionPane.showConfirmDialog(null, "Are you sure to extit the program?", "Close the program?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (a == 0) {

            System.exit(0);

        }

    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_Ico_SHOW_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Ico_SHOW_PasswordMouseClicked

        if (jLabel_Show_Password_dont_Delete.getText().equals("")) {

            jPasswordField_Password.setEchoChar((char) 0);
            jLabel_Show_Password_dont_Delete.setText("set");

        } else {

            jPasswordField_Password.setEchoChar('*');
            jLabel_Show_Password_dont_Delete.setText("");

        }

    }//GEN-LAST:event_jLabel_Ico_SHOW_PasswordMouseClicked

    private void jButton_ClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClrActionPerformed

        jPasswordField_Password.setText(null);
        jTextField_User_Name.setText(null);
        jLabel_Val_PWord.setText(null);
        jLabel_Val_UName1.setText(null);
        jTextField_User_Name.grabFocus();

    }//GEN-LAST:event_jButton_ClrActionPerformed

    private void jLabel3_Forgot_PasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Forgot_PasswordMouseEntered

        jLabel3_Forgot_Password.setForeground(Color.blue);

    }//GEN-LAST:event_jLabel3_Forgot_PasswordMouseEntered

    private void jLabel3_Forgot_PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Forgot_PasswordMouseExited

        jLabel3_Forgot_Password.setForeground(Color.black);

    }//GEN-LAST:event_jLabel3_Forgot_PasswordMouseExited

    private void jLabel3_Forgot_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Forgot_PasswordMouseClicked

        JFrame_20 f20 = new JFrame_20();
        f20.setVisible(true);

    }//GEN-LAST:event_jLabel3_Forgot_PasswordMouseClicked

    private void jPasswordField_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordKeyPressed

        jLabel_Val_PWord.setText(null);

        //It use for work the enter button.
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (jTextField_User_Name.getText().trim().isEmpty() && jPasswordField_Password.getText().trim().isEmpty()) {

                jLabel_Val_UName1.setText("Usernme is empty.");
                jLabel_Val_PWord.setText("Password is empty.");
            } else if (jTextField_User_Name.getText().trim().isEmpty()) {
                jLabel_Val_UName1.setText("Usernme is empty.");
            } else if (jPasswordField_Password.getText().trim().isEmpty()) {
                jLabel_Val_PWord.setText("Password is empty.");
            }

            if (jTextField_User_Name.getText().equals("username") && jPasswordField_Password.getText().equals("password")) {

                jLabel_Val_UName1.setText("Usernme is empty.");
                jLabel_Val_PWord.setText("Password is empty.");

            } else if (jTextField_User_Name.getText().equals("username")) {
                jLabel_Val_UName1.setText("Usernme is empty.");
            } else if (jPasswordField_Password.getText().equals("password")) {
                jLabel_Val_PWord.setText("Password is empty.");
            } else {

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/";
                    String db = "hospital_management_system_database";
                    String user = "root";
                    String pword = "123456";

                    Connection con = null;
                    con = DriverManager.getConnection(url + db, user, pword);

                    String query = "SELECT * FROM useres WHERE Usename=? and Password=?";

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, jTextField_User_Name.getText());
                    pst.setString(2, jPasswordField_Password.getText());

                    ResultSet res = pst.executeQuery();

                    if (res.next()) {

                       // JOptionPane.showMessageDialog(null, "Username and Password is matched.", "Login Succsessfully", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        JFrame_2 f2 = new JFrame_2();
                        f2.setVisible(true);

                    } else {

                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Username and Password is does not matched.", "Login Unsuccsessfully", JOptionPane.ERROR_MESSAGE);

                        jTextField_User_Name.setText(null);
                        jPasswordField_Password.setText(null);
                        jLabel_Val_PWord.setText(null);
                        jLabel_Val_UName1.setText(null);
                        jTextField_User_Name.grabFocus();

                        attempt += 1;

                        if (attempt == 4) {

                            getToolkit().beep();
                            JOptionPane.showMessageDialog(null, "You enter wrong username or password four times. There for the system is stoped", "System Error!!!", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);

                        }
                    }

                    con.close();

                } catch (Exception ex) {

                    Logger.getLogger(JFrame_1.class.getName()).log(Level.SEVERE, null, ex);
                    getToolkit().beep();

                    JOptionPane.showMessageDialog(null, ex, "Connection Error", JOptionPane.ERROR_MESSAGE);

                    jTextField_User_Name.setText(null);
                    jPasswordField_Password.setText(null);
                    jLabel_Val_PWord.setText(null);
                    jLabel_Val_UName1.setText(null);
                    jTextField_User_Name.grabFocus();

                }
            }

        }

    }//GEN-LAST:event_jPasswordField_PasswordKeyPressed

    private void jTextField_User_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_User_NameKeyPressed

        jLabel_Val_UName1.setText(null);

        //It use for work the enter button.
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (jTextField_User_Name.getText().trim().isEmpty() && jPasswordField_Password.getText().trim().isEmpty()) {

                jLabel_Val_UName1.setText("Usernme is empty.");
                jLabel_Val_PWord.setText("Password is empty.");
            } else if (jTextField_User_Name.getText().trim().isEmpty()) {
                jLabel_Val_UName1.setText("Usernme is empty.");
            } else if (jPasswordField_Password.getText().trim().isEmpty()) {
                jLabel_Val_PWord.setText("Password is empty.");
            }

            if (jTextField_User_Name.getText().equals("username") && jPasswordField_Password.getText().equals("password")) {

                jLabel_Val_UName1.setText("Usernme is empty.");
                jLabel_Val_PWord.setText("Password is empty.");

            } else if (jTextField_User_Name.getText().equals("username")) {
                jLabel_Val_UName1.setText("Usernme is empty.");
            } else if (jPasswordField_Password.getText().equals("password")) {
                jLabel_Val_PWord.setText("Password is empty.");
            } else {

                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/";
                    String db = "hospital_management_system_database";
                    String user = "root";
                    String pword = "123456";

                    Connection con = null;
                    con = DriverManager.getConnection(url + db, user, pword);

                    String query = "SELECT * FROM useres WHERE Usename=? and Password=?";

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, jTextField_User_Name.getText());
                    pst.setString(2, jPasswordField_Password.getText());

                    ResultSet res = pst.executeQuery();

                    if (res.next()) {

                       // JOptionPane.showMessageDialog(null, "Username and Password is matched.", "Login Succsessfully", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        JFrame_2 f2 = new JFrame_2();
                        f2.setVisible(true);

                    } else {

                        getToolkit().beep();
                        JOptionPane.showMessageDialog(null, "Username and Password is does not matched.", "Login Unsuccsessfully", JOptionPane.ERROR_MESSAGE);

                        jTextField_User_Name.setText(null);
                        jPasswordField_Password.setText(null);
                        jLabel_Val_PWord.setText(null);
                        jLabel_Val_UName1.setText(null);
                        jTextField_User_Name.grabFocus();

                        attempt += 1;

                        if (attempt == 4) {

                            getToolkit().beep();
                            JOptionPane.showMessageDialog(null, "You enter wrong username or password four times. There for the system is stoped", "System Error!!!", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);

                        }
                    }

                    con.close();

                } catch (Exception ex) {

                    Logger.getLogger(JFrame_1.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                    getToolkit().beep();

                    JOptionPane.showMessageDialog(null, ex, "Connection Error", JOptionPane.ERROR_MESSAGE);

                    jTextField_User_Name.setText(null);
                    jPasswordField_Password.setText(null);
                    jLabel_Val_PWord.setText(null);
                    jLabel_Val_UName1.setText(null);
                    jTextField_User_Name.grabFocus();

                }
            }

        }

    }//GEN-LAST:event_jTextField_User_NameKeyPressed

    private void jLabel3_Admin_pannelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Admin_pannelMouseClicked

        JFrame_25 f25 = new JFrame_25();
        f25.setVisible(true);

    }//GEN-LAST:event_jLabel3_Admin_pannelMouseClicked

    private void jLabel3_Admin_pannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Admin_pannelMouseEntered

        jLabel3_Admin_pannel.setForeground(Color.MAGENTA);

    }//GEN-LAST:event_jLabel3_Admin_pannelMouseEntered

    private void jLabel3_Admin_pannelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_Admin_pannelMouseExited

        jLabel3_Admin_pannel.setForeground(Color.black);

    }//GEN-LAST:event_jLabel3_Admin_pannelMouseExited

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
            java.util.logging.Logger.getLogger(JFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_1().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clr;
    private javax.swing.JButton jButton_Cnsl;
    private javax.swing.JButton jButton_Log;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3_Admin_pannel;
    private javax.swing.JLabel jLabel3_Forgot_Password;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_ICO_PW1;
    private javax.swing.JLabel jLabel_ICO_Username;
    private javax.swing.JLabel jLabel_Ico_SHOW_Password;
    private javax.swing.JLabel jLabel_Miniimize;
    private javax.swing.JLabel jLabel_Show_Password_dont_Delete;
    private javax.swing.JLabel jLabel_Val_PWord;
    private javax.swing.JLabel jLabel_Val_UName1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_User_Name;
    // End of variables declaration//GEN-END:variables
}
