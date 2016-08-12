package entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {

    @NotNull
    private String title;
    @NotNull @Min(2)
    private Float price;
    @Size(max = 2000)
    private String description;
    private String isbn;
    private Integer nbOfPage;

}
