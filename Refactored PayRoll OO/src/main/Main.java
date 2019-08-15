package main;
import Employee.*;
import utils.*;
import java.util.ArrayList;
import java.util.Scanner;
import utils.ShowOptions;
public class Main {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
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
            MenuOption Option = MenuOption.values()[op - 1]; // enum
            StrategyMenu menu = Option.optionMenu(); // interface
            menu.menu(agendasList, systemDate, employeeList);
            show.showMenuOptions(systemDate);
        }
    }
}