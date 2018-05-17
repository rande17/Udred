/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import java.util.Date;

/**
 *
 * @author niemeijeren
 */
public interface IInquiryInformation {

    String getInquiry();

    Date getInquiryDate();

    void setInquiry(String inquiry);
    
}
