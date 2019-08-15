package utils;

public class SingletonPrint {
    public static Prints firstInstance = null;

    public static Prints getInstance(){
        if(firstInstance == null){
            firstInstance = new Prints();
        }
        return firstInstance;
    }
}
