package main;

public enum MenuOption {
    ADDEMPLOYEE{
        public StrategyMenu optionMenu(){
            return new AddEmployee();
        }
    },
    REMOVEEMPLOYEE{
        public StrategyMenu optionMenu(){
            return new RemoveEmployee();
        }
    },
    LAUNCHCARDPOINT{
        public StrategyMenu optionMenu(){
            return new LaunchACardPoint();
        }
    },
    LAUNCHSALESRESULT{
        public StrategyMenu optionMenu(){
            return new LaunchSalesResult();
        }
    },
    LAUNCHSERVICERATE{
        public StrategyMenu optionMenu(){
            return new LaunchServiceRate();
        }
    },
    EDITEMPLOYEE{
        public StrategyMenu optionMenu(){
            return new EditEmployee();
        }
    },
    PAYROLL{
        public StrategyMenu optionMenu(){
            return new Payroll();
        }
    },
    PRINTEPLOYEELIST{
        public StrategyMenu optionMenu(){
            return new PrintEmployeeList();
        }
    },
    NEXTDAY{
        public StrategyMenu optionMenu(){
            return new NextDay();
        }
    },
    CHOOSEADIFFERENTAGENDA{
        public StrategyMenu optionMenu(){
            return new ChooseADifferentAgenda();
        }
    },
    NEWAGENDA{
        public StrategyMenu optionMenu(){
            return new NewAgenda();
        }
    };
    public abstract StrategyMenu optionMenu();
}
