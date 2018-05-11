/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

/**
 *
 * @author Linea Hoffmann
 */
public class Assessor
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

    public String getAssessorName() {
        return assessorName;
    }

    public int getAssessorTelephone() {
        return assessorTelephone;
    }

    public String getFunction() {
        return function;
    }

    public void setAssessorTelephone(int assessorTelephone) {
        this.assessorTelephone = assessorTelephone;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
