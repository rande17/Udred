/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acq;

import Udred.Business.Address;
import Udred.Business.Guardian;

/**
 *
 * @author niemeijeren
 */
public interface IPartRepresentive {

    Guardian getGuardian();

    Address getPartRepresentiveAddress();

    int getPartRepresentiveCPR();

    String getPartRepresentiveName();

    int getPartRepresentiveTelephone();

    void setGuardian(Guardian guardian);

    void setPartRepresentiveAddress(Address partRepresentiveAddress);

    void setPartRepresentiveName(String partRepresentiveName);

    void setPartRepresentiveTelephone(int partRepresentiveTelephone);
    
}
