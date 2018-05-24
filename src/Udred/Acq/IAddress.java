/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Acq;

/**
 *
 * @author niemeijeren
 */
public interface IAddress {

    String getCity();

    String getHouseNumber();

    String getStreetName();

    int getZipCode();

    void setCity(String city);

    void setHouseNumber(String houseNumber);

    void setStreetName(String streetName);

    void setZipCode(int zipCode);
    
}
