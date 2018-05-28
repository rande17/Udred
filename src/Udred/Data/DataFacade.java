/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Data;

import Udred.Acq.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Udred.Acq.IDataFacade;
import java.nio.file.Paths;

/**
 *
 * @author Linea Hoffmann
 */
public class DataFacade implements IDataFacade {

//    INFO ABOUT THE DATABASE DOESN'T MAKE MUCH SENSE HERE   
//    private String dataHost;
//    private String databaseName;
//    private String userName;
//    private String password;
    private PostgresHelper DB;
    private SYSLog sYSLog;

//    INFO ABOUT THE DATABASE DOESN'T MAKE MUCH SENSE HERE
//    protected DataFacade(String dataHost, String databaseName, String userName, String password) {
//        this.dataHost = dataHost;
//        this.databaseName = databaseName;
//        this.userName = userName;
//        this.password = password;
//    }
    public DataFacade() {
        DB = new PostgresHelper();
        sYSLog = new SYSLog(Paths.get("").toAbsolutePath().toString() + "\\SYSLOG.txt");
    }

    protected void specific() {

    }

    @Override
    public void saveCase(ICase thisCase) {
        //just setting up a few needed variables
        ArrayList al = new ArrayList();
        String typeString;

        //just filling an arrayList with data used for query
        al.add(thisCase.getCaseType().toString());
        al.add("" + thisCase.getCaseID());
        al.add("" + thisCase.getCaseID());
        al.add(thisCase.getStatus());
        al.add("" + thisCase.getPatient().getPatientID().toString());
        al.add(thisCase.getCaseWorker().toString());
        al.add(thisCase.getCaseInformation().toString());

        //set expected data types for the different variables in the arrayList, s for String, i for int, I for long(64bit int)
        typeString = "sssssss";

        //make the call to the database and execute the query,
        //as we don't expect a result from an INSERT query,
        //we don't assing the returned ResultSet to anything as it would never be used
        //having SQL written here could be considered bad practice,
        //should be discussed how we should handle this, 
        //i.e making classes to save each type in the data package
        //or making a collected class in the data package the serves as a standard class that have all queires
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
                    Logger.getLogger(DataFacade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        //debug thing ends here
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
    @Override
     public ArrayList getUserCaseList() throws SQLException
    {
        ArrayList<String> ar = new ArrayList<>();
        ResultSet result = DB.query("SELECT * FROM Cases", new ArrayList(), "");
        while(result.next()) 
        {  
            ar.add(result.getString("caseid"));
        }
        return ar;
    }
     
    @Override
     public void savePatient(IPatient patient){
            ArrayList al = new ArrayList();
            String typeString;
            
            al.add(""+patient.getPatientID().toString());
            al.add(""+patient.getPatientName());
            al.add(""+patient.getPatientCPR());
            al.add(""+patient.getPatientAddress().toString());
            al.add(patient.getPatientTelephone());
            al.add(""); 
            
            for(int i = 0; i < al.size(); i++){
                System.out.println(al.get(i));
            }
            
            typeString = "ssssis";
            System.out.println(patient.toString());
            DB.query("INSERT INTO Patient (patientUUID, patientName, patientCPR, patientAddress, patientTelephone, patientGuardian) VALUES (?,?,?,?,?,?)", al, typeString);

     }

    @Override
    public ResultSet getCase(int caseID)
    {
        ResultSet result = DB.query("SELECT * FROM Cases WHERE caseid='" + caseID + "'", new ArrayList(), "");
        return result;
    }

    @Override
    public ArrayList<String> getSYSLogText() {
        return sYSLog.readFromFile();
    }
    
    public void writeLoginInfoToSyslog (ArrayList<String> loginInfo){
       
        sYSLog.writeText(loginInfo);
    }
    
    public void writeOpenCaseInfoToSyslog (ArrayList<String> openCaseInfo){
           
        sYSLog.writeText(openCaseInfo);
    }
}
