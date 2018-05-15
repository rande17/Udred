/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Acq.IPartsRepresentive;

/**
 *
 * @author Linea Hoffmann
 */
public class PartRepresentive implements IPartsRepresentive
{
    private String partRepresentiveName;
    private Address partRepresentiveAddress;
    private Guardian guardian;
    private int partRepresentiveCPR;
    private int partRepresentiveTelephone;

    public PartRepresentive(String partRepresentiveName, Address partRepresentiveAddress, int partRepresentiveCPR, int partRepresentiveTelephone)
    {
        this.partRepresentiveName = partRepresentiveName;
        this.partRepresentiveAddress = partRepresentiveAddress;
        this.partRepresentiveCPR = partRepresentiveCPR;
        this.partRepresentiveTelephone = partRepresentiveTelephone;
    }
    
    

    @Override
    public String getPartRepresentiveName()
    {
        return partRepresentiveName;
    }
    
    @Override
    public void setPartRepresentiveName(String partRepresentiveName)
    {
        this.partRepresentiveName = partRepresentiveName;
    }
    
    @Override
    public Address getPartRepresentiveAddress()
    {
        return partRepresentiveAddress;
    }
    
    @Override
    public void setPartRepresentiveAddress(Address partRepresentiveAddress)
    {
        this.partRepresentiveAddress = partRepresentiveAddress;
    }

    @Override
    public Guardian getGuardian()
    {
        return guardian;
    }
    
    @Override
    public void setGuardian(Guardian guardian)
    {
        this.guardian = guardian;
    }

    @Override
    public int getPartRepresentiveCPR()
    {
        return partRepresentiveCPR;
    }

    @Override
    public int getPartRepresentiveTelephone()
    {
        return partRepresentiveTelephone;
    }
    
    @Override
    public void setPartRepresentiveTelephone(int partRepresentiveTelephone)
    {
        this.partRepresentiveTelephone = partRepresentiveTelephone;
    }
    
    
    
}
