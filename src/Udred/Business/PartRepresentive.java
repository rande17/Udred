/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

/**
 *
 * @author Linea Hoffmann
 */
public class PartRepresentive
{
    private String partRepresentiveName;
    private Address partRepresentiveAddress;
    private Guardian guardian;
    private int partRepresentiveCPR;
    private int partRepresentiveTelephone;

    protected PartRepresentive(String partRepresentiveName, Address partRepresentiveAddress, int partRepresentiveCPR, int partRepresentiveTelephone)
    {
        this.partRepresentiveName = partRepresentiveName;
        this.partRepresentiveAddress = partRepresentiveAddress;
        this.partRepresentiveCPR = partRepresentiveCPR;
        this.partRepresentiveTelephone = partRepresentiveTelephone;
    }
    
    

    protected String getPartRepresentiveName()
    {
        return partRepresentiveName;
    }
    
    protected void setPartRepresentiveName(String partRepresentiveName)
    {
        this.partRepresentiveName = partRepresentiveName;
    }
    
    protected Address getPartRepresentiveAddress()
    {
        return partRepresentiveAddress;
    }
    
    protected void setPartRepresentiveAddress(Address partRepresentiveAddress)
    {
        this.partRepresentiveAddress = partRepresentiveAddress;
    }

    protected Guardian getGuardian()
    {
        return guardian;
    }
    
    protected void setGuardian(Guardian guardian)
    {
        this.guardian = guardian;
    }

    protected int getPartRepresentiveCPR()
    {
        return partRepresentiveCPR;
    }

    protected int getPartRepresentiveTelephone()
    {
        return partRepresentiveTelephone;
    }
    
    protected void setPartRepresentiveTelephone(int partRepresentiveTelephone)
    {
        this.partRepresentiveTelephone = partRepresentiveTelephone;
    }
    
    
    
}
