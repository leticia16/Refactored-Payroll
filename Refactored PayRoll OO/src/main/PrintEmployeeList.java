package main;

import Employee.Employee;
import utils.Day;
import utils.Prints;
import utils.SingletonPrint;

import java.util.ArrayList;

public class PrintEmployeeList implements StrategyMenu {
    Prints print = SingletonPrint.getInstance();
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        print.printEmployeeList(employeeList);
    }
}
