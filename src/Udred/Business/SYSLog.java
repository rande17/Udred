
package Udred.Business;

import Acq.ICase;
import Acq.SYSLogAnnotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JogGez
 */
public class SYSLog
{
    public static List<String> compareFields(ICase caseOpend, ICase caseSaved) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{

        List<String> resultList = new ArrayList<String>();
        Field[] fields = caseOpend.getClass().getDeclaredFields();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for(Field field : fields){
            field.setAccessible(true);

            if(!field.get(caseOpend).equals(field.get(caseSaved))){

                String result = sdf.format(new Date());

                if (field.isAnnotationPresent(SYSLogAnnotation.class)) {
                    result.concat(" - Ændring i \"" + field.getAnnotation(SYSLogAnnotation.class).name());
                }
                else{
                    result.concat(" - Ændring i \"" + field.getName());
                }

                result.concat( "\" - Gammel Værdi: " + field.get(caseOpend).toString() +
                        " - Ny Værdi: " + field.get(caseSaved).toString());

                resultList.add(result);
                System.out.println(result);

            }
        }
        return resultList;
    }
    
    public static Field[] getAllFields(Class currentClass) {
        List<Field> fields = new ArrayList<Field>();
        
        fields.addAll(Arrays.asList(currentClass.getDeclaredFields()));
        if (currentClass.getSuperclass() != null) {
            fields.addAll(Arrays.asList(getAllFields(currentClass.getSuperclass())));
        }
        return fields.toArray(new Field[] {});
    }

    public void addLoginToSyslog(){

    }
}
