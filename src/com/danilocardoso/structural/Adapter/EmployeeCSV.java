package com.danilocardoso.structural.Adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String emailaddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public EmployeeCSV(String values){
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()){
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()){
            firstname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()){
            lastname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()){
            emailaddress = tokenizer.nextToken();
        }



    }
}
