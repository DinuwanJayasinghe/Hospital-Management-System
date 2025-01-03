/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import static hospital_management_system.JFrame_11.jLabel_Date;
import static hospital_management_system.JFrame_11.jLabel_Time;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dinuwan Theekshana
 */
public class JFrame_12 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_12
     */
    public JFrame_12() {
        initComponents();
        showTableData();
        showDate();
        showTime();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }
    
    //Date and Time

    void showDate() {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd - MM - YYYY");
        jLabel_Date.setText(s.format(d));
    }

    void showTime() {

        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh - mm - ss a");
            jLabel_Time.setText(s.format(d));
        }).start();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel_Time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Date = new javax.swing.JLabel();
        jTextField_Nurse_ID = new javax.swing.JTextField();
        jTextField_Nurce_Name = new javax.swing.JTextField();
        jTextField_Level = new javax.swing.JTextField();
        jTextField_Section = new javax.swing.JTextField();
        jButton_Back = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Searchj = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Phone_Number = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_New2 = new javax.swing.JMenuItem();
        jMenuItem_Open_Cal1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Close2 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1_logout1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add nurce Details");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Hospital_Management_System/Nurse-1-icon.png"))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nurce Details");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 920, 50);

        jLabel_Time.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Time.setText("Time :-");
        jPanel1.add(jLabel_Time);
        jLabel_Time.setBounds(40, 90, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nurce_ID :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 160, 110, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nurce Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 230, 130, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Level :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 290, 70, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Section or Word :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 350, 170, 22);

        jLabel_Date.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Date.setText("Date :");
        jPanel1.add(jLabel_Date);
        jLabel_Date.setBounds(680, 100, 220, 30);

        jTextField_Nurse_ID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField_Nurse_ID);
        jTextField_Nurse_ID.setBounds(240, 160, 190, 30);

        jTextField_Nurce_Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField_Nurce_Name);
        jTextField_Nurce_Name.setBounds(240, 230, 190, 30);

        jTextField_Level.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField_Level);
        jTextField_Level.setBounds(240, 290, 190, 30);

        jTextField_Section.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField_Section);
        jTextField_Section.setBounds(240, 350, 190, 30);

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
        jButton_Back.setBounds(40, 470, 120, 40);

        jButton_Add.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add.setText("Add");
        jButton_Add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Add);
        jButton_Add.setBounds(190, 470, 120, 40);

        jButton_Delete.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete.setText("Delete");
        jButton_Delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Delete);
        jButton_Delete.setBounds(340, 470, 120, 40);

        jButton_Searchj.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Searchj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Searchj.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Searchj.setText("Search");
        jButton_Searchj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Searchj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Searchj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchjActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Searchj);
        jButton_Searchj.setBounds(770, 470, 120, 40);

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
        jButton_Clear.setBounds(630, 470, 120, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Phone Number :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 410, 160, 22);

        jTextField_Phone_Number.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField_Phone_Number);
        jTextField_Phone_Number.setBounds(240, 410, 190, 30);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 160, 430, 280);

        jButton_Update.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Update.setText("Update");
        jButton_Update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Update);
        jButton_Update.setBounds(480, 470, 120, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\My Java Projects\\Hospital_Management_System\\Images\\Medical Drip On The Background Of Hospital Corridor Stock Photo ....jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 910, 510);

        jMenu3.setText("File");

        jMenuItem_New2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_New2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/New-file-icon.png"))); // NOI18N
        jMenuItem_New2.setText("New");
        jMenuItem_New2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_New2jMenuItem_NewActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_New2);

        jMenuItem_Open_Cal1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_Open_Cal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/Scientific-calculator-icon.png"))); // NOI18N
        jMenuItem_Open_Cal1.setText("Open Calculator");
        jMenuItem_Open_Cal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Open_Cal1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Open_Cal1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/Home-icon.png"))); // NOI18N
        jMenuItem2.setText("Go Back to Home Page");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);
        jMenu3.add(jSeparator3);

        jMenuItem_Close2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem_Close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/Exit-icon.png"))); // NOI18N
        jMenuItem_Close2.setText("Close");
        jMenuItem_Close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Close2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Close2);
        jMenu3.add(jSeparator4);

        jMenuItem1_logout1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1_logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management_system/Logout-icon.png"))); // NOI18N
        jMenuItem1_logout1.setText("Logout");
        jMenuItem1_logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_logout1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1_logout1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed

        JFrame_5 f5 = new JFrame_5();
        f5.setVisible(true);
        this.hide();

    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed

        if (jTextField_Level.getText().trim().isEmpty() && jTextField_Nurce_Name.getText().trim().isEmpty() && jTextField_Nurse_ID.getText().trim().isEmpty() && jTextField_Phone_Number.getText().trim().isEmpty() && jTextField_Section.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before add data into the database.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Level.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before add data into the database.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Nurce_Name.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before add data into the database.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Nurse_ID.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before add data into the database.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Phone_Number.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before add data into the database.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Section.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before add data into the database.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "hospital_management_system_database";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                String query = "INSERT INTO nurce_details(Nurce_ID, Nurce_Name, Level, Section_or_Word, Phone_Number)VALUES(?,?,?,?,?)";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, jTextField_Nurse_ID.getText());//query eke adala feild eka yedi athi place eke number eka merhanadi parameeeter eka lesa yediya yuthuya.
                pst.setString(2, jTextField_Nurce_Name.getText());
                pst.setString(3, jTextField_Level.getText());
                pst.setString(4, jTextField_Section.getText());
                pst.setString(5, jTextField_Phone_Number.getText());
                pst.executeUpdate();

                System.out.println(pst);
                System.out.println("1 row affected");

                JOptionPane.showMessageDialog(null, "Data Inserted Succsessfully!!!");

                con.close();

            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                Logger.getLogger(JFrame_12.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);

            }

            jTextField_Level.setText(null);
            jTextField_Nurce_Name.setText(null);
            jTextField_Nurse_ID.setText(null);
            jTextField_Section.setText(null);
            jTextField_Phone_Number.setText(null);
            jTextField_Nurse_ID.grabFocus();

        }

        showTableData();
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null, "Are You sure to you went to clear the data?", "Clear Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {

            jTextField_Level.setText(null);
            jTextField_Nurce_Name.setText(null);
            jTextField_Nurse_ID.setText(null);
            jTextField_Section.setText(null);
            jTextField_Phone_Number.setText(null);
            jTextField_Nurse_ID.grabFocus();
        }

    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed

        if (jTextField_Nurse_ID.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter the Nurce ID Nunber before delete data into the database.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "hospital_management_system_database";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                int a;
                a = JOptionPane.showConfirmDialog(null, "Are you sure to you went delete that record in databasse", "Delete Record", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (a == 0) {

                    String query = "DELETE FROM nurce_details WHERE Nurce_ID=?";

                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, jTextField_Nurse_ID.getText());
                    pst.executeUpdate();

                    jTextField_Level.setText(null);
                    jTextField_Nurce_Name.setText(null);
                    jTextField_Nurse_ID.setText(null);
                    jTextField_Section.setText(null);
                    jTextField_Phone_Number.setText(null);
                    jTextField_Nurse_ID.grabFocus();

                    System.out.println(pst);
                    System.out.println("1 row affected");

                    JOptionPane.showMessageDialog(null, "Record Deleted Succsessftlly...");

                }
                con.close();

            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                Logger.getLogger(JFrame_12.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);

                jTextField_Nurse_ID.setText(null);
                jTextField_Nurse_ID.grabFocus();
            }

        }
        showTableData();
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_SearchjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchjActionPerformed

        if (jTextField_Nurse_ID.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter the Nurce ID Number before Search data.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else {

            try {
                String url = "jdbc:mysql://localhost:3306/"; //url
                String db = "hospital_management_system_database"; //Database Name
                String user = "root";//user name
                String pword = "123456"; //password

                System.out.println(jTextField_Nurse_ID.getText());//search kirimata yoda gannna textbox eke variabale name eka.
                Connection con = null;
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); //driver
                con = DriverManager.getConnection(url + db, user, pword);

                //SQL Query
                String sql = "SELECT * FROM nurce_details WHERE Nurce_ID = '" + jTextField_Nurse_ID.getText() + "'";

                ResultSet res = con.createStatement().executeQuery(sql);
                System.out.println(sql);

                while (res.next()) {

                    /* System.out.println(res.getString("Patient_Name"));
                System.out.println(res.getString("Doctor_Name"));*/
                    jTextField_Nurce_Name.setText(res.getString("Nurce_Name"));
                    jTextField_Level.setText(res.getString("Level"));
                    jTextField_Section.setText(res.getString("Section_or_Word"));
                    jTextField_Phone_Number.setText(res.getString("Phone_Number"));//Text feild wala names ewa form eke athi piliwelata yodanna.

                    System.out.println(res.getString("Nurce_Name") + " " + res.getString("Section_or_Word"));
                    System.out.println("Row Affected");
                    //Vadagthma field deke names yodanna.

                }

                con.close();//Connection eka close kirima.

            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {

                Logger.getLogger(JFrame_12.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);

                jTextField_Level.setText(null);
                jTextField_Nurce_Name.setText(null);
                jTextField_Nurse_ID.setText(null);
                jTextField_Section.setText(null);
                jTextField_Phone_Number.setText(null);
                jTextField_Nurse_ID.grabFocus();

            }

        }
        showTableData();
    }//GEN-LAST:event_jButton_SearchjActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed

        if (jTextField_Level.getText().trim().isEmpty() && jTextField_Nurce_Name.getText().trim().isEmpty() && jTextField_Nurse_ID.getText().trim().isEmpty() && jTextField_Phone_Number.getText().trim().isEmpty() && jTextField_Section.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before the updating.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Level.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before the updating.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Nurce_Name.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before the updating.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Nurse_ID.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before the updating.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Phone_Number.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before the updating.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else if (jTextField_Section.getText().trim().isEmpty()) {

            getToolkit().beep();

            JOptionPane.showMessageDialog(null, "You should enter data to all feilds before the updating.", "Warnimg!!!", JOptionPane.WARNING_MESSAGE);

        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "hospital_management_system_database";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                String query = "UPDATE nurce_details SET Nurce_Name=? ,Level=? ,Section_or_Word=? ,Phone_Number=? WHERE Nurce_ID=?";//query wka ewnass wenawa ekinekata

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(5, jTextField_Nurse_ID.getText());//query eke adala feild eka yedi athi place eke number eka merhanadi parameeeter eka lesa yediya yuthuya.
                pst.setString(1, jTextField_Nurce_Name.getText());
                pst.setString(2, jTextField_Level.getText());
                pst.setString(3, jTextField_Section.getText());
                pst.setString(4, jTextField_Phone_Number.getText());
                pst.executeUpdate();
                System.out.println(query);

                System.out.println("1 row affected");

                JOptionPane.showMessageDialog(null, "Data Updated Succsessfully!!!");

                con.close();

            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                Logger.getLogger(JFrame_12.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);

            }

            jTextField_Level.setText(null);
            jTextField_Nurce_Name.setText(null);
            jTextField_Nurse_ID.setText(null);
            jTextField_Section.setText(null);
            jTextField_Phone_Number.setText(null);
            jTextField_Nurse_ID.grabFocus();

        }
        showTableData();
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //TABALES SHOULD BE ENABLED FIRST

        int rows = jTable1.getRowCount();

        if (rows != 0) {

            int row_selected = jTable1.getSelectedRow();

            String nid = jTable1.getValueAt(row_selected, 0).toString();
            String N_name = jTable1.getValueAt(row_selected, 1).toString();
            String level = jTable1.getValueAt(row_selected, 2).toString();
            String section = jTable1.getValueAt(row_selected, 3).toString();
            String p_no = jTable1.getValueAt(row_selected, 4).toString();

            jTextField_Nurse_ID.setText(nid);
            jTextField_Nurce_Name.setText(N_name);
            jTextField_Level.setText(level);
            jTextField_Section.setText(section);
            jTextField_Phone_Number.setText(p_no);

        } else {

            JOptionPane.showMessageDialog(null, rows);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem_New2jMenuItem_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_New2jMenuItem_NewActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null, "Are you sure to you save that data?", "Go to new form", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (a == 0) {

    
            jTextField_Level.setText(null);
            jTextField_Nurce_Name.setText(null);
            jTextField_Nurse_ID.setText(null);
            jTextField_Section.setText(null);
            jTextField_Phone_Number.setText(null);
            jTextField_Nurse_ID.grabFocus();
        }
    }//GEN-LAST:event_jMenuItem_New2jMenuItem_NewActionPerformed

    private void jMenuItem_Open_Cal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Open_Cal1ActionPerformed

        JFrame_18 f18 = new JFrame_18();
        f18.setVisible(true);
    }//GEN-LAST:event_jMenuItem_Open_Cal1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        JFrame_5 f5 = new JFrame_5();
        f5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem_Close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Close2ActionPerformed

        int b;
        b = JOptionPane.showConfirmDialog(null, "Are you sure to close the program now?", "Close the program...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (b == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem_Close2ActionPerformed

    private void jMenuItem1_logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_logout1ActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null, "Are you sure to you want to logout the program.", "Logout the system.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (a == 0) {

            this.dispose();
            JFrame_10 f10 = new JFrame_10();
            f10.setVisible(true);

        }
    }//GEN-LAST:event_jMenuItem1_logout1ActionPerformed

    public void showTableData() {

        try {

            String url = "jdbc:mysql://localhost:3306/";
            String db = "hospital_management_system_database";
            String user = "root";
            String pword = "123456";

            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url + db, user, pword);

            String query = "SELECT * FROM nurce_details;";

            PreparedStatement pst = con.prepareStatement(query);
            ResultSet res = con.createStatement().executeQuery(query);

            pst = con.prepareStatement(query);
            res = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(res));

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {

            Logger.getLogger(JFrame_12.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Searchj;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_logout1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem_Close2;
    private javax.swing.JMenuItem jMenuItem_New2;
    private javax.swing.JMenuItem jMenuItem_Open_Cal1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Level;
    private javax.swing.JTextField jTextField_Nurce_Name;
    private javax.swing.JTextField jTextField_Nurse_ID;
    private javax.swing.JTextField jTextField_Phone_Number;
    private javax.swing.JTextField jTextField_Section;
    // End of variables declaration//GEN-END:variables
}
