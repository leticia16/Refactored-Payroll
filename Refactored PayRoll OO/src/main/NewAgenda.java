package main;

import Employee.Employee;
import utils.Day;
import utils.Exceptions;

import java.util.ArrayList;

public class NewAgenda implements StrategyMenu {
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        System.out.println("|||| New Agenda");
        System.out.println("--> Select the Payment Type \n (1)Weekly | (2)Monthly");
        int choice = Exceptions.inputIntegerBounds(1,2);
        int frequency;
        int weekDay;
        int dayMonth;
        if(choice == 1){ // Weekly
            System.out.println("--> Type the frequency ( 1 ~3)");
            frequency = Exceptions.inputIntegerBounds(1,3);
            System.out.println("--> type the week day of Payment ( 1 ~ 7)");
            weekDay = Exceptions.inputIntegerBounds(1,7);
            int[] new_agenda = {1,frequency,weekDay,agendasList.size()+1};
            agendasList.add(new_agenda);
        }
        else {
            System.out.println("--> Type the day of month:");
            dayMonth = Exceptions.inputIntegerBounds(1,31);
            int[] new_agenda_ = {2,dayMonth,0,agendasList.size()+1};
            agendasList.add(new_agenda_);
        }
        System.out.println("successful operation");
    }
}
