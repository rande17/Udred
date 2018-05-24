/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Udred.Acq.IUser;
import java.util.ArrayList;

/**
 *
 * @author Linea Hoffmann
 */
public class User implements IUser
{
    private String userName;
    private int workerID;
    private ArrayList<Integer> caseList;
    private int accessLevel;
 // changed public to public, to make db stuff work from GUI, should be changed back when we have a properinterface
   public User(int workerID)
    {
        this.workerID = workerID;
    }
    
    @Override
    public int getCase(int caseID)
    {
        return 0;
    }
    
//    public void addCase(Case case)
//    {
//
//    }
//    public void removeCase (Case case)
//    {
//
//    }

    @Override
    public String getUserName()
    {
        return userName;
    }

    @Override
    public int getWorkerID()
    {
        return workerID;
    }
    
    
    
    
}
