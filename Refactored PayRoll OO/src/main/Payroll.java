package main;

import Employee.*;
import utils.*;

import java.util.ArrayList;

public class Payroll implements StrategyMenu {
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        EmployeeIterator employeeIterator = new EmployeeIterator(employeeList);
        System.out.println("|||| PAYROLL");
        while(employeeIterator.hasNext()){
            Employee e = ((Employee)employeeIterator.next());
            PayRollOptions PRop = PayRollOptions.values()[e.agenda.getPayType()-1];
            StrategyPayRoll payRoll = PRop.optionPayRoll();
            payRoll.runPayroll(e,systemDate);
        }
    }
    public static void pay(Employee e){
        int type = e.getEmployeeType();
        switch (type){
            case 1:
                ((Hourly)e).payHourly(e);
                break;
            case 2:
                ((Commissioned)e).payCommissioned(e);
                break;
            case 3:
                ((Salaried)e).paySalaried(e);
                break;
        }
    }

}
