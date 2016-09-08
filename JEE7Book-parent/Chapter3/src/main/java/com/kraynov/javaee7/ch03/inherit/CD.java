package com.kraynov.javaee7.ch03.inherit;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

public class CD extends Item {

    @Pattern(regexp = "[A-Z][a-z]{1,}")
    private String musicCompany;

    @Max(value = 5)
    private Integer numberOfCDs;
    private Float totalDuration;

    private String genre;
    // ConstraintDeclarationException : не допускается при переопределении метода
    public Float calculatePrice(@DecimalMin("1.4") Float rate) {
        return price * rate;
    }

}
