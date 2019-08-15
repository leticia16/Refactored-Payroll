package main;

import Employee.Employee;
import utils.Exceptions;

import java.util.ArrayList;

public class ChangeName implements StrategyEdit {
    public void edit(Employee e, ArrayList<Employee> employeeList){
        System.out.println("__________");
        System.out.println("--> Name: ");
        e.setName(Exceptions.inputString());
    }
}
