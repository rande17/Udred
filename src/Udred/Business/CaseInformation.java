/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Acq.ICaseInformation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class CaseInformation implements ICaseInformation
{
    private List<AlternativeInformation> alternativeInformationList;
    private InquiryInformation inquiryInformation;
    private List<DiaryEntry> diaryEntrys;
    
    /**
     * Constructor for CaseInformation
     * @param inquiryInformation 
     */
    
    public CaseInformation(InquiryInformation inquiryInformation)
    {
        this.alternativeInformationList = new ArrayList<AlternativeInformation>();
        this.inquiryInformation = inquiryInformation;
        this.diaryEntrys = new ArrayList<DiaryEntry>();
                
    }
    
    @Override
    public void addAlternativeInformation(AlternativeInformation alternativeInformation)
    {
        this.alternativeInformationList.add(alternativeInformation);
    }
    
    @Override
    public void addDiaryEntry(DiaryEntry diaryEntry)
    {
        this.diaryEntrys.add(diaryEntry);
    }

    @Override
    public List<AlternativeInformation> getAlternativeInformation()
    {
        return this.alternativeInformationList;
    }

    @Override
    public InquiryInformation getInquiryInformation()
    {
        return this.inquiryInformation;
    }

    @Override
    public List<DiaryEntry> getDiary()
    {
        return this.diaryEntrys;
    }
    
    
}
