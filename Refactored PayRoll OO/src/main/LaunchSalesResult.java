package main;

import Employee.*;
import utils.Day;
import utils.Exceptions;
import utils.Prints;

import java.util.ArrayList;

public class LaunchSalesResult implements StrategyMenu {
    Prints print = new Prints();
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        int id;
        boolean alert = false;
        boolean flag = true;
        System.out.println("|||| SALES RESULT");
        System.out.println("--> Commissioned Employee List");
        print.printEmployeeList(true,2,employeeList);
        System.out.println("--> ID of Commissioned Employee: ");
        while (flag){
            id = Exceptions.inputInteger();
            for (Employee e: employeeList) {
                int aux = e.getId();
                int i = e.getEmployeeType();
                if(aux == id){
                    if(i != 2) {
                        System.out.println("The Employee isn't Commissioned, type a valid ID: ");
                        alert = true;
                        break;
                    }
                    else{
                        Commissioned b = (Commissioned) e;
                        b.salesResult(systemDate, b);
                        alert = true;
                        flag = false;
                    }
                }
            }
            if(!alert){
                System.out.println("The Employee isn't Commissioned! ");
                flag = false;
            }
            else {
                System.out.println("successful operation");
            }
        }
    }
}
