package com.danilocardoso.structural.Adapter;

public class EmployeeAdapterCSV  implements Employee{

    public EmployeeCSV instance;

    public EmployeeAdapterCSV (EmployeeCSV instance){
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailaddress();
    }

    public String toString(){
        return "ID: " + instance.getId();
    }
}
