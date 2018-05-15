/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.Address;
import Udred.Business.Guardian;
import java.util.List;

/**
 *
 * @author niemeijeren
 */
public interface IPatient {

    void addGuardian(String name, int CPR, int telephone);

    void addGuardian(String name, int CPR, int telephone, Address address);

    Address getPatientAddress();

    int getPatientCPR();

    List<Guardian> getPatientGuardians();

    String getPatientName();

    int getPatientTelephone();

    void removeGuardian(int CPR);

    void setGuardianAddress(Guardian guardian, Address address);

    void setPatientAddress(Address patientAddress);

    void setPatientName(String patientName);

    void setPatientTelephone(int patientTelephone);
    
}
