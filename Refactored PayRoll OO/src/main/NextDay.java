package main;

import Employee.Employee;
import utils.Agenda;
import utils.Day;

import java.util.ArrayList;

public class NextDay implements StrategyMenu {
    Agenda currentAgenda = new Agenda();
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        int weekDay = systemDate.getWeekDay(true);
        int day = systemDate.getDay();
        int month = systemDate.getMonth(true);
        if (weekDay == 7) {
            systemDate.setWeekDay(1);
        }
        if (weekDay >= 1 && weekDay < 7) {
            systemDate.setWeekDay(weekDay + 1);
        }
        if (day == systemDate.monthsDays[month]) { // Last Month Day
            systemDate.setDay(1);
            if (month == 12) {
                systemDate.setMonth(1);
                systemDate.setYear(systemDate.getYear() + 1);
            } else {
                systemDate.setMonth(systemDate.getMonth(true) + 1);
            }
        } else {
            systemDate.setDay(systemDate.getDay() + 1); // New Day }
            for (Employee e : employeeList) {
                if (e.agenda.getPayType() == 2) {
                    int payDay = 0;
                    int[] array = e.agenda.getMonthsDays();
                    if ((array[systemDate.getMonth(true)] - systemDate.getDay()) == 2) {
                        payDay = currentAgenda.LastWorkDay(systemDate);
                        e.setPayDay(payDay);
                    }
                }
            }
        }
    }
}

