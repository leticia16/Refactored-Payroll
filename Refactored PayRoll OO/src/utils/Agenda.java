package utils;

import java.util.ArrayList;

public class Agenda {
    public static  int[] monthsDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static String[] weekdaysDictionary = {"0","Sunday","Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
    public static String[] monthsDictionary = {"0","January","February","March","April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public int weeklyType;
    public int weeDay;
    public boolean flag;
    public int weeklyIterator;
    public int payType;
    public int monthlyDay;

    public void setWeekly(int type, int weekDay){
        this.payType = 1;
        this.weeklyType = type;
        this.weeklyIterator = 1;
        if(type > 1){
            flag = false;
        }
        else {
            flag = true;
        }
        this.weeDay = weekDay;
    }



    public void setMonthly(int monthlyDay){
        this.payType = 2;
        this.monthlyDay = monthlyDay;
    }
    public  int LastWorkDay(Day systemDate){
        int currentDay = systemDate.getWeekDay(true);
//        if((monthsDays[systemDate.getMonth(true)] - currentDay) == 3){
        if(currentDay == 6){
            return systemDate.getDay(); // current
        }
        if(currentDay >= 2 && currentDay <= 4){
            return systemDate.getDay()+2; // Last
        }
        if(currentDay == 1 || currentDay == 7){
            return systemDate.getDay()+2; // Last
        }
        if(currentDay == 5){
            return systemDate.getDay()+1; // Middle
        }
        else {
            return 0;
        }
    }

    public void creatAgendasList(ArrayList<int[]> agendasList){
        int[] new_agenda = {1,1,6,1};
        agendasList.add(new_agenda);
        int[] new_agenda_2 = {1,2,6,2};
        agendasList.add(new_agenda_2);
        int[] new_agenda_3 = {2,0,0,3};
        agendasList.add(new_agenda_3);
    }

// _____________________________________________________

    public void setMonthsDays(int[] monthsDays) {
        Agenda.monthsDays = monthsDays;
    }
    public  int[] getMonthsDays() {
        return monthsDays;
    }

    public int getWeeklyType() {
        return weeklyType;
    }

    public void setWeeklyType(int weeklyType) {
        this.weeklyType = weeklyType;
    }

    public int getWeeDay() {
        return weeDay;
    }

    public void setWeeDay(int weeDay) {
        this.weeDay = weeDay;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getWeeklyIterator() {
        return weeklyIterator;
    }

    public void setWeeklyIterator(int weeklyIterator) {
        this.weeklyIterator = weeklyIterator;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getMonthlyDay() {
        return monthlyDay;
    }

    public void setMonthlyDay(int monthlyDay) {
        this.monthlyDay = monthlyDay;
    }
}
