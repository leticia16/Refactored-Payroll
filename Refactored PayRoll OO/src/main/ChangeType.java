package main;

import Employee.Hourly;

public enum ChangeType {
    HOURLY{
        public StrategyChangeEmployeeType optionType(){
            return new ChangeToHourly();
        }
    },
    COMMISSIONED{
        public StrategyChangeEmployeeType optionType(){
            return new ChangeToCommissioned();
        }
    },
    SALARIED{
        public StrategyChangeEmployeeType optionType(){
            return new ChangeToSalaried();
        }
    };
    public abstract StrategyChangeEmployeeType optionType();

}
