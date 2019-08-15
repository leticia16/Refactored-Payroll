package main;

import Employee.*;
import utils.*;

import java.util.ArrayList;

public class ChangeToHourly implements StrategyChangeEmployeeType {
    Copy copy = new Copy();
    public void change(Employee e,ArrayList<Employee> employeeList){
        Employee newHourly = new Hourly();
        copy.copyEmployee(e,newHourly);
        newHourly.setEmployeeType(1);
//                                    Agenda a = new Agenda();
        newHourly.agenda.setWeekly(1,6);
//                                    newHourly.setAgenda(a);
        Hourly oo = (Hourly) newHourly;
        System.out.println("--> Hourly Salary:");
        oo.setGrossSalary(Exceptions.inputDouble());
        oo.setCardPoint(0);
        newHourly.setAlreadyPaid(false);
        employeeList.remove(e);
        employeeList.add(newHourly);
    }
}
