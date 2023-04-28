package books;

import java.util.Date;
import java.util.UUID;

public class Book {
    protected String bookId, title, author, publisher;
    protected Date createAt, updatedAt;

    public Book (String title, String author, String publisher) {
        bookId = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        createAt = new Date();
    }
}
