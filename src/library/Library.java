package library;

import accounts.AccountManage;
import accounts.Person;
import books.Book;
import books.BooksManage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Library {
    public boolean libraryStatus;
    public AccountManage manageAccounts;
    public BooksManage manageBooks;
    public Person login;

    public Library () throws IOException, ParseException {
        manageAccounts = new AccountManage();
        manageBooks = new BooksManage();
        login = new Person();
        libraryStatus = true;
        parseJsonData();
    }

    private void parseJsonData () throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(".\\json-files\\data.json");
        Object resObj = parser.parse(reader);
        JSONObject resultParse = (JSONObject) resObj;
        JSONObject getData = (JSONObject) resultParse.get("data");
        addJSONAccounts((JSONArray) getData.get("accounts"));
        addJSONBooks((JSONArray) getData.get("books"));
    }

    private void addJSONAccounts(JSONArray el) {
        for (int i = 0; i < el.size(); i++) {
            JSONObject res = (JSONObject) el.get(i);
            String NIS = (String) res.get("NIS");
            String id = (String) res.get("id");
            String name = (String) res.get("name");
            String password = (String) res.get("password");
            manageAccounts.listAccount.add(new Person(NIS, id, name, password));
        }
    }

    private void addJSONBooks(JSONArray el) {
        for (int i = 0; i < el.size(); i++) {
            JSONObject res = (JSONObject) el.get(i);
            String title = (String) res.get("title");
            String author = (String) res.get("author");
            String publisher = (String) res.get("publisher");
            manageBooks.listBook.add(new Book(title, author, publisher));
        }
    }

    public boolean userLogin(String id, String pass) {
        if (manageAccounts.checkDataLogin(id, pass)) {
            System.out.println("Berhasil Login");
            return true;
        } else {
            System.out.println("Informasi yang Anda masukkan tidak valid!!");
            return false;
        }
    }
}
