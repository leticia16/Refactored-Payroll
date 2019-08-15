package main;

import Employee.Employee;
import utils.Exceptions;

import java.util.ArrayList;

public class ChangeAddress implements StrategyEdit {
    public void edit(Employee e, ArrayList<Employee> employeeList){
        System.out.println("____________________");
        System.out.println("--> Street Address: ");
        e.setAdress(Exceptions.inputString());
    }
}
