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
 */
public class DiaryEntry
{
    private String topic;
    private String content;
    private Date diaryTimeStamp;
    private DiaryEntryTypeEnum type;

    /**
     * Constructor for DiaryEntry
     * @param topic : The topic of the diaryEntry
     * @param content : The information that the user thinks is important for the diaryEntry
     * @param type : The type of diaryEntry, defined by an Enumerator
     */

    protected DiaryEntry(String topic, String content, DiaryEntryTypeEnum type)
    {
        this.topic = topic;
        this.content = content;
        this.diaryTimeStamp = new Date(); // Creates a timestamp of the moment the diaryEntry was created
        this.type = type;
    }

    public String getTopic() {
        return topic;
    }

    public String getContent() {
        return content;
    }

    public Date getDiaryTimeStamp() {
        return diaryTimeStamp;
    }

    public DiaryEntryTypeEnum getType() {
        return type;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
