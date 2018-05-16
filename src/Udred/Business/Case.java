/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Acq.*;
import Udred.Data.PostgresHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class Case implements ICase {

    private final int caseID;
    private int status; // enum
    private final IPatient patient;
    private IUser caseWorker;
    private final Date creationDate;
    private Date closingDate;
    private boolean consent;
    private final ICaseInformation caseInformation;
    private CaseTypeEnum caseType;

    /**
     * Constructor for Case
     *
     * @param caseID
     * @param patient
     * @param status
     * @param consent
     * @param caseType
     * @param caseWorker
     * @param inquiryInformation
     */
    // changed public to public, to make db stuff work from GUI, should be changed back when we have a properinterface
    public Case(int caseID, Patient patient, int status, boolean consent, String caseType, User caseWorker, InquiryInformation inquiryInformation) {
        this.caseID = caseID;
        this.patient = patient;
        this.status = status;
        this.consent = consent;
        this.caseWorker = caseWorker;
        this.creationDate = new Date();
        this.closingDate = null;
        this.caseInformation = new CaseInformation(inquiryInformation);
        setCaseType(caseType);
    }

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public Date getClosingDate() {
        return closingDate;
    }

    @Override
    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    @Override
    public boolean isConsent() {
        return consent;
    }

    @Override
    public void setConsent(boolean consent) {
        this.consent = consent;
    }

    @Override
    public CaseTypeEnum getCaseType() {
        return this.caseType;
    }

    /**
     * Compares the string in the argument with any of the possible enums in
     * CaseTypeEnum and sets this.caseType to the corresponding enumerator
     *
     * @param caseType takes a type of case that should be in enum CaseTypeEnum
     */
    // Needs proper debugging, havent been able to test this correctly
    private void setCaseType(String caseType) {
        for (CaseTypeEnum caseT : CaseTypeEnum.values()) {
            if (caseType.toLowerCase().equals(caseT.toString())) {
                this.caseType = caseT;
                break;
            }
        }
    }

    @Override
    public int getCaseID() {
        return caseID;
    }

    @Override
    public IPatient getPatient() {
        return patient;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public ICaseInformation getCaseInformation() {
        return caseInformation;
    }

    @Override
    public void setCaseWorker(IUser caseWorker) {
        this.caseWorker = caseWorker;
    }
    
    @Override
    public IUser getCaseWorker(){
        return caseWorker;
    }

    //should be changed to a call to a call via the facade, but this is a dirty way of doing it, to tired to make it properly right now
    @Override
    public void save(ICase thisCase) {
       IDatabaseFacade df = new DatabaseFacade();
       df.saveCase(thisCase);
    }
}
