/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Acq.IUser;
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
    private String accessLevel;
 // changed public to public, to make db stuff work from GUI, should be changed back when we have a properinterface
   public User(String username, int workerID, ArrayList<Integer> caseList, String accessLevel)
    {
        this.userName = username;
        this.workerID = workerID;
        this.caseList = caseList;
        this.accessLevel = accessLevel;
    }
    
    @Override
    public void addCase(int caseID)
    {
        caseList.add(caseID);
    }
    
    @Override
    public void removeCase(int caseID)
    {
        caseList.remove(caseID);
    }

    @Override
    public String getUserName()
    {
        return userName;
    }
    
    @Override
    public void setUserName(String name)
    {
        userName = name;
    }

    @Override
    public int getWorkerID()
    {
        return workerID;
    }
    
    @Override
    public void setWorkerID(int id)
    {
        workerID = id;
    }
    
    @Override
    public String getAccessLevel()
    {
        return accessLevel;
    }
    
    @Override
    public void setAccessLevel(String al)
    {
        accessLevel = al;
    }

    @Override
    public String getCaseList()
    {
        String listString = "";
        for (Integer i : caseList){
            listString.concat(i + ",");
        }
        return listString;
    }
    
    
    
    
}
