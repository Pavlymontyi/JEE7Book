package bookservice;

import bookservice.logging.Loggable;
import bookservice.numbergen.NumberGenerator;
import bookservice.numbergen.ThirteenDigits;

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
