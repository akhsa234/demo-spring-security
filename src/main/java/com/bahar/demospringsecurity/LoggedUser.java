package com.bahar.demospringsecurity;

import jakarta.servlet.http.HttpSessionBindingListener;

import java.io.Serializable;

public class LoggedUser implements HttpSessionBindingListener, Serializable {

    private static final long serialVersionUID = -210242898161537655L;
    private String username;
    private ActiveUserStore activeUserStore;
    public LoggedUser(){}

    public LoggedUser(String username, ActiveUserStore activeUserStore) {
        this.username = username;
        this.activeUserStore = activeUserStore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ActiveUserStore getActiveUserStore() {
        return activeUserStore;
    }

    public void setActiveUserStore(ActiveUserStore activeUserStore) {
        this.activeUserStore = activeUserStore;
    }






}
