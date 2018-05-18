
package Udred.Business;

import Acq.IBusinessFacade;
import Udred.Data.DataFacade;
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
    
    protected static IDataFacade dataFacade;
    private IUser activeUser;
    private ICase activeCase;
    private ICase activeCaseCompare;
    
    public BusinessFacade(){}

    
    @Override
    public ArrayList getUserCaseList(String UserID) throws SQLException{
        ArrayList al = dataFacade.getUserCaseList();
        return al;
    }
    
    
    @Override
    public void injectDataFacade(IDataFacade db){
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
    public Case getCase(String caseNumber) throws SQLException
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

    @Override
    public ICase getActiveCase() {
        return this.activeCase;
    }

    @Override
    public void setActiveCase(String caseID) throws SQLException {
        this.activeCase = getCase(caseID);
    }
    
}
