package books;

import java.util.ArrayList;
import java.util.Comparator;

public class BooksManage {
    public ArrayList<Book> listBook;

    public BooksManage () {
        listBook = new ArrayList<Book>();
    }

    public void showData () {
        for (int i = 0; i < listBook.size(); i++) {
            System.out.println("ID : " + listBook.get(i).bookId);
            System.out.println("Title : " + listBook.get(i).title);
            System.out.println("Author : " + listBook.get(i).author);
            System.out.println("Publisher : " + listBook.get(i).publisher);
            System.out.println();
        }
    }

    public void sort (String sortBy) {

    }
}
