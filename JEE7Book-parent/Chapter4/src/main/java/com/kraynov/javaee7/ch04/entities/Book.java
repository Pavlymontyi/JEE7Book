package com.kraynov.javaee7.ch04.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b"),
        @NamedQuery(name = "findBookH2G2", query = "SELECT b FROM Book b WHERE b.title ='H2G2'")
})
public class Book {
    @Id @GeneratedValue
    private Long id;
    @NotNull
    private String title;
    private Float price;
    @Size(min = 10, max = 2000)
    private String description;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;


    public Book(String title, String description, float price, String isbn, int nbOfPage, boolean illustrations) {
        this.title = title;
        this.price = price;
        this.isbn = isbn;
        this.description = description;
        this.nbOfPage = nbOfPage;
        this.illustrations = illustrations;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public Float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }
}
