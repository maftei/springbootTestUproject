package com.db.learn.SpringLearnUdemy.domain;

public class User {

    public String username;
    public String password;

    public User(){
        this.username="";
        this.password="";
    }
    public User(String username, String password) throws Exception {
        setUsername(username);
        this.password=password;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username) throws Exception {
        if (username!=""){
            this.username=username;
        }
        else throw new Exception("ERROR the username must be not empty");
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password) throws Exception {
        if(password!=""){
            this.password=password;
        }
        else throw new Exception("ERROR password must be not empty");
    }
}
