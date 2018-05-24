/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Udred.Acq.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Linea Hoffmann
 * @author Simon Pontoppidan
 */
public class CaseInformation implements ICaseInformation
{
    private List<IAlternativeInformation> alternativeInformationList;
    private InquiryInformation inquiryInformation;
    private List<IDiaryEntry> diaryEntrys;
    
    /**
     * Constructor for CaseInformation
     * @param inquiryInformation 
     */
    
    public CaseInformation(InquiryInformation inquiryInformation)
    {
        this.alternativeInformationList = new ArrayList<IAlternativeInformation>();
        this.inquiryInformation = inquiryInformation;
        this.diaryEntrys = new ArrayList<IDiaryEntry>();
                
    }
    
    @Override
    public void addAlternativeInformation(IAlternativeInformation alternativeInformation)
    {
        this.alternativeInformationList.add(alternativeInformation);
    }
    
    @Override
    public void addDiaryEntry(IDiaryEntry diaryEntry)
    {
        this.diaryEntrys.add(diaryEntry);
    }

    @Override
    public List<IAlternativeInformation> getAlternativeInformation()
    {
        return this.alternativeInformationList;
    }

    @Override
    public InquiryInformation getInquiryInformation()
    {
        return this.inquiryInformation;
    }

    @Override
    public List<IDiaryEntry> getDiary()
    {
        return this.diaryEntrys;
    }
    
    
}
