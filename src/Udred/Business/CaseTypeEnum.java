/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Business;

import Acq.ICaseTypeEnum;

/**
 *
 * @author Linea Hoffmann
 */
public enum CaseTypeEnum implements ICaseTypeEnum {

    PHYSICALDISABILITY("social"),
    SOCIALISSUES("physical"),
    PSYCHOLOGICAL("psychology");

    private String caseType;

    CaseTypeEnum(String caseType) {
        this.caseType = caseType;
    }

    @Override
    public String toString() {
        return caseType;
    }
}
