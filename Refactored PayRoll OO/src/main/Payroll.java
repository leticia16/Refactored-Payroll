package main;

import Employee.*;
import utils.Day;

import java.util.ArrayList;

public class Payroll implements StrategyMenu {
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        System.out.println("|||| PAYROLL");
        for (Employee e: employeeList) {
            switch (e.agenda.getPayType()){
                case 1:
                    if(((e.agenda.getWeeklyType() - e.agenda.getWeeklyIterator()) == 0 ) && e.agenda.getWeeDay() == systemDate.getWeekDay(true)){
                        if(!e.getAlreadyPaid()){
                            pay(e);
                            e.agenda.setWeeklyIterator(1);
                            e.setAlreadyPaid(true);
                        }
                    }
                    else{
                        e.agenda.setWeeklyIterator(e.agenda.getWeeklyIterator()+1);
                    }
                    break;
                case 2:
                    int[] array = e.agenda.getMonthsDays();
                    if(e.agenda.getMonthlyDay() == 0){ // Last work Day
                        int payDay = 0;
                        if(e.getPayDay() == systemDate.getDay()){
                            if(!e.getAlreadyPaid()){
                                pay(e);
                                e.setAlreadyPaid(true);
                            }
                        }
                    }
                    if(e.agenda.getMonthlyDay()>=1 && e.agenda.getMonthlyDay()<=array[systemDate.getMonth(true)]){ // Others agendas
                        if(e.agenda.getMonthlyDay() == systemDate.getDay()){
                            if(!e.getAlreadyPaid()){
                                pay(e);
                                e.setAlreadyPaid(true);
                            }
                        }

                    }
                    break;
            }
        }
    }
    public  void pay(Employee e){
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
