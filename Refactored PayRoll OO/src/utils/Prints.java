package utils;

import Employee.*;
//import menu.Menu;

import java.util.ArrayList;

public class Prints {

    public  void printEmployeeList(boolean flag, ArrayList<Employee> employeeList){
        if(flag){
            for (Employee a: employeeList) {
                System.out.println("____________________");
                System.out.println("Name: " + a.getName());
                System.out.println("ID: " + a.getId());
            }
        }
        System.out.println("____________________");
    }
//    public  void printEmployeeList(boolean flag,ArrayList<Employee> employeeList){
//        if(flag){
//            for (Employee a: employeeList) {
//                System.out.println("____________________");
//                System.out.println("Name: " + a.getName());
//                System.out.println("ID: " + a.getId());
//            }
//        }
//        System.out.println("____________________");
//    }
    public  void printEmployeeList(boolean flag, int type,ArrayList<Employee> employeeList){
        int aux;
        if(flag){
            for (Employee a: employeeList) {
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
        for (Employee a: employeeList) {
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
        for (Employee a: employeeList) {
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
                case 1:
                    Hourly aux = (Hourly) a;
                    System.out.println("CardPoint: "+aux.getCardPoint());
                    break;
                case 2:
                    Commissioned aux2 = (Commissioned) a;
                    System.out.println("CommissionRate: "+aux2.comissionRate);
                    System.out.println("Value Sale: "+aux2.getValueSale());
                    System.out.println("Day Sale: "+aux2.getDateSale());
            }

        }
        System.out.println("____________________");
    }
}
