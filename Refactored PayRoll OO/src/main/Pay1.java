package main;

import Employee.Employee;
import utils.Day;

public class Pay1 implements StrategyPayRoll {
    public void runPayroll(Employee e, Day systemDate){
        if(((e.agenda.getWeeklyType() - e.agenda.getWeeklyIterator()) == 0 ) && e.agenda.getWeeDay() == systemDate.getWeekDay(true)){
            if(!e.getAlreadyPaid()){
                Payroll.pay(e);
                e.agenda.setWeeklyIterator(1);
                e.setAlreadyPaid(true);
            }
        }
        else{
            e.agenda.setWeeklyIterator(e.agenda.getWeeklyIterator()+1);
        }
    }

}
