/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Udred.Data.PostgresHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linea Hoffmann
 */
public class DatabaseFacade {

//    INFO ABOUT THE DATABASE DOESN'T MAKE MUCH SENSE HERE    
//    private String dataHost;
//    private String databaseName;
//    private String userName;
//    private String password;
    private PostgresHelper DB;

//    INFO ABOUT THE DATABASE DOESN'T MAKE MUCH SENSE HERE
//    protected DatabaseFacade(String dataHost, String databaseName, String userName, String password) {
//        this.dataHost = dataHost;
//        this.databaseName = databaseName;
//        this.userName = userName;
//        this.password = password;
//    }
    public DatabaseFacade() {
        DB = new PostgresHelper();
    }

    protected void specific() {

    }

    public void saveCase(Case thisCase) {
        //just setting up a few needed variables
        ArrayList al = new ArrayList();
        String typeString;

        //just filling an arrayList with data used for query
        al.add(thisCase.getCaseType().toString());
        al.add("" + thisCase.getCaseID());
        al.add("" + thisCase.getCaseID());
        al.add("" + thisCase.getStatus());
        al.add(thisCase.getPatient().toString());
        al.add(thisCase.getCaseWorker().toString());
        al.add(thisCase.getCaseInformation().toString());

        //set expected data types for the different variables in the arrayList, s for String, i for int, I for long(64bit int)
        typeString = "sssssss";

        //make the call to the database and execute the query,
        //as we don't expect a result from an INSERT query,
        //we don't assing the returned ResultSet to anything as it would never be used
        DB.query("INSERT INTO Cases (caseType, UUID, caseID, status, patient, caseWorker, caseInformation) VALUES (?,?,?,?,?,?,?)", al, typeString);

        //this part is a debug thing, that just lists all cases that are in the database,
        //so we can verify that data is actually written to the database,
        //should be removed when we have figured out a proper way of getting the cases to the GUI
        ResultSet rs = DB.query("SELECT * FROM Cases", new ArrayList(), "");
        try {
            while (rs.next()) {
                try {
                    System.out.print(rs.getString(1) + " | ");
                    System.out.print(rs.getString(2) + " | ");
                    System.out.print(rs.getString(3) + " | ");
                    System.out.print(rs.getString(4) + " | ");
                    System.out.print(rs.getString(5) + " | ");
                    System.out.print(rs.getString(6) + " | ");
                    System.out.print(rs.getString(7) + " | ");
                    System.out.print(rs.getString(8) + " | ");
                    System.out.println(rs.getString(9) + "");
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseFacade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        //debug thing ends here
    }

//
//    protected List findCasesCPR(String CPRNumber)
//    {
//        return;
//    }
//
//    protected List findCasesName(String Name)
//    {
//        return ;
//
//    }
}
