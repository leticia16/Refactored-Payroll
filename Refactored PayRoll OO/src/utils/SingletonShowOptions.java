package utils;

public class SingletonShowOptions {
    public static ShowOptions firstInstance = null;

    public static ShowOptions getInstance(){
        if(firstInstance == null){
            firstInstance = new ShowOptions();
        }
        return firstInstance;
    }
}
