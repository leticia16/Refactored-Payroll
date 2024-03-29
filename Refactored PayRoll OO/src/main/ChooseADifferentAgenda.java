package main;

import Employee.Employee;
import utils.Day;
import utils.Exceptions;
import utils.Prints;
import utils.SingletonPrint;

import java.util.ArrayList;

public class ChooseADifferentAgenda implements StrategyMenu {
    Prints print = SingletonPrint.getInstance();

    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        System.out.println("|||| Choose A Different Agenda");
        System.out.println("--> List Of Agendas:");
        int i = 0;
        i = printAgenda(agendasList);
        System.out.println("Choose a number of Agenda");
        int choice = Exceptions.inputIntegerBounds(1, i);
        int weeklyType = 0;
        int weekDay = 0;
        int monthDay = 0;
        for (int[] aux_ : agendasList) {
            if (aux_[3] == choice) {
                choice = aux_[0];
                if (aux_[0] == 1) {
                    weeklyType = aux_[1];
                    weekDay = aux_[2];
                    break;
                } else if (aux_[0] == 2) {
                    monthDay = aux_[1];
                }
            }
        }
        setAgenda(employeeList,choice,weeklyType,weekDay,monthDay);
    }

    public int printAgenda(ArrayList<int[]> agendasList) {
        int i = 0;
        for (int[] aux : agendasList) {
            i += 1;
            if (aux[0] == 1) { // Weekly
                System.out.println("(" + aux[3] + ") Weekly | " + aux[1] + " per week | " + aux[2] + " Day Of week");
            } else if (aux[0] == 2) { // Monthly
                System.out.println("(" + aux[3] + ") Monthy | day " + aux[1] + " of all Months |");
            }
        }
        return i;
    }

    public void setAgenda(ArrayList<Employee> employeeList, int choice, int weeklyType, int weekDay, int monthDay){
        System.out.println("--> Employee List:");
        print.printEmployeeList(true, employeeList);
        System.out.println("--> Id of Employee: ");
        int id = Exceptions.inputInteger();
        boolean flag = false;
        int aux_id = 0;
        for (Employee e : employeeList) {
            aux_id = e.getId();
            if (aux_id == id) {
                if (choice == 1) { // Weekly
                    e.agenda.setWeekly(weeklyType, weekDay);
                    e.agenda.setPayType(1);
//                    break;
                }
                if (choice == 2) {
                    e.agenda.setMonthly(monthDay);
                    e.agenda.setPayType(2);
//                    break;
                }
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("The employee was not found!");
        }
    }
}
