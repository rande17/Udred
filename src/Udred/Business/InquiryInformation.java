/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Udred.Acq.*;
import java.util.Date;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class InquiryInformation implements IInquiryInformation
{
    private String inquiry;
    private Date inquiryDate;
    
    /**
     * Constructor for InquiryInformation
     * @param inquiry
     * @param inquiryDate 
     */
      // changed public to public, to make db stuff work from GUI, should be changed back when we have a properinterface
    public InquiryInformation(String inquiry)
    {
        this.inquiry = inquiry;
        this.inquiryDate = new Date(); //Sets date to the time this object was created
    }

    @Override
    public String getInquiry()
    {
        return inquiry;
    }

    @Override
    public void setInquiry(String inquiry)
    {
        this.inquiry = inquiry;
    }

    @Override
    public Date getInquiryDate()
    {
        return inquiryDate;
    }
     
}
