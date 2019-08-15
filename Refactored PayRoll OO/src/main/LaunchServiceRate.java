package main;

import Employee.*;
import utils.Day;
import utils.Exceptions;
import utils.Prints;
import utils.SingletonPrint;

import java.util.ArrayList;

public class LaunchServiceRate implements StrategyMenu {
    Prints print = SingletonPrint.getInstance();
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        boolean flag = false;
        System.out.println("|||| SERVICE RATE - SYNDICATE");
        System.out.println("--> Syndicate Employee List");
        print.printEmployeeList(0,employeeList);
        System.out.println("--> Syndicate ID: ");
        int id = Exceptions.inputInteger();
        for (Employee e: employeeList) {
            int aux = e.getSyndicateID();
            if(aux == id){
                System.out.println("--> ExtraSyndicateRate (0.0 ~ 1.0): ");
                e.setExtraSyndicateRate(Exceptions.inputDoubleBounds(0.0,1.0));
                System.out.println("successful operation");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("The Employee isn't part of Syndicate!");
        }
    }
}
