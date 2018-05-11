/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.util.Date;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class InquiryInformation
{
    private String inquiry;
    private Date inquiryDate;
    
    /**
     * Constructor for InquiryInformation
     * @param inquiry
     * @param inquiryDate 
     */
    
    protected InquiryInformation(String inquiry, Date inquiryDate)
    {
        this.inquiry = this.inquiry;
        this.inquiryDate = new Date(); //Sets date to the time this object was created
    }

    protected String getInquiry()
    {
        return inquiry;
    }

    protected void setInquiry(String inquiry)
    {
        this.inquiry = inquiry;
    }

    protected Date getInquiryDate()
    {
        return inquiryDate;
    }
     
}
