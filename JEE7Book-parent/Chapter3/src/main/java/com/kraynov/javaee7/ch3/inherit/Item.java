package com.kraynov.javaee7.ch3.inherit;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Item {

    @NotNull
    protected Long id;
    @NotNull @Size(min = 4, max = 50)
    protected String title;
    protected Float price;
    protected String description;

    @NotNull
    public Float calculateVAT() {
        return price * 0.196f;
    }

    @NotNull
    public Float calculatePrice(@DecimalMin("1.2") Float rate) {
        return price * rate;
    }
}
