package main;

import Employee.Employee;
import Employee.EmployeeType;
import utils.Day;
import utils.Exceptions;

import java.util.ArrayList;

public class AddEmployee implements StrategyMenu{
    public void menu(ArrayList<int[]> agendasList, Day systemDate,ArrayList<Employee> employeeList){
        System.out.println("|||| ADD EMPLOYEE");
        System.out.println("Select the Employee type:");
        System.out.println("(1) Hourly | (2) Commissioned | (3) Salaried");
        int op = Exceptions.inputIntegerBounds(1,3);
        EmployeeType employeeType = EmployeeType.values()[op -1]; // EmployeeType is an Enum with HOURLY, COMISSIONED and SALARIED
        Employee newEmployee = employeeType.buildEmployee(systemDate, employeeList.size()+1);
        employeeList.add(newEmployee);
    }
}
