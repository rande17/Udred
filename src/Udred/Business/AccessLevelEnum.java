
package Udred.Business;

import Acq.IAccessLevelEnum;

/**
 *
 * @author JogGez
 */
public enum AccessLevelEnum implements IAccessLevelEnum
{
LEVEL0("0", "No Access"), LEVEL1("1", "Some Access"), LEVEL2("2", "More Access"), LEVEL3("3", "Even More Access"), LEVEL4("4", "SUPER USER ACCESS");
 
   private String code;
   private String text;
 
   private AccessLevelEnum(String code, String text) {
       this.code = code;
       this.text = text;
   }
 
@Override
   public String getCode() {
       return code;
   }
 
@Override
   public String getText() {
       return text;
   }

   public static AccessLevelEnum getByCode(String accessLevelCode) {
       for (AccessLevelEnum g : AccessLevelEnum.values()) {
           if (g.code.equals(accessLevelCode)) {
               return g;
           }
       }
       return null;
   }
 
   @Override
   public String toString() {
       return this.text;
   }
}
