/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Acq;

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

    String getStatus();

    boolean isConsent();

    //should be changed to a call to a call via the facade, but this is a dirty way of doing it, to tired to make it properly right now
    void save(ICase thisCase);

    void setCaseWorker(IUser caseWorker);

    void setClosingDate(Date closingDate);

    void setConsent(boolean consent);

    void setStatus(String status);
    
}
