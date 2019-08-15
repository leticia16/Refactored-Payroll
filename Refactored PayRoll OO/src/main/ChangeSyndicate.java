package main;

import Employee.Employee;
import utils.Exceptions;

import java.util.ArrayList;

public class ChangeSyndicate implements StrategyEdit {
    public void edit(Employee e, ArrayList<Employee> employeeList){
        System.out.println("__________________________________");
        System.out.println("--> Is employee part of Syndicate?");
        System.out.println("type:   (0) NO  |  (1) Yes");
        e.setSyndicate(Exceptions.inputIntegerBounds(0,1));
        if(e.getSyndicate() == 1){
            System.out.println("--> Union Fee (0.0 ~ 1.0):");
            e.setUnionFee(Exceptions.inputDoubleBounds(0.0,1.0));
            e.setSyndicateID(e.getId()*6);
        }
    }
}
