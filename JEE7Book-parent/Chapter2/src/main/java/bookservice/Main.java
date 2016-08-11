package bookservice;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello world from maven");
        Weld weld = new Weld();
        WeldContainer c = weld.initialize();
        BookService bs = c.instance().select(BookService.class).get();
        Book b = bs.createBook("JavaEE7", 1000f, "Gonzales");
        System.out.println("Main: book is created: "+b);
    }
}
