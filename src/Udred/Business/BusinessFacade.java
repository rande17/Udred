
package Udred.Business;

import Acq.IBusinessFacade;
import Udred.Data.DatabaseFacade;
import Acq.*;
import java.sql.ResultSet;
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
    
        @Override
    public ICase getCase(String caseNumber) throws SQLException
    {
        ResultSet result = dataFacade.getCase(caseNumber);
        Case c = new Case(
                Integer.parseInt(result.getString("caseid")),
                new Patient(),
                Integer.parseInt(result.getString("status")),
                Boolean.parseBoolean(result.getString("consent")),
                result.getString("casetype"),
                new User(0),
                new InquiryInformation("")
                
        );
        return c;
    }
}
