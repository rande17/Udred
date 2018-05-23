
package Udred.Business;

import Acq.IBusinessFacade;
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
    
    public BusinessFacade(){
    activeUser = new User(000000);
    activeCase = new Case();
    }

    
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
    public Case getCase(int caseID) throws SQLException
    {
        ResultSet result = dataFacade.getCase(caseID);
        result.next();
        Case c = new Case(
                Integer.parseInt(result.getString("caseid")),
                new Patient(),
                result.getString("status"),
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
    public void setActiveCase(int caseID) throws SQLException {
        this.activeCase = getCase(caseID);
    }

    @Override
    public ArrayList<String> getSYSLogText() {
        ArrayList sYSText = dataFacade.getSYSLogText();
        return sYSText;
    }
    
    public void writeLoginInfoToSyslog (){
        SYSLog log = new SYSLog();
        dataFacade.writeLoginInfoToSyslog(log.addLoginToSyslog(activeUser));
    }
    
    public void writeOpenCaseInfoToSyslog (){
        SYSLog log = new SYSLog();
        dataFacade.writeOpenCaseInfoToSyslog(log.addOpenCaseToSyslog(activeUser, activeCase));
    }
    
}
