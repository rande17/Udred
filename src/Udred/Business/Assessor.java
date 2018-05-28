/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Udred.Acq.*;

/**
 *
 * @author Linea Hoffmann
 */
public class Assessor implements IAssessor
{
    private String assessorName;
    private int assessorTelephone;
    private String function;

    /**
     * Constructor for Assessor
     * @param assessorName : name of the assessor, used as information about the meeting
     * @param assessorTelephone : Phone number of the assessor, used to contact the assessor
     * @param function : The function of the assessor, specifying what the assessor can do at the meeting
     */
    protected Assessor(String assessorName, int assessorTelephone, String function)
    {
        this.assessorName = assessorName;
        this.assessorTelephone = assessorTelephone;
        this.function = function;
    }

    @Override
    public String getAssessorName() {
        return assessorName;
    }

    @Override
    public int getAssessorTelephone() {
        return assessorTelephone;
    }

    @Override
    public String getFunction() {
        return function;
    }

    @Override
    public void setAssessorTelephone(int assessorTelephone) {
        this.assessorTelephone = assessorTelephone;
    }

    @Override
    public void setFunction(String function) {
        this.function = function;
    }
}
