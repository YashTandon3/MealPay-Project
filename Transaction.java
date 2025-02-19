import java.util.*;
public class Transaction{
    private int amount = 0;
    private int month = 0;
    private int day = 0; 
    


    public Transaction(int myamount, int mymonth, int myday){
        amount = myamount;
        month = mymonth;
        day = myday;
    }


    public int getAmount(){
        return amount;
    }

    public int getMonth(){
        return month;
    }


    public int getDay(){
        return day;
    }

    public String toString(){
        return month + "/" + day + ": $" + amount;
    }







    
}