package main;

import Employee.*;
import utils.Copy;
import utils.Exceptions;

import java.util.ArrayList;

public class ChangeEmployeeType implements StrategyEdit {
    public Copy copy = new Copy();
    public void edit(Employee e, ArrayList<Employee> employeeList){
        System.out.println("_________________________");
        System.out.println("Select the new Employee type:");
        System.out.println("(1) Hourly | (2) Commissioned | (3) Salaried");
        int op = Exceptions.inputIntegerBounds(1,3);
        ChangeType type = ChangeType.values()[op-1];
        StrategyChangeEmployeeType changeType = type.optionType();
        changeType.change(e,employeeList);
    }
}
