package com.kraynov.javaee7.ch03.entities;

import com.kraynov.javaee7.ch03.contraints.Email;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    @Email
    private String userId;
    @NotNull @Size(min=4, max=50, message = "Имя должно быть от {min} до [max] симолов")
    private String firstName;
    private String lastName;
    @Email(message = "Восстановленный электронный адрес не является действительным")
    private String recoveryEmail;
    private String phoneNumber;
    @Min(value = 18, message = "Покупатель слишком молод. Ему должно быть больше {value} лет")
    private Integer age;
}
