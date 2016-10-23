package arey.es.tema2_hoja7;

/**
 * Created by ireneyera on 23/10/16.
 */

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " - " + author;
    }
}
