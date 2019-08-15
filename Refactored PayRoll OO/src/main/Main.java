package main;
import Employee.*;
import utils.*;

//import menu.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import utils.ShowOptions;
public class Main {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
//        Stack<Menu> undo = new Stack<Menu>();
//        Stack<Menu> redo = new Stack<Menu>();
        ArrayList<int[]> agendasList = new ArrayList<int[]>();
        Day systemDate = new Day(true);
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        ShowOptions show = SingletonShowOptions.getInstance();
        Agenda agenda = new Agenda();
        int op = 1; // To print the Menu Program
        boolean start = true;
        agenda.creatAgendasList(agendasList);
        show.showMenuOptions(systemDate);
        while ((op = Exceptions.inputIntegerBounds(0, 14)) != 0) {
//            op = Exceptions.inputIntegerBounds(0, 14); // SEE NEW BOUND
            MenuOption Option = MenuOption.values()[op - 1]; // enum
            StrategyMenu menu = Option.optionMenu(); // interface
            menu.menu(agendasList, systemDate, employeeList);
            show.showMenuOptions(systemDate);
        }
    }
}
//            if (option == 0) {
//                break;
//            }
//            switch (option) {
//                case 1:
////                    undo.push(menu.copyMenu(menu));
//                    menu.addEmployee();
//                    break;
//                case 2:
////                    undo.push(menu);
//                    menu.removeEmployee();
//                    break;
//                case 3:
////                    undo.push(menu);
//                    menu.launchCardPoint();
//                    break;
//                case 4:
////                    undo.push(menu);
//                    menu.launchSalesResult();
//                    break;
//                case 5:
////                    undo.push(menu);
//                    menu.launchServiceRate();
//                    break;
//                case 6:
////                    undo.push(menu);
//                    menu.editEmployee();
//                    break;
//                case 7:
////                    undo.push(menu);
//                    menu.payRoll();
//                    break;
////                case 8: //Undo
//////
////                    Menu menuRedo = new Menu();
////                    menuRedo = menuRedo.copyMenu(menu);
////                    redo.push(menuRedo);
////                    Menu menuUndo = undo.pop();
////                    menu = menu.copyMenu(menuUndo);
////                    break;
////                case 9: //Redo
////                    Menu menuRedo_ = new Menu();
////                    Menu menuUndo_ = new Menu();
//////                    menuUndo_
////                    undo.push(menuUndo_);
////                    menuRedo_ = redo.pop();
////                    menu.copyMenu(menu);
////                    break;
//                case 10:
//                    menu.printEmployeeList();
//                    break;
//                case 11:
////                    undo.push(menu);
//                    menu.nextDay();
//                    break;
//                case 12:
//                    menu.chooseADifferentAgenda(agendasList);
//                   break;
//                case 13:
//                    menu.newAgenda(agendasList);
//                    break;
//            }
//        }

//    }

//}
