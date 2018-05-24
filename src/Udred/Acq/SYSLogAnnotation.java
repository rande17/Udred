package Udred.Acq;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *
 * @author JogGez
 */
@Target(ElementType.FIELD)
public @interface SYSLogAnnotation
{
    String name();
}
