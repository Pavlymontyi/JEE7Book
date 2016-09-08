package com.kraynov.javaee7.ch03.contraints;

import com.kraynov.javaee7.ch03.contraints.impl.URLValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {URLValidator.class})
@Target({FIELD, METHOD, ANNOTATION_TYPE, PARAMETER, CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface URL {
    String message() default "Malformed URL";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String protocol() default "";
    String host()     default "";
    int port()        default -1;
}
