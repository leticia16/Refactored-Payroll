package main;

import Employee.Employee;
import utils.Exceptions;

import java.util.ArrayList;

public class ChangeSalary implements StrategyEdit {
    public void edit(Employee e, ArrayList<Employee> employeeList){
        System.out.println("____________");
        System.out.println("--> Salary: ");
        e.setGrossSalary(Exceptions.inputDouble());
    }
}
