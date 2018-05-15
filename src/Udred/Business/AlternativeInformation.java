/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Acq.*;
import java.util.Date;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class AlternativeInformation implements IAlternativeInformation
{
    private String title; 
    private String subject;
    private String Content;
    private Date alternativeInformationTime;
    
    /**
     * Constructor AlternativeInformation
     * @param title
     * @param subject
     * @param Content 
     */

    public AlternativeInformation(String title, String subject, String Content)
    {
        this.title = title;
        this.subject = subject;
        this.Content = Content;
        this.alternativeInformationTime = new Date();
    }
  
    @Override
    public String getTitle()
    {
        return title;
    }

    @Override
    public void setTitle(String title)
    {
        this.title = title;
    }
    @Override
    public String getSubject()
    {
        return subject;
    }

    @Override
    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    @Override
    public String getContent()
    {
        return Content;
    }

    @Override
    public void setContent(String Content)
    {
        this.Content = Content;
    }

    @Override
    public Date getAlternativeInformationTime()
    {
        return alternativeInformationTime;
    }
   
}
