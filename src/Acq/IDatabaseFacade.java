/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Acq.ICase;
import Acq.IDatabaseFacade;
import Udred.Business.Case;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author niemeijeren
 */
public interface IDatabaseFacade {

    ResultSet getCase(String caseNumber) throws SQLException;

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
    ArrayList getUserCaseList(String UserID) throws SQLException;

    void saveCase(ICase thisCase);
    
}
