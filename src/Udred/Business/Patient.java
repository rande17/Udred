/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Udred.Acq.*;
import Udred.Data.DataFacade;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class Patient implements IPatient
{


    private String patientName;
    private IAddress patientAddress;
    private int patientTelephone;
    private int patientCPR;
    private List<IGuardian> patientGuardians;
    private UUID patientID;
    
    /**
     * Constructor for Patient
     * @param patientName
     * @param patientCPR
     * @param patientTelephone
     * @param address 
     */
    //changed from public to public to make DB work, should be changed back when proper constructor is created
    public Patient(String patientName, int patientCPR, int patientTelephone, IAddress address)
    {
        this.patientName = patientName;
        this.patientCPR = patientCPR;
        this.patientTelephone = patientTelephone;
        this.patientGuardians = new ArrayList<>();
        this.patientAddress = address;
        this.patientID = UUID.randomUUID();
    }

    public Patient()
    {
        
    }
    
    public void savePatient(Patient patient){
        IDataFacade df = new DataFacade();
       df.savePatient(patient);
    }
    
    @Override
    public void addGuardian (String name, int CPR, int telephone)
    {
        this.patientGuardians.add(new Guardian(name, CPR, telephone));  
    }
    
    @Override
    public void addGuardian (String name, int CPR, int telephone, IAddress address)
    {
        this.patientGuardians.add(new Guardian(name, CPR, telephone, address));   
    }
    
    @Override
    public void setGuardianAddress(IGuardian guardian, IAddress address)
    {
        guardian.setGuardianaddress(address);
        
    }
    
    @Override
    public void removeGuardian(int CPR)
    {
        for(IGuardian guardian : this.patientGuardians)
        {
            if (guardian.getGuardianCPR() == CPR)
            {
                patientGuardians.remove(guardian);
                break;
            }

        }
        
    }
    
    @Override
    public String getPatientName()
    {
        return patientName;
    }

    @Override
    public void setPatientName(String patientName)
    {
        this.patientName = patientName;
    }

    @Override
    public IAddress getPatientAddress()
    {
        return patientAddress;
    }

    @Override
    public void setPatientAddress(IAddress patientAddress)
    {
        this.patientAddress = patientAddress;
    }

    @Override
    public int getPatientTelephone()
    {
        return patientTelephone;
    }

    @Override
    public void setPatientTelephone(int patientTelephone)
    {
        this.patientTelephone = patientTelephone;
    }

    @Override
    public int getPatientCPR()
    {
        return patientCPR;
    }

    @Override
    public List<IGuardian> getPatientGuardians()
    {
        return patientGuardians;
    }

    @Override
    public void savePatient(IPatient patient) {
            IDataFacade df = new DataFacade();
            df.savePatient(patient);
    }

    @Override
    public UUID getPatientID() {
        return this.patientID;
    }
    
    
}
