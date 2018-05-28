/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Acq;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author niemeijeren
 */
public interface IDataFacade {
    
    

    ResultSet getCase(int caseID) throws SQLException;;

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
    ArrayList getUserCaseList() throws SQLException;
    
    ArrayList <String> getSYSLogText();

    void saveCase(ICase thisCase);
    
    void writeLoginInfoToSyslog (ArrayList<String> loginInfo);
    void writeOpenCaseInfoToSyslog (ArrayList<String> openCaseInfo);
    public void savePatient(IPatient patient);
    
}
