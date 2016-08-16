package com.kraynov.javaee7.ch3.entities;

import com.kraynov.javaee7.ch3.contraints.URL;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ItemServerConnection {
    @URL
    private String resourceURL;
    @NotNull
    @URL(protocol = "http", host = "www.cdbookstore.com")
    private String itemURL;
    @URL(protocol = "ftp", port = 21)
    private String ftpServerURL;
    private Date lastConnectionDate;
// Конструкторы, геттеры, сеттеры
}
