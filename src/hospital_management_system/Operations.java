/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinuwan Theekshana
 */
public class Operations {

    //list data code.
    public static void listPersondata(JTable JTable1, JFrame Jframe_26) {

        try {

            String url = "jdbc:mysql://localhost:3306/";
            String db = "hospital_management_system_database";
            String user = "root";
            String pword = "123456";

            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url + db, user, pword);

            String query = "SELECT * FROM useres;";

            PreparedStatement pst = con.prepareStatement(query);
            ResultSet res = pst.executeQuery();

            //Getting Tabel Model
            DefaultTableModel tableModel = (DefaultTableModel) JTable1.getModel();
            tableModel.setRowCount(0);

            // if (res.isBeforeFirst()) {
            while (res.next()) {
                Object personObject[] = { //object array
                    res.getString("NIC_No"),
                    res.getString("Usename"),
                    res.getString("Password"),
                    res.getString("Re_Enter_Password"),
                    res.getString("phone_number"),
                    res.getString("Full_name"),
                    res.getDate("Date_Of_Birth"),
                    res.getString("Gender"),
                    res.getString("image_path")
                };
                tableModel.addRow(personObject);

            }
            //  }

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Connection Error", JOptionPane.ERROR_MESSAGE);

        }

    }
//Code For Search Data

    public static void searchPersonData(String searchQuery, JLabel JLabel_Status_text, JTable table, JFrame frame) {

        try {

            String url = "jdbc:mysql://localhost:3306/";
            String db = "hospital_management_system_database";
            String user = "root";
            String pword = "123456";

            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url + db, user, pword);

            String query = searchQuery;
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet res = pst.executeQuery();

            //Get table model
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            if (res.isBeforeFirst()) {

                while (res.next()) {
                    Object personObject[] = { //object array
                        res.getString("NIC_No"),
                        res.getString("Usename"),
                        res.getString("Password"),
                        res.getString("Re_Enter_Password"),
                        res.getString("phone_number"),
                        res.getString("Full_name"),
                        res.getDate("Date_Of_Birth"),
                        res.getString("Gender"),
                        res.getString("image_path")
                    };
                    tableModel.addRow(personObject);
                    JLabel_Status_text.setText("Record Found.");
             
                }
            } else {

                JLabel_Status_text.setText("No Record Found.");

            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex, "Connection Error", JOptionPane.ERROR_MESSAGE);

        }
    }

}
