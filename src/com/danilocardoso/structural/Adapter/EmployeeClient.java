package com.danilocardoso.structural.Adapter;

import java.util.ArrayList;
import java.util.List;
import com.danilocardoso.structural.Adapter.EmployeeAdapterLdap;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        return employees;
    }
}
