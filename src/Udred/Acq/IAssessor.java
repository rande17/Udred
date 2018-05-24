/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Acq;

/**
 *
 * @author niemeijeren
 */
public interface IAssessor {

    String getAssessorName();

    int getAssessorTelephone();

    String getFunction();

    void setAssessorTelephone(int assessorTelephone);

    void setFunction(String function);
    
}
