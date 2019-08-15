package main;

import Employee.*;
import utils.*;

import java.util.ArrayList;

public class EditEmployee implements StrategyMenu{
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
            EmployeeIterator employeeIterator = new EmployeeIterator(employeeList);
            int id = Exceptions.inputInteger();
            int i = 0;
            while(employeeIterator.hasNext()){
                Employee e = ((Employee)employeeIterator.next());
                int aux = e.getId();
                if (aux == id) {
                    show.showEditOptions();
                    int op = Exceptions.inputIntegerBounds(1, 5);
                    flag_aux = true;
                    EditOptions editOp = EditOptions.values()[op - 1]; //enum
                    StrategyEdit edit = editOp.optionEdit(); // interface catch the swicht
                    edit.edit(e,employeeList);
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
    }
}
