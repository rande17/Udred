/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.Address;

/**
 *
 * @author niemeijeren
 */
public interface IGuardian {

    int getGuardianCPR();

    String getGuardianName();

    int getGuardianTelephone();

    IAddress getGuardianaddress();

    void setGuardianTelephone(int guardianTelephone);

    void setGuardianaddress(IAddress address);
    
}
