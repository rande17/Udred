/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Acq;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author niemeijeren
 */
public interface IPatient {

    void addGuardian(String name, int CPR, int telephone);

    void addGuardian(String name, int CPR, int telephone, IAddress address);

    IAddress getPatientAddress();

    int getPatientCPR();

    List<IGuardian> getPatientGuardians();

    String getPatientName();

    int getPatientTelephone();

    void removeGuardian(int CPR);

    void setGuardianAddress(IGuardian guardian, IAddress address);

    void setPatientAddress(IAddress patientAddress);

    void setPatientName(String patientName);

    void setPatientTelephone(int patientTelephone);
    
    public void savePatient(IPatient patient);

    public UUID getPatientID();
    
}
