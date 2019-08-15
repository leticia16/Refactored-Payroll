package main;

import Employee.Employee;
import utils.Day;

public interface StrategyPayRoll {
    public void runPayroll(Employee e, Day systemDate);
}
