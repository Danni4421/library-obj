package accounts;

import java.util.Date;

public class Person {
    public String NIS, id, name;
    private String password;
    public double denda;
    protected Date createdAt, updatedAt;

    public Person (String NIS, String id, String name, String password) {
        this.NIS = NIS;
        this.id = id;
        this.name = name;
        this.password = password;
        this.denda = 0;
        createdAt = new Date();
    }

    public Person() {}

    public String getPassword() {
        return password;
    }
}
