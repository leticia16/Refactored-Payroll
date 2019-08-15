package main;

import Employee.*;
import utils.Day;
import utils.Exceptions;
import utils.Prints;
import utils.SingletonPrint;

import java.util.ArrayList;

public class LaunchACardPoint implements StrategyMenu{
    Prints print = SingletonPrint.getInstance();
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        int id;
        boolean alert = false;
        boolean flag = true;
        System.out.println("|||| CARD POINT");
        System.out.println("--> Hourly Employee List");
        print.printEmployeeList(true,1,employeeList);
        System.out.println("--> ID of Hourly Employee: ");
        while (flag){ // Find Hourly Employee
            id = Exceptions.inputInteger();
            for (Employee e: employeeList) {
                int aux = e.getId();
                int i = e.getEmployeeType();
                if(aux == id){
                    if(i != 1) {
                        System.out.println("The Employee isn't Hourly, type a valid ID: ");
                        alert = true;
                        break;
                    }
                    else{
                        Hourly b = (Hourly)e;
                        b.setCardPoint(b.makeCardPoint()+ b.getCardPoint());
                        alert = true;
                        flag = false;
                    }
                }
            }
            if(!alert){
                System.out.println("The Employee isn't Hourly!");
                flag = false;
            }
            else { System.out.println("successful operation"); }
        }
    }
}
