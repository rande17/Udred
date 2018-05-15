/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class Patient
{


    private String patientName;
    private Address patientAddress;
    private int patientTelephone;
    private int patientCPR;
    private List<Guardian> patientGuardians;
    
    /**
     * Constructor for Patient
     * @param patientName
     * @param patientCPR
     * @param patientTelephone
     * @param address 
     */
    //changed from protected to public to make DB work, should be changed back when proper constructor is created
    public Patient(String patientName, int patientCPR, int patientTelephone, Address address)
    {
        this.patientName = patientName;
        this.patientCPR = patientCPR;
        this.patientTelephone = patientTelephone;
        this.patientGuardians = new ArrayList<>();
        this.patientAddress = address;
                
    }

    Patient()
    {
        
    }
    
    protected void addGuardian (String name, int CPR, int telephone)
    {
        this.patientGuardians.add(new Guardian(name, CPR, telephone));  
    }
    
    protected void addGuardian (String name, int CPR, int telephone, Address address)
    {
        this.patientGuardians.add(new Guardian(name, CPR, telephone, address));   
    }
    
    protected void setGuardianAddress(Guardian guardian, Address address)
    {
        guardian.setGuardianaddress(address);
        
    }
    
    protected void removeGuardian(int CPR)
    {
        for(Guardian guardian : this.patientGuardians)
        {
            if (guardian.getGuardianCPR() == CPR)
            {
                patientGuardians.remove(guardian);
                break;
            }

        }
        
    }
    
    protected String getPatientName()
    {
        return patientName;
    }

    protected void setPatientName(String patientName)
    {
        this.patientName = patientName;
    }

    protected Address getPatientAddress()
    {
        return patientAddress;
    }

    protected void setPatientAddress(Address patientAddress)
    {
        this.patientAddress = patientAddress;
    }

    protected int getPatientTelephone()
    {
        return patientTelephone;
    }

    protected void setPatientTelephone(int patientTelephone)
    {
        this.patientTelephone = patientTelephone;
    }

    public int getPatientCPR()
    {
        return patientCPR;
    }

    public List<Guardian> getPatientGuardians()
    {
        return patientGuardians;
    }
    
    
}
