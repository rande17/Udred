/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;


/**
 *
 * @author Linea Hoffmann
 */
public class DatabaseFacade
{
    private String dataHost;
    private String databaseName;
    private String userName;
    private String password; 

    protected DatabaseFacade(String dataHost, String databaseName, String userName, String password)
    {
        this.dataHost = dataHost;
        this.databaseName = databaseName;
        this.userName = userName;
        this.password = password;
    }
    
    protected void specific()
    {
        
    }
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
    
}
