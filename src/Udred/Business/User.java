/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.util.ArrayList;

/**
 *
 * @author Linea Hoffmann
 */
public class User
{
    private String userName;
    private int workerID;
    private ArrayList<Integer> caseList;
    private int accessLevel;

    protected User(int workerID)
    {
        this.workerID = workerID;
    }
    
    protected int getCase(int caseID)
    {
        return 0;
    }
    
//    protected void addCase(Case case)
//    {
//
//    }
//    protected void removeCase (Case case)
//    {
//
//    }

    protected String getUserName()
    {
        return userName;
    }

    protected int getWorkerID()
    {
        return workerID;
    }
    
    
    
    
}
