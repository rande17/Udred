/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.Address;
import Udred.Business.Assessor;
import Udred.Business.PartRepresentive;
import Udred.Business.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author niemeijeren
 */
public interface IMeeting {

    /**
     * Add assessor to assessorList. Needs debugging
     * @param name : Name of assessor
     * @param assessorTelephone : Phone number of assessor
     * @param function : function of assessor
     */
    void addAssessor(String name, int assessorTelephone, String function);

    ArrayList<IAssessor> getAssessorList();

    IAddress getMeetingAddress();

    Date getMeetingTime();

    IPartRepresentive getPartRepresentive();

    IPatient getPatient();

    void setMeetingAddress(IAddress meetingAddress);

    void setMeetingTime(Date meetingTime);

    void setPartRepresentive(IPartRepresentive partRepresentive);
    
}
