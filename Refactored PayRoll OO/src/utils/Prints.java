package utils;

import Employee.*;
import main.EmployeeIterator;
//import menu.Menu;

import java.util.ArrayList;

public class Prints {
    public  void printEmployeeList(boolean flag, ArrayList<Employee> employeeList){
        EmployeeIterator employeeIterator = new EmployeeIterator(employeeList);
        if(flag){
            while(employeeIterator.hasNext()){
                Employee a = ((Employee)employeeIterator.next());
                System.out.println("____________________");
                System.out.println("Name: " + a.getName());
                System.out.println("ID: " + a.getId());
            }
        }
        System.out.println("____________________");
    }
    public  void printEmployeeList(boolean flag, int type,ArrayList<Employee> employeeList){
        EmployeeIterator employeeIterator = new EmployeeIterator(employeeList);
        int aux;
        if(flag){
            while(employeeIterator.hasNext()){
                Employee a = ((Employee)employeeIterator.next());
                aux = a.getEmployeeType();
                if(aux == type) {
                    System.out.println("____________________");
                    System.out.println("Name: " + a.getName());
                    System.out.println("ID: " + a.getId());
                }
            }
        }
        System.out.println("____________________");
    }
    public  void printEmployeeList(int aux,ArrayList<Employee> employeeList){
        EmployeeIterator employeeIterator = new EmployeeIterator(employeeList);
        while(employeeIterator.hasNext()){
            Employee a = ((Employee)employeeIterator.next());
            aux = a.getSyndicate();
            if(aux == 1) {
                System.out.println("____________________");
                System.out.println("Name: " + a.getName());
                System.out.println("Syndicate ID: " + a.getSyndicateID());
            }
        }
        System.out.println("____________________");
    }

    public  void printEmployeeList(ArrayList<Employee> employeeList){
        EmployeeIterator employeeIterator = new EmployeeIterator(employeeList);
        while(employeeIterator.hasNext()){
            Employee a = ((Employee)employeeIterator.next());
            System.out.println("____________________");
            System.out.println("Name: "+a.getName());
            System.out.println("Address: "+a.getAdress());
            System.out.println("ID: "+a.getId());
            System.out.println("Salary: "+a.getGrossSalary());
            System.out.println("Type: "+a.getEmployeeType());
            System.out.println("Syndicate: "+a.getSyndicate());
            System.out.println("Syndicate ID: "+a.getSyndicateID());
            System.out.println("UnionFee: "+a.getUnionFee());
            System.out.println("SyndiRate: "+a.getExtraSyndicateRate());
            System.out.println("Payment Type: "+a.agenda.getPayType());
            //CAST
            switch (a.getEmployeeType()){
                case 1: // Hourly
                    Hourly aux = (Hourly) a;
                    System.out.println("CardPoint: "+aux.getCardPoint());
                    break;
                case 2: // commissioned
                    Commissioned aux2 = (Commissioned) a;
                    System.out.println("CommissionRate: "+aux2.comissionRate);
                    System.out.println("Value Sale: "+aux2.getValueSale());
                    System.out.println("Day Sale: "+aux2.getDateSale());
            }
        }

    }
}
