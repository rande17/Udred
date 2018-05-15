/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.Case;
import Udred.Business.User;

/**
 *
 * @author Linea Hoffmann
 */
public interface ICase
{

    User getCaseWorker();

    void setCaseWorker(User caseWorker);

    //should be changed to a call to a call via the facade, but this is a dirty way of doing it, to tired to make it properly right now
    void save(Case thisCase);
    
}
