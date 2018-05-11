/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class Address
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
    
    protected Address(String streetName, String houseNumber, String city, int zipCode)
    {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.zipCode = zipCode;
        
    }

    protected int getZipCode()
    {
        return zipCode;
    }
    
    protected void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }

    protected String getCity()
    {
        return city;
    }
    
    protected void setCity(String city)
    {
        this.city = city;
    }

    protected String getStreetName()
    {
        return streetName;
    }
    
    protected void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    protected String getHouseNumber()
    {
        return houseNumber;
    }
    
    protected void setHouseNumber(String houseNumber)
    {
        this.houseNumber = houseNumber;
    } 
    
}
