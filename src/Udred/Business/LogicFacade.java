
package Udred.Business;

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
    
    public Case getCase(String caseNumber) throws SQLException{
        DatabaseFacade db = new DatabaseFacade();
        Case case1 = db.getCase(caseNumber);
        return case1;

    }
    
    
}
