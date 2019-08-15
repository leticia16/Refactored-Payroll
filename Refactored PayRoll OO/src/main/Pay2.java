package main;

import Employee.Employee;
import utils.Day;

public class Pay2 implements StrategyPayRoll {
    public void runPayroll(Employee e, Day systemDate){
        int[] array = e.agenda.getMonthsDays();
        if(e.agenda.getMonthlyDay() == 0){ // Last work Day
            int payDay = 0;
            if(e.getPayDay() == systemDate.getDay()){
                if(!e.getAlreadyPaid()){
                    Payroll.pay(e);
                    e.setAlreadyPaid(true);
                }
            }
        }
        if(e.agenda.getMonthlyDay()>=1 && e.agenda.getMonthlyDay()<=array[systemDate.getMonth(true)]){ // Others agendas
            if(e.agenda.getMonthlyDay() == systemDate.getDay()){
                if(!e.getAlreadyPaid()){
                    Payroll.pay(e);
                    e.setAlreadyPaid(true);
                }
            }

        }
    }
}
