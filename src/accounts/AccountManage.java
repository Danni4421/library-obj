package accounts;

import java.util.ArrayList;

public class AccountManage {
    public ArrayList<Person> listAccount;

    public AccountManage() {
        listAccount = new ArrayList<Person>();
    }

    public boolean checkDataLogin(String id, String pass) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).id.equals(id)) {
                if (listAccount.get(i).getPassword().equals(pass)) {
                    return true;
                }
            } else {
            }
        }
        return false;
    }
}
