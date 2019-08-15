package main;

import Employee.*;
import utils.Copy;
import utils.Exceptions;

import java.util.ArrayList;

public class ChangeToSalaried implements StrategyChangeEmployeeType {
    Copy copy = new Copy();
    public void change(Employee e, ArrayList<Employee> employeeList){
        Employee newSalaried = new Salaried();
        copy.copyEmployee(e,newSalaried);
        System.out.println("--> Salaried Salary:");
        newSalaried.setGrossSalary(Exceptions.inputDouble());
        newSalaried.setEmployeeType(3);
//                                    Agenda aaa = new Agenda();
        newSalaried.agenda.setMonthly(0);
//                                    newSalaried.setAgenda(a);
        newSalaried.setAlreadyPaid(false);
        employeeList.remove(e);
        employeeList.add(newSalaried);
    }
}
