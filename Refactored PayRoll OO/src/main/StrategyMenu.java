package main;

import Employee.Employee;

import java.util.ArrayList;
import utils.Day;
public interface StrategyMenu {
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList);
}
