/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Acq.*;
import Udred.Business.Case;
import Udred.Business.User;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author niemeijeren
 */
public interface IBusinessFacade {

    ICase getCase(String caseNumber) throws SQLException;

    ArrayList getUserCaseList(String UserID) throws SQLException;
    
    ObservableList<IUser> getAllUsers() throws SQLException;
    
    void addUser();
    
    void removeUser(IUser user);

    void injectDataFacade(IDataFacade db);
    
    IUser getActiveUser();
    
    void setActiveUser(IUser user);
    
    ICase getActiveCase();
    void setActiveCase(String caseID) throws SQLException;
        
}
