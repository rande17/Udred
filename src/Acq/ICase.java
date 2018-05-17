/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.Case;
import Udred.Business.CaseInformation;
import Udred.Business.CaseTypeEnum;
import Udred.Business.Patient;
import Udred.Business.User;
import java.util.Date;

/**
 *
 * @author niemeijeren
 */
public interface ICase {

    int getCaseID();

    ICaseInformation getCaseInformation();

    ICaseTypeEnum getCaseType();

    IUser getCaseWorker();

    Date getClosingDate();

    Date getCreationDate();

    IPatient getPatient();

    int getStatus();

    boolean isConsent();

    //should be changed to a call to a call via the facade, but this is a dirty way of doing it, to tired to make it properly right now
    void save(ICase thisCase);

    void setCaseWorker(IUser caseWorker);

    void setClosingDate(Date closingDate);

    void setConsent(boolean consent);

    void setStatus(int status);
    
}
