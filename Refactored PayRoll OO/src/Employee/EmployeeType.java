package Employee;
import Employee.Hourly;
import Employee.Commissioned;
import Employee.Salaried;
import utils.Day;

public enum EmployeeType {
    HOURLY {
        public Employee buildEmployee(Day systemDate, int size){
            return new Hourly(systemDate,size);
        }
    },
    COMMISSIONED {
        public Employee buildEmployee(Day systemDate, int size){
            return new Commissioned(systemDate,size);
        }
    },
    SALARIED {
        public Employee buildEmployee(Day systemDate, int size){
            return new Salaried(systemDate,size);
        }
    };

    public abstract Employee buildEmployee(Day systemDate, int size);

}
