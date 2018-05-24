/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Acq;

/**
 *
 * @author niemeijeren
 */
public interface IUser {

    int getCase(int caseID);

    //    public void addCase(Case case)
    //    {
    //
    //    }
    //    public void removeCase (Case case)
    //    {
    //
    //    }
    String getUserName();

    int getWorkerID();
    
}
