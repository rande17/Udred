/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.AlternativeInformation;
import Udred.Business.DiaryEntry;
import Udred.Business.InquiryInformation;
import java.util.List;

/**
 *
 * @author niemeijeren
 */
public interface ICaseInformation {

    void addAlternativeInformation(AlternativeInformation alternativeInformation);

    void addDiaryEntry(DiaryEntry diaryEntry);

    List<AlternativeInformation> getAlternativeInformation();

    List<DiaryEntry> getDiary();

    InquiryInformation getInquiryInformation();
    
}
