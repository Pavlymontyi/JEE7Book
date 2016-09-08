package com.kraynov.javaee7.ch02.decor;

import com.kraynov.javaee7.ch02.numbergen.NumberGenerator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class FromEightToThirteenDigitsDecorator implements NumberGenerator {

    @Inject @Delegate
    NumberGenerator numberGenerator;

    @Override
    public String generateNumber() {
        String issn = numberGenerator.generateNumber();
        String isbn = "13-84356"+issn.substring(1);
        return isbn;
    }
}
