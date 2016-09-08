package com.kraynov.javaee7.ch02;

import com.kraynov.javaee7.ch02.logging.Loggable;
import com.kraynov.javaee7.ch02.numbergen.NumberGenerator;
import com.kraynov.javaee7.ch02.numbergen.ThirteenDigits;

import javax.inject.Inject;

@Loggable
public class BookService {

    @Inject @ThirteenDigits
    NumberGenerator generator;

    public Book createBook(String title, float price, String author){
        Book book = new Book(title, price, author);
        book.setNumber(generator.generateNumber());
        return book;
    }
}
