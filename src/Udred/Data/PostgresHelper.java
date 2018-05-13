/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author rickie
 */
public class PostgresHelper {

    private static Connection conn;
    private String host;
    private String dbName;
    private String user;
    private String pass;

    //we don't like this constructor
    public PostgresHelper() throws SQLException, ClassNotFoundException {
        this.host = DbContract.HOST;
        this.dbName = DbContract.DB_NAME;
        this.user = DbContract.USERNAME;
        this.pass = DbContract.PASSWORD;
    }

    public PostgresHelper(String host, String dbName, String user, String pass) {
        this.host = host;
        this.dbName = dbName;
        this.user = user;
        this.pass = pass;
    }

    public boolean connect() throws SQLException, ClassNotFoundException {
        if (host.isEmpty() || dbName.isEmpty() || user.isEmpty() || pass.isEmpty()) {
            throw new SQLException("Database credentials missing");
        }

        Class.forName("org.postgresql.Driver");
        this.conn = DriverManager.getConnection(
                this.host + this.dbName,
                this.user, this.pass);
        return true;
    }

    public ResultSet execQuery(String query) throws SQLException {
        return this.conn.createStatement().executeQuery(query);
    }

    public void test() throws SQLException {
        ResultSet rs = query("SELECT NOW()", new ArrayList(), "");
        rs.next();
        String timeforoutputonrun = rs.getString(1);
        System.out.println(timeforoutputonrun);
    }

    // lave prepared statements
    // retunere resultsæt
    public ResultSet query(String sql, ArrayList al, String var) {
        if (conn != null) {
            try {
                if (!conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PostgresHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            connect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PostgresHelper.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("var: " + var.length());
        System.out.println("al: " + al.size());
        if (var.length() == al.size()) {
            try {
                PreparedStatement st = conn.prepareStatement(sql);// bruger conncetion til DB og siger har en query. 
                for (int i = 0; i < al.size(); i++) // 
                {
//                    System.out.println(al.get(i).toString());
//                    System.out.println(var.charAt(i));
//                    System.out.println(i);
                    switch (var.charAt(i)) {
                        case 'i':
                            st.setInt(i+1, (int) al.get(i)); // int
                           break;
                        case 's':
                            st.setString(i+1,(String) al.get(i)); // string
                           break;
                        case 'I':
                            st.setLong(i+1, (long) al.get(i)); //Big Int -  long Java
                            break;
                    }
                }
                return st.executeQuery();

            } catch (Exception e) {
                e.getMessage();
            }

        } else {
            System.out.println("Query not executed, mismatch between arraylList length and vars given");
        }
        return null;

    }
}
