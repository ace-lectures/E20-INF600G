package ca.uqam.info.inf600g.services;

import ca.uqam.info.inf600g.model.Account;

import java.net.URL;

public class AccountDescription {

    public final String identifier;
    public final String name;
    public final URL avatar;

    public AccountDescription(Account origin) {
        this.identifier = origin.getIdentifier();
        this.avatar = origin.getAvatar();
        this.name = origin.getName();
    }

}
