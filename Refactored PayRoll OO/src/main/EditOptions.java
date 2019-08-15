package main;

public enum EditOptions {
    CHANGENAME{
            public StrategyEdit optionEdit(){
                return new ChangeName();
            }
    },
    CHANGEADDRESS{
            public StrategyEdit optionEdit(){
                return new ChangeAddress();
            }
    },
    CHANGESALARY{
        public StrategyEdit optionEdit(){
            return new ChangeSalary();
        }
    },
    CHANGESYNDICATE{
        public StrategyEdit optionEdit(){
            return new ChangeSyndicate();
        }
    },
    CHANGEEMPLOYEETYPE{
        @Override
        public StrategyEdit optionEdit() {
            return new ChangeEmployeeType();
        }
    };

    public abstract StrategyEdit optionEdit();
}
