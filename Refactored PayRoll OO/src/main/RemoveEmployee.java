package main;

import Employee.Employee;
import utils.*;
import utils.Exceptions;

import java.util.ArrayList;

public class RemoveEmployee implements StrategyMenu {
    Prints print = SingletonPrint.getInstance();
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        int aux;
        boolean alert = true;
        System.out.println("|||| REMOVE EMPLOYEE");
        System.out.println("--> Employee List:");
        print.printEmployeeList(true,employeeList);
        System.out.println("--> Id of Employee: ");
        int id = Exceptions.inputInteger();
        for (Employee e: employeeList) {
            aux = e.getId();
            if(aux == id){
                alert = false;
                employeeList.remove(e);
                break;
            }
        }
        if(alert){ System.out.println("The employee was not found!"); }
        else { System.out.println("successful operation"); }
    }
}
