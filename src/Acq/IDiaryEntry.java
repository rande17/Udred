/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.DiaryEntryTypeEnum;
import java.util.Date;

/**
 *
 * @author niemeijeren
 */
public interface IDiaryEntry {

    String getContent();

    Date getDiaryTimeStamp();

    String getTopic();

    DiaryEntryTypeEnum getType();

    void setContent(String content);
    
}
