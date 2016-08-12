package com.kraynov.javaee7.contraints.impl;

import com.kraynov.javaee7.contraints.ChronologicalDates;
import entities.Order;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ChronologicalDatesValidator implements ConstraintValidator<ChronologicalDates, Order> {
    @Override
    public void initialize(ChronologicalDates chronologicalDates) {}

    @Override
    public boolean isValid(Order order, ConstraintValidatorContext constraintValidatorContext) {
        return order.getCreationDate().getTime() < order.getPaymentDate().getTime() &&
               order.getPaymentDate().getTime()  < order.getDeliveryDate().getTime();
    }
}
