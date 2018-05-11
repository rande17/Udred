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
import org.postgresql.util.PSQLException;

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
        connect();
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
        ResultSet rs = execQuery("SELECT NOW()");
        rs.next();
        String timeforoutputonrun = rs.getString(1);
        System.out.println(timeforoutputonrun);
    }
}
