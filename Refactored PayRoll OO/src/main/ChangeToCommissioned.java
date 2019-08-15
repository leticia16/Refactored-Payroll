package main;

import Employee.*;
import utils.Copy;
import utils.Exceptions;

import java.util.ArrayList;

public class ChangeToCommissioned implements StrategyChangeEmployeeType {
    Copy copy = new Copy();
    public void change(Employee e, ArrayList<Employee> employeeList){
        Employee newCommissioned = new Commissioned();
        copy.copyEmployee(e,newCommissioned);
        newCommissioned.setEmployeeType(2);
//                                    Agenda aa = new Agenda();
        newCommissioned.agenda.setWeekly(2,6);
//                                    newCommissioned.setAgenda(a);
        Commissioned o = (Commissioned) newCommissioned;
        System.out.println("--> Commission Rate (0.0 ~ 1.0):");
        o.setComissionRate(Exceptions.inputDoubleBounds(0.0,1.0));
        System.out.println("--> Commissioned Salary:");
        o.setGrossSalary(Exceptions.inputDouble());
        newCommissioned.setAlreadyPaid(false);
        employeeList.remove(e);
        employeeList.add(newCommissioned);
    }
}
