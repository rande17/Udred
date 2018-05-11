/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class CaseInformation
{
    private List<AlternativeInformation> alternativeInformationList;
    private InquiryInformation inquiryInformation;
    private List<DiaryEntry> diaryEntrys;
    
    /**
     * Constructor for CaseInformation
     * @param inquiryInformation 
     */
    
    protected CaseInformation(InquiryInformation inquiryInformation)
    {
        this.alternativeInformationList = new ArrayList<AlternativeInformation>();
        this.inquiryInformation = inquiryInformation;
        this.diaryEntrys = new ArrayList<DiaryEntry>();
                
    }
    
    protected void addAlternativeInformation(AlternativeInformation alternativeInformation)
    {
        this.alternativeInformationList.add(alternativeInformation);
    }
    
    protected void addDiaryEntry(DiaryEntry diaryEntry)
    {
        this.diaryEntrys.add(diaryEntry);
    }

    protected List<AlternativeInformation> getAlternativeInformation()
    {
        return this.alternativeInformationList;
    }

    protected InquiryInformation getInquiryInformation()
    {
        return this.inquiryInformation;
    }

    protected List<DiaryEntry> getDiary()
    {
        return this.diaryEntrys;
    }
    
    
}
