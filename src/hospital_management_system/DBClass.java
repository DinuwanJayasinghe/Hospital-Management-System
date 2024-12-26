/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital_management_system;

/**
 *
 * @author Chamidu
 */
import java.sql.*;
import javax.swing.JOptionPane;


public class DBClass {
    
    
    
private final String fileLocation ="lib/JRL/Pencil.ft";
    boolean actCon;
  
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement stmt = null;  
    
    //FileHandle fH=new FileHandle(fileLocation);
    
    String url = "jdbc:mysql://localhost:3306/";
    String db = "hospital_management_system_database";
    String driver = "com.mysql.jdbc.Driver";
    String conect;
    String user="root";
    String pword="123456";
  
        
    public Connection dbConnects() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        
          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            con = DriverManager.getConnection(url+db,user,pword);
          // System.out.println( "ddddd");
            return con;
    }


           

public void setAutocommit(boolean b) throws SQLException{
    con.setAutoCommit(b);
}
public void commit() 
{
        try {
            con.commit();
           System.out.println("commited");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
}
public void rollback() {
        try {
            con.rollback();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
}
    public void closeDB() throws SQLException {
        if (con != null) {
            con.close();
            con=null;
        }
    }
    
     public String insertData(String table_name, String arrProperty[], String arrVal[]) throws Exception {
        if (arrVal.length != arrProperty.length) {
            throw new Exception("field count not equal value count");

        }
        String flist = "";
        String vlist = "";
        int i =  0;
        while (i < arrProperty.length) {

            flist += arrProperty[i];

            vlist += "'" + arrVal[i] + "'";

            if (i != arrProperty.length - 1) {
                flist += ",";
                vlist += ",";
            }

            i = i + 1;
        }
        String sql = "INSERT INTO " + table_name + " (" + flist + ") VALUES (" + vlist + ")";
        System.out.println(sql);
      
        Statement st = con.createStatement();
        int val = st.executeUpdate(sql);
        System.out.println(val + " row affected");
       
        return val + " row affected";
        
    }

    public ResultSet selectManual(String sql) throws SQLException {
       
        System.out.println(sql);
        
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(sql);

        
        return res;
    }

    public String executeManual(String sql) throws SQLException, Exception {
       
        System.out.println(sql);

        Statement st = con.createStatement();
        int val = st.executeUpdate(sql);
        System.out.println(val + " row affected");
      
        return val + " row affected";

    }

    public String dropData(String tName, String field, String value, String and) throws SQLException {
        String sql = null;

        sql = "DELETE FROM " + tName + " where " + field + "='" + value + "' ";

        if (!and.isEmpty()) {
            sql += and;
        }
        System.out.println(sql);
       
        Statement stmt = con.createStatement();
        int row = stmt.executeUpdate(sql);
        System.out.println(row + " row affected");
        
        return row + " rows affected";

    }

    public String updatePass(String tName, String skey, String value, String pField, String pVal) throws SQLException, Exception {

        String flist = pField;
        String vlist = "('" + pVal + "')";

        String sql = "UPDATE " + tName + " SET " + flist + "=" + vlist + " WHERE " + skey + "=\'" + value + "\'"; 
        System.out.println(sql);
       
        Statement st = con.createStatement();
        int val = st.executeUpdate(sql);
        System.out.println(val + " row affected");
        
        return val + " row affected";
     }

    public String truncate(String tName) throws SQLException, Exception {

        String sql = "truncate " + tName;
        System.out.println(sql);
       
        Statement st = con.createStatement();
        int val = st.executeUpdate(sql);
        System.out.println(val + " row affected");
       
        return val + " row affected";

    }

    public String updateData(String table_name, String skey, String value, String arrField[], String arrVal[], String and) throws SQLException, Exception {

        String flist = "";
        String vlist = "";
        int i = 0;
        while (i < arrField.length) {

            vlist = "'" + arrVal[i] + "'";
            flist += arrField[i] + "=" + vlist;
            if (i != arrField.length - 1) {
                flist += ",";
            }

            i = i + 1;
        }
        String sql = "UPDATE " + table_name + " SET " + flist + " WHERE " + skey + "=\'" + value + "\'";
        if (and != null) {
            sql += and;
        }
        System.out.println(sql);
       
        Statement st = con.createStatement();
        int val = st.executeUpdate(sql);
        System.out.println(val + " row affected");
        
        return val + " row affected";
    }


    public ResultSet viewAll(String tName) throws SQLException, Exception {
      
        String sql = "SELECT * FROM " + tName;
        
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(sql);
        
        System.out.println(sql);
        
        return res ;
    }

    
    public ResultSet viewSelected(String tableName, String field, String value) throws SQLException {
      
        String sql = "SELECT * FROM " + tableName + " WHERE " + field + " = '" + value + "'";
       
       // Statement stmt = con.createStatement();
       // ResultSet res = stmt.executeQuery(sql);
       ResultSet res = con.createStatement().executeQuery(sql);
        System.out.println(sql);
             while(res.next()){
                System.out.println(res.getString("Patient_Name"));
               System.out.println(res.getString("Doctor_Name"));
             }
        return res;

    }

    public ResultSet viewLike(String tableName, String field, String value) throws SQLException {
        
        String sql = "SELECT * FROM " + tableName + " WHERE " + field + " like \'" + value + "'";
        
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println(sql);
        
        return rs;

    }

    public ResultSet select(String table, String key, String value, String and) throws SQLException {
        String sql = "";
        if (key.isEmpty()) {
            sql = "SELECT * FROM " + table;
        } else {
            sql = "SELECT * FROM " + table + " WHERE " + key + "='" + value + "'";
        }
        if (!and.isEmpty()) {
            sql += and;
        }
        
        System.out.println(sql);
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(sql);
        System.out.println(sql);
        
        return res;


    }

    public ResultSet selectOrderby(String table, String key, String value, String and, String orderCol, String order) throws SQLException {
        String sql = "";
        if (key.isEmpty()) {
            sql = "SELECT * FROM " + table;
        } else {
            sql = "SELECT * FROM " + table + " WHERE " + key + "='" + value + "' ";
        }
        if (!and.isEmpty()) {
            sql += and;
        }
        if (order.equals("desc")) {
            sql += " order by " + orderCol + " desc";
        } else {
            sql += " order by " + orderCol;
        }
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(sql);
        System.out.println(sql);

        return res;

    }

    public ResultSet selectedField(String table, String[] arrProperty, String key, String value, String and) throws SQLException {

        String sql = "";
        String flist = "";
        int i = 0;
        while (i < arrProperty.length) {

            flist += arrProperty[i];

            if (i != arrProperty.length - 1) {
                flist += ",";

            }

            i = i + 1;
        }
        if (key.isEmpty()) {
            sql = "SELECT " + flist + " FROM " + table;
        } else {
            sql = "SELECT " + flist + " FROM " + table + " WHERE " + key + "='" + value + "'";
        }
        if (!and.isEmpty()) {
            sql += and;
        }

        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(sql);
        System.out.println(sql);
       
        return res;

    }

    public ResultSet selectDistinct(String table, String[] arrProperty, String key, String value, String and) throws SQLException {
        String sql = "";
        String flist = "";
        int i = 0;
        while (i < arrProperty.length) {

            flist += arrProperty[i];

            if (i != arrProperty.length - 1) {
                flist += ",";

            }

            i = i + 1;
        }
        if (key.isEmpty()) {
            sql = "SELECT distinct " + flist + " FROM " + table;
        } else {
            sql = "SELECT distinct " + flist + " FROM " + table + " WHERE " + key + "='" + value + "'";
        }
        if (!and.isEmpty()) {
            sql += and;
        }
        System.out.println(sql);

        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(sql);
        System.out.println(sql);
       
        return res;
        
    }

    public ResultSet jointable(String tName1, String tname2, String[] arrField, String onkey1, String onval1, String onkey2, String onval2, String wkey, String wval, String andw) throws SQLException {

        String flist = "";
        int i = 0;
        while (i < arrField.length) {
            flist += arrField[i];
            if (i != arrField.length - 1) {
                flist += ",";
            }

            i = i + 1;
        }
        String query = "";
        if (onkey2.isEmpty()) {
            query = "SELECT " + flist + " FROM " + tName1 + " join " + tname2 + " on " + tName1 + "." + onkey1 + " = " + tname2 + "." + onval1 + " where " + wkey + "='" + wval + "' ";
        } else {
            query = "SELECT " + flist + " FROM " + tName1 + " join " + tname2 + " on " + tName1 + "." + onkey1 + " = " + tname2 + "." + onval1 + " and " + tName1 + "." + onkey2 + " = " + tname2 + "." + onval2 + " where " + wkey + "='" + wval + "' ";
        }

        if (!andw.isEmpty()) {
            query += andw;
        }
        System.out.println(query);
        
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(query);
       
        return res;
     
    }
 
}