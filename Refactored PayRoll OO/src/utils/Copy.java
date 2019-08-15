package utils;

import Employee.Employee;

public class Copy {
    public  void copyEmployee(Employee old, Employee new_){
        new_.setName(old.getName());
        new_.setId(old.getId());
        new_.setAdress(old.getAdress());
        new_.setGrossSalary(old.getGrossSalary());
        new_.setSyndicate(old.getSyndicate());
        new_.setUnionFee(old.getUnionFee());
        new_.setExtraSyndicateRate(old.getExtraSyndicateRate());
        new_.setPayDay(old.getPayDay());
        new_.setFinalSalary(old.getFinalSalary());
        new_.setSyndicateID(old.getSyndicateID());
        new_.setAlreadyPaid(old.getAlreadyPaid());
        new_.setAgenda(old.getAgenda());
    }
}
