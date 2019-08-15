package main;

import Employee.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeIterator implements Iterator<Object> {
    public ArrayList<Employee> employeeList;
    public int iterator = 0;

    public EmployeeIterator(ArrayList<Employee> employeeList)
    {
        this.employeeList = employeeList;
    }
    @Override
    public boolean hasNext() {
        if(iterator >= employeeList.size()) {
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        Employee e = employeeList.get(iterator);
        iterator++;
        return e;
    }
}
