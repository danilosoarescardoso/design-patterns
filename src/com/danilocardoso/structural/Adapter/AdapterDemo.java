package com.danilocardoso.structural.Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        EmployeeDB employeeDb = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employeeList.add(employeeDb);

        EmployeeLdap employeeLdap = new EmployeeLdap("2", "smith", "joe", "mail2");
        // Can't do this, so adapt it
        // employeeList.add(employeeLdap);

        EmployeeAdapterLdap employeeAdapterLdap = new EmployeeAdapterLdap(employeeLdap);
        employeeList.add(employeeAdapterLdap);

        EmployeeCSV employeeFromCSV = new EmployeeCSV("567, Sherlock, Holmes, sherlock@holmes.com");
        employeeList.add(new EmployeeAdapterCSV(employeeFromCSV));

        System.out.println(Arrays.deepToString(employeeList.toArray()));
    }
}
