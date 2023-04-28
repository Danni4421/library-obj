package library;

import accounts.AccountManage;
import books.BooksManage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Library {
    protected boolean libraryStatus;
    protected AccountManage manageAccounts;
    protected BooksManage manageBooks;

    public Library () throws IOException, ParseException {
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

    }

    private void addJSONBooks(JSONArray el) {

    }
}
