/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Acq;

import java.util.List;

/**
 *
 * @author niemeijeren
 */
public interface ICaseInformation {

    void addAlternativeInformation(IAlternativeInformation alternativeInformation);

    void addDiaryEntry(IDiaryEntry diaryEntry);

    List<IAlternativeInformation> getAlternativeInformation();

    List<IDiaryEntry> getDiary();

    IInquiryInformation getInquiryInformation();
    
}
