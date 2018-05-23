
package Acq;

import Udred.Business.AccessLevelEnum;

/**
 *
 * @author JogGez
 */
public interface IAccessLevelEnum 
{
    String getCode();   
    String getText();
    public static AccessLevelEnum getByCode(String accessLevelCode) {
        for (AccessLevelEnum g : AccessLevelEnum.values()) {
            if (g.getCode().equals(accessLevelCode)) {
                return g;
            }
        }
        return null;
    }
}
