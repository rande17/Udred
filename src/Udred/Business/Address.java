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
public class Address implements IAddress
{
    private int zipCode; 
    private String city;
    private String streetName;
    private String houseNumber;
    
    /**
     * Constructor for Address
     * @param streetName
     * @param houseNumber
     * @param city
     * @param zipCode 
     */
     // changed public to public, to make db stuff work from GUI, should be changed back when we have a properinterface
   public Address(String streetName, String houseNumber, String city, int zipCode)
    {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.zipCode = zipCode;
        
    }

    @Override
    public int getZipCode()
    {
        return zipCode;
    }
    
    @Override
    public void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }

    @Override
    public String getCity()
    {
        return city;
    }
    
    @Override
    public void setCity(String city)
    {
        this.city = city;
    }

    @Override
    public String getStreetName()
    {
        return streetName;
    }
    
    @Override
    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    @Override
    public String getHouseNumber()
    {
        return houseNumber;
    }
    
    @Override
    public void setHouseNumber(String houseNumber)
    {
        this.houseNumber = houseNumber;
    } 
    
}
