
package Udred.Business;

import Acq.IBusinessFacade;
import Udred.Data.DatabaseFacade;
import Acq.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JogGez
 */
public class BusinessFacade implements IBusinessFacade 
{
    
    private static BusinessFacade instance;
    private IDatabaseFacade dataFacade;
    private IUser activeUser;
    
    public BusinessFacade(){}
    
    public static BusinessFacade getInstance(){
        if(instance == null){
            instance = new BusinessFacade();
        }
        return instance;
    }
    
    @Override
    public ArrayList getUserCaseList(String UserID) throws SQLException{
        ArrayList al = dataFacade.getUserCaseList("");
        return al;
    }
    
    @Override
    public Case getCase(String caseNumber) throws SQLException{
        DatabaseFacade db = new DatabaseFacade();
        Case case1 = db.getCase(caseNumber);
        return case1;

    }
    
    @Override
    public void injectDataFacade(IDatabaseFacade db){
        this.dataFacade = db;
    }
    
    @Override
    public void setActiveUser(IUser user){
        this.activeUser = user;
    }
    @Override
    public IUser getActiveUser(){
        return this.activeUser;
    }
    
    
}
