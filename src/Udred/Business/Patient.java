/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Acq.*;
import java.util.ArrayList;
import java.util.List;

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
                
    }

    public Patient()
    {
        
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
    
    
}
