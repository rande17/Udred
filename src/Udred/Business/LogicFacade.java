
package Udred.Business;

import Acq.*;
import Udred.Data.DatabaseFacade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JogGez
 */
public class LogicFacade 
{
    
    private static LogicFacade instance;
    
    private LogicFacade(){}
    
    public static LogicFacade getInstance(){
        if(instance == null){
            instance = new LogicFacade();
        }
        return instance;
    }
    
    public ArrayList getUserCaseList(String UserID) throws SQLException{
        DatabaseFacade db = new DatabaseFacade();
        ArrayList al = db.getUserCaseList("");
        return al;
    }
    
    public ICase getCase(String caseNumber) throws SQLException{
        DatabaseFacade db = new DatabaseFacade();
        
        ResultSet result = db.getCase(caseNumber);
        
        result.next();
        ICase newCase = new Case(
                Integer.parseInt(result.getString("caseid")),
                new Patient(),
                Integer.parseInt(result.getString("status")),
                Boolean.parseBoolean(result.getString("consent")),
                result.getString("casetype"),
                new User(0),
                new InquiryInformation("")
        );
        
        return newCase;

    }
    
    
}
