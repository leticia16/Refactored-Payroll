package utils;

public class ShowOptions {
    public  void showEditOptions(){
        System.out.println("--> Choose an option to edit:");
        System.out.println("(1) Name");
        System.out.println("(2) Street Address");
        System.out.println("(3) Salary");
        System.out.println("(4) Syndicate");
        System.out.println("(5) Type of Employee");
    }
    public  void showMenuOptions(Day systemDate){
        System.out.println("___________________________________________________________");
        System.out.println(" ||||||||||||||||||    PAYROLL SYSTEM    ||||||||||||||||||");
//        if(start){
//            systemDate = systemDate.SystemDate();
//            System.out.println("___________________________________________________________");
//        }
        System.out.println("    "+ systemDate.getWeekDay() +", "+ systemDate.getMonth()+" "+ systemDate.getDay()+" of "+  systemDate.getYear()+ "     ");
        System.out.println(" %%%%%  System Features  %%%%%% ");
        System.out.println("(1)  Add Employee");
        System.out.println("(2)  Remove Employee");
        System.out.println("(3)  Launch a Card Point");
        System.out.println("(4)  Launch a Sales Result");
        System.out.println("(5)  Launch a Service Rate");
        System.out.println("(6)  Edit an Employee");
        System.out.println("(7)  Run PayRoll");
//        System.out.println("(8)  Undo");
//        System.out.println("(9)  Redo");
        System.out.println("(8) Show Employee's List");
        System.out.println("(9) End of the working day");
        System.out.println("(10) Choose A Different Agenda");
        System.out.println("(11) New Agenda");
        System.out.println("(0)  Exit ");
        System.out.println("---> Choose a Feature:");
    }
}
