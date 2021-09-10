package com.company;

public class User {

    private String name;
    private String password;
    private String login;       //email
    private String users[] = new String[100];
    private int id = 0;

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

    public void addUser(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
        for(int i = 0; i < users.length; i++){
            users[id] = this.name + ", " + this.login + ", " + this.password;
            id++;
        }
    }

    public void showUsers(){
        for(int i = 0; i < users.length; i++){
            System.out.println(users[i]);
        }
    }
}
