package ca.uqam.info.inf600g.model;


import java.net.URL;

public class Account {

    private String identifier;
    private String name;
    private String password;
    private URL avatar;

    public Account(String identifier, String name, String password, URL avatar) {
        this.identifier = identifier;
        this.name = name;
        this.password = password;
        this.avatar = avatar;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public URL getAvatar() {
        return avatar;
    }
}
