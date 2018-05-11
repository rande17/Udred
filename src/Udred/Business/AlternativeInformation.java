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
public class AlternativeInformation
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

    protected AlternativeInformation(String title, String subject, String Content)
    {
        this.title = title;
        this.subject = subject;
        this.Content = Content;
        this.alternativeInformationTime = new Date();
    }
  
    protected String getTitle()
    {
        return title;
    }

    protected void setTitle(String title)
    {
        this.title = title;
    }
    protected String getSubject()
    {
        return subject;
    }

    protected void setSubject(String subject)
    {
        this.subject = subject;
    }

    protected String getContent()
    {
        return Content;
    }

    protected void setContent(String Content)
    {
        this.Content = Content;
    }

    protected Date getAlternativeInformationTime()
    {
        return alternativeInformationTime;
    }
   
}
