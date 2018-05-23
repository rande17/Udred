/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.AccessLevelEnum;

/**
 *
 * @author niemeijeren
 */
public interface IUser {

    void addCase(int caseID);
    
    void removeCase(int caseID);

    String getUserName();
    
    void setUserName(String name);

    int getWorkerID();
    
    void setWorkerID(int id);
    
    String getAccessLevel();
    
    void setAccessLevel(String al);

    public String getCaseList();
    
}
