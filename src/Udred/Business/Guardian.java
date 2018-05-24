/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Udred.Acq.*;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class Guardian implements IGuardian
{
    private String guardianName;
    private int guardianCPR;
    private IAddress guardianaddress;
    private int guardianTelephone;
    
    /**
     * First constructor for Guardian, without GUardianAddress
     * @param guardianName
     * @param guardianCPR
     * @param guardianTelephone 
     */
    
    public Guardian(String guardianName, int guardianCPR, int guardianTelephone)
    {
        this.guardianName = guardianName;
        this.guardianCPR = guardianCPR;
        this.guardianTelephone = guardianTelephone;
        this.guardianaddress = null;
    }
    
    /**
     * Extra constructor with GuardianAddress. 
     * @param guardianName
     * @param guardianCPR
     * @param guardianTelephone
     * @param guardianAddress 
     */
    
    public Guardian(String guardianName, int guardianCPR, int guardianTelephone, IAddress guardianAddress)
    {
        this.guardianName = guardianName;
        this.guardianCPR = guardianCPR;
        this.guardianTelephone = guardianTelephone;
        this.guardianaddress = guardianAddress;
    }

    @Override
    public String getGuardianName()
    {
        return guardianName;
    }

    @Override
    public int getGuardianCPR()
    {
        return guardianCPR;
    }

    @Override
    public IAddress getGuardianaddress()
    {
        return guardianaddress;
    }

    @Override
    public int getGuardianTelephone()
    {
        return guardianTelephone;
    }

    @Override
    public void setGuardianTelephone(int guardianTelephone)
    {
        this.guardianTelephone = guardianTelephone;
    }

    @Override
    public void setGuardianaddress(IAddress address)
    {
        this.guardianaddress = address;
    }
    
}
