/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Acq.*;
import Udred.Business.Case;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author niemeijeren
 */
public interface IBusinessFacade {

    ICase getCase(String caseNumber) throws SQLException;

    ArrayList getUserCaseList(String UserID) throws SQLException;

    void injectDataFacade(IDatabaseFacade db);
    
    IUser getActiveUser();
    
    void setActiveUser(IUser user);
        
}
