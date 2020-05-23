package ca.uqam.info.inf600g.data;

import ca.uqam.info.inf600g.model.Account;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;


public class AccountsCollection {

    /*******************************************
     * Static access to the account collection *
     *******************************************/

    private static AccountsCollection database;
    public static AccountsCollection getAccess() {
        if (database == null)
            database = new AccountsCollection();
        return database;
    }

    /*******************************************
     * Private construction and data structure *
     *******************************************/

    private Map<String, Account> accounts ;
    private AccountsCollection() {
        this.accounts = new HashMap<>();
        initialize();
    }

    /********************************
     * Account collection interface *
     ********************************/

    public Set<Account> getAllAccounts() {
        return new HashSet<>(this.accounts.values());
    }

    public Optional<Account> getByIdentifier(String identifier) {
        if(this.accounts.containsKey(identifier))
            return Optional.of(this.accounts.get(identifier));
        return Optional.empty();
    }

    /**********************
     * Dummy data for MVP *
     **********************/

    private void initialize() {
        try {
            Account dominique = new Account(
                    "domi",
                    "Dominique",
                    "inf600g",
                    new URL("http://localhost:8080/static/u1.png"));
            this.accounts.put(dominique.getIdentifier(), dominique);
            Account fred = new Account(
                    "fred",
                    "Fred",
                    "g600inf",
                    new URL("http://localhost:8080/static/u2.png"));
            this.accounts.put(fred.getIdentifier(), fred);
        } catch(MalformedURLException e) {
            /** Can't happen, by construction**/
        }
    }

}
