package com.company;

public class User {

    private static int maxId = 0;
    private String name;
    private int id;
    private String password;
    private String login;       //email
    private String users[] = new String[100];

    public User(String name, String login, String password){
        maxId--;
        maxId++;
        id = maxId;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public static int getMaxId() {
        return maxId;
    }
}
