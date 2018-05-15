/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Acq.IMeeting;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Linea Hoffmann
 */
public class Meeting implements IMeeting
{
    private Date meetingTime;
    private Patient patient;
    private Address meetingAddress;
    private PartRepresentive partRepresentive;
    private ArrayList<Assessor> assessorList;

    /**
     * Constructor for Meeting
     * @param meetingTime : The time of the meeting, represented as a Date
     * @param patient : The patient that is tied to the meeting
     * @param meetingAddress : The address of the meeting
     * @param partRepresentive : The part representative that is present at the meeting
     */
    public Meeting(Date meetingTime, Patient patient, Address meetingAddress, PartRepresentive partRepresentive)
    {
        this.meetingTime = meetingTime;
        this.patient = patient;
        this.meetingAddress = meetingAddress;
        this.partRepresentive = partRepresentive;
        this.assessorList = new ArrayList<>();
    }

    /**
     * Add assessor to assessorList. Needs debugging
     * @param name : Name of assessor
     * @param assessorTelephone : Phone number of assessor
     * @param function : function of assessor
     */
    @Override
    public void addAssessor(String name, int assessorTelephone, String function)
    {
        Assessor ass = new Assessor(name, assessorTelephone, function);
        if(!this.assessorList.contains(ass)) {
            this.assessorList.add(ass);
        }
    }

    @Override
    public Date getMeetingTime() {
        return meetingTime;
    }

    @Override
    public Patient getPatient() {
        return patient;
    }

    @Override
    public Address getMeetingAddress() {
        return meetingAddress;
    }

    @Override
    public PartRepresentive getPartRepresentive() {
        return partRepresentive;
    }

    @Override
    public ArrayList<Assessor> getAssessorList() {
        return assessorList;
    }

    @Override
    public void setMeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }

    @Override
    public void setMeetingAddress(Address meetingAddress) {
        this.meetingAddress = meetingAddress;
    }

    @Override
    public void setPartRepresentive(PartRepresentive partRepresentive) {
        this.partRepresentive = partRepresentive;
    }


}
