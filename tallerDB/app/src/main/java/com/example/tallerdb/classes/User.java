package com.example.tallerdb.classes;

import android.widget.SeekBar;

public class User {
    private int document;
    private String user;
    private String names;
    private String lastnames;
    private String email;
    private String pass;

    public User() {

    }
    public User(int document, String user, String names,String lastnames, String email, String pass){
        this.document = document;
        this.user = user;
        this.names = names;
        this.lastnames = lastnames;
        this.email = email;
        this.pass = pass;
    }
    public int getDocument() { return document; }
    public void setDocument(int document) { this.document = document; }
    public String getUser(){ return user; }
    public void setUser(String user) { this.user = user; }
    public String getNames(){ return names; }
    public void setNames(String names) { this.names = names; }
    public String getLastnames(){ return lastnames; }
    public void setLastnames(String lastnames) { this.lastnames = lastnames; }
    public String getEmail(){ return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPass(){ return pass; }
    public void setPass(String pass){ this.pass = pass; }

    @Override
    public String toString(){
        return  "Document: " + document +
                ", User: " + user + '\'' +
                ", Names: " + names + '\'' +
                ", Lastnames: " + lastnames + '\'' +
                ", E-mail: " + email + '\'' +
                ", Pass=*****'  '";
    }
}
