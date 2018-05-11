/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.util.Date;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class Case {

    private final int caseID;
    private int status; // enum
    private final Patient patient;
    private User caseWorker;
    private final Date creationDate;
    private Date closingDate;
    private boolean consent;
    private final CaseInformation caseInformation;
    private CaseTypeEnum caseType;
    
    /**
     * Constructor for Case
     * @param caseID
     * @param patient
     * @param status
     * @param consent
     * @param caseType
     * @param caseWorker
     * @param inquiryInformation 
     */

    protected Case(int caseID, Patient patient, int status, boolean consent, String caseType, User caseWorker, InquiryInformation inquiryInformation)
    {
        this.caseID = caseID;
        this.patient = patient;
        this.status = status;
        this.consent = consent;
        this.caseWorker = caseWorker;
        this.creationDate = new Date();
        this.closingDate = null;
        this.caseInformation = new CaseInformation(inquiryInformation);
    }

    protected int getStatus() {
        return status;
    }

    protected void setStatus(int status) {
        this.status = status;
    }

    protected Date getClosingDate() {
        return closingDate;
    }

    protected void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    protected boolean isConsent() {
        return consent;
    }

    protected void setConsent(boolean consent) {
        this.consent = consent;
    }

    protected CaseTypeEnum getCaseType() {
        return caseType;
    }

    /**
     * Compares the string in the argument with any of the possible enums in CaseTypeEnum 
     * and sets this.caseType to the corresponding enumerator
     * @param caseType takes a type of case that should be in enum CaseTypeEnum
     */
    
    // Needs proper debugging, havent been able to test this correctly
    protected void setCaseType(String caseType) {
        for (CaseTypeEnum caseT : CaseTypeEnum.values()) {
            if (caseType.toLowerCase().equals(caseT.toString())) {
                this.caseType = CaseTypeEnum.valueOf(caseType.toLowerCase());
                break; 
            }
        }
    }

    protected int getCaseID() {
        return caseID;
    }

    protected Patient getPatient() {
        return patient;
    }

    protected Date getCreationDate() {
        return creationDate;
    }

    protected CaseInformation getCaseInformation() {
        return caseInformation;
    }

    public void setCaseWorker(User caseWorker) {
        this.caseWorker = caseWorker;
    }
}
