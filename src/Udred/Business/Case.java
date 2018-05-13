/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

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
     *
     * @param caseID
     * @param patient
     * @param status
     * @param consent
     * @param caseType
     * @param caseWorker
     * @param inquiryInformation
     */
    // changed protected to public, to make db stuff work from GUI, should be changed back when we have a properinterface
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

    //should be changed to a call to a call via the facade, but this is a dirty way of doing it, to tired to make it properly right now
    public void save() {
        try {
            PostgresHelper DB = new PostgresHelper();
            ArrayList al = new ArrayList();

            al.add(caseType.toString());
            al.add("" + caseID);
            al.add("" + caseID);
            al.add("" + status);
            al.add(patient.toString());
            al.add(caseWorker.toString());
            // al.add(closingDate);
            //al.add(consent);
            al.add(caseInformation.toString());

            DB.query("INSERT INTO Cases (caseType, UUID, caseID, status, patient, caseWorker, caseInformation) VALUES (?,?,?,?,?,?,?)", al, "sssssss");
            ResultSet rs = DB.query("SELECT * FROM Cases", new ArrayList(), "");
            while(rs.next()){
                System.out.print(rs.getString(1) + " | ");
                System.out.print(rs.getString(2) + " | ");
                System.out.print(rs.getString(3) + " | ");
                System.out.print(rs.getString(4) + " | ");
                System.out.print(rs.getString(5) + " | ");
                System.out.print(rs.getString(6) + " | ");
                System.out.print(rs.getString(7) + " | ");
                System.out.print(rs.getString(8) + " | ");
                System.out.println(rs.getString(9) + " | ");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Case.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
