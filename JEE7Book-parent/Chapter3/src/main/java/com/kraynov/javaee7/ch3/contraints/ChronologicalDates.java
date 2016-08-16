package com.kraynov.javaee7.ch3.contraints;

import com.kraynov.javaee7.ch3.contraints.impl.ChronologicalDatesValidator;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ChronologicalDatesValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ChronologicalDates {
}
