package Udred.Business;


import Udred.Data.DataFacade;
import Acq.IBusinessFacade;
import Acq.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.TextFormatter.Change;

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
    private ObservableList<IUser> userList;
    
    
    
    public BusinessFacade(){

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
    public ObservableList<IUser> getAllUsers() throws SQLException
    {
        ResultSet result = dataFacade.getAllUsers();
        
//        String str = result.getString("caselist");
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" , ")));
        ArrayList<Integer> ilist = new ArrayList<>();
//        if (!list.isEmpty()){
//            for(String s : list) ilist.add(Integer.valueOf(s));
//        }
//        
        ArrayList<IUser> usrlist = new ArrayList<IUser>();

        while(result.next()) 
        {  
            IUser u = new User(
                result.getString("username"),
                Integer.parseInt(result.getString("workerid")),
                ilist,
                Integer.parseInt(result.getString("accesslevel")));
            
            usrlist.add(u);
        }
        userList = FXCollections.observableArrayList(usrlist);
       
       
        return userList;
    }

    @Override
    public ICase getCase(String caseNumber) throws SQLException
    {
        ResultSet result = dataFacade.getCase(caseNumber);
        ICase c = new Case(
                Integer.parseInt(result.getString("caseid")),
                new Patient(),
                Integer.parseInt(result.getString("status")),
                Boolean.parseBoolean(result.getString("consent")),
                result.getString("casetype"),
                new User("", 0, new ArrayList<Integer>(), 0),
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

    @Override
    public void addUser()
    {
        IUser user = new User("new user", 0, new ArrayList<Integer>(), 0);
        userList.add(user);
        dataFacade.addUser(user);
    }
    
    @Override
    public void removeUser(IUser user)
    {
        userList.remove(user);
        dataFacade.removeUser(user);
    }

    @Override
    public void updateUser(int workerID, IUser user)
    {
        dataFacade.updateUser(workerID, user);
    }
    
    @Override
    public ArrayList<String> getSYSLogText() 
    {
        ArrayList sYSText = dataFacade.getSYSLogText();
        return sYSText;
    }
    
}
