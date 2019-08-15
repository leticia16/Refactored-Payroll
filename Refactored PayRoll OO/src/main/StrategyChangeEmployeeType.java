package main;

import Employee.Employee;

import java.util.ArrayList;

public interface StrategyChangeEmployeeType {
    public void change(Employee e, ArrayList<Employee> employeeList);
}
