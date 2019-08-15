package main;

import Employee.*;
import utils.*;

import java.util.ArrayList;

public class EditEmployee implements StrategyMenu {
    Prints print = SingletonPrint.getInstance();
    ShowOptions show =  SingletonShowOptions.getInstance();
    Copy copy = new Copy();
    public void menu(ArrayList<int[]> agendasList, Day systemDate, ArrayList<Employee> employeeList) {
        boolean flag = true, flag_aux = false;
        System.out.println("|||| EDIT EMPLOYEE");
        System.out.println("--> Employee List");
        print.printEmployeeList(true,employeeList);
        System.out.println("--> ID of Employee: ");
        while (true) {
            int id = Exceptions.inputInteger();
            int i = 0;
            for (i = 0; i<employeeList.size(); i++) {
                Employee e = employeeList.get(i);
                int aux = e.getId();
                if (aux == id) {
                    show.showEditOptions();
                    int op = Exceptions.inputIntegerBounds(1, 5);
                    flag_aux = true;
                    switch (op) {
                        case 1:
                            System.out.println("__________");
                            System.out.println("--> Name: ");
                            e.setName(Exceptions.inputString());
                            break;
                        case 2:
                            System.out.println("____________________");
                            System.out.println("--> Street Address: ");
                            e.setAdress(Exceptions.inputString());
                            break;
                        case 3:
                            System.out.println("____________");
                            System.out.println("--> Salary: ");
                            e.setGrossSalary(Exceptions.inputDouble());
                            //Salary
                            break;
                        case 4:
                            System.out.println("__________________________________");
                            System.out.println("--> Is employee part of Syndicate?");
                            System.out.println("type:   (0) NO  |  (1) Yes");
                            e.setSyndicate(Exceptions.inputIntegerBounds(0,1));
                            if(e.getSyndicate() == 1){
                                System.out.println("--> Union Fee (0.0 ~ 1.0):");
                                e.setUnionFee(Exceptions.inputDoubleBounds(0.0,1.0));
                                e.setSyndicateID(e.getId()*6);
                            }
                            break;
                        case 5:
                            System.out.println("_________________________");
                            System.out.println("Select the new Employee type:");
                            System.out.println("(1) Hourly | (2) Commissioned | (3) Salaried");
                            int type = Exceptions.inputIntegerBounds(1,3);
                            switch (type){
                                case 1:
                                    Employee newHourly = new Hourly();
                                    copy.copyEmployee(e,newHourly);
                                    newHourly.setEmployeeType(1);
//                                    Agenda a = new Agenda();
                                    newHourly.agenda.setWeekly(1,6);
//                                    newHourly.setAgenda(a);
                                    Hourly oo = (Hourly) newHourly;
                                    System.out.println("--> Hourly Salary:");
                                    oo.setGrossSalary(Exceptions.inputDouble());
                                    oo.setCardPoint(0);
                                    newHourly.setAlreadyPaid(false);
                                    employeeList.remove(e);
                                    employeeList.add(newHourly);
                                    break;
                                case 2:
                                    Employee newCommissioned = new Commissioned();
                                    copy.copyEmployee(e,newCommissioned);
                                    newCommissioned.setEmployeeType(2);
//                                    Agenda aa = new Agenda();
                                    newCommissioned.agenda.setWeekly(2,6);
//                                    newCommissioned.setAgenda(a);
                                    Commissioned o = (Commissioned) newCommissioned;
                                    System.out.println("--> Commission Rate (0.0 ~ 1.0):");
                                    o.setComissionRate(Exceptions.inputDoubleBounds(0.0,1.0));
                                    System.out.println("--> Commissioned Salary:");
                                    o.setGrossSalary(Exceptions.inputDouble());
                                    newCommissioned.setAlreadyPaid(false);
                                    employeeList.remove(e);
                                    employeeList.add(newCommissioned);
                                    break;
                                case 3:
                                    Employee newSalaried = new Salaried();
                                    copy.copyEmployee(e,newSalaried);
                                    System.out.println("--> Salaried Salary:");
                                    newSalaried.setGrossSalary(Exceptions.inputDouble());
                                    newSalaried.setEmployeeType(3);
//                                    Agenda aaa = new Agenda();
                                    newSalaried.agenda.setMonthly(0);
//                                    newSalaried.setAgenda(a);
                                    newSalaried.setAlreadyPaid(false);
                                    employeeList.remove(e);
                                    employeeList.add(newSalaried);
                                    break;
                            }
                            break;
                    }
                }
            }
            if(!flag_aux){
                System.out.println("The employee was not found!");
                break;
            }
            else {
                System.out.println("successful operation");
                return;
            }

        }
    }
}
