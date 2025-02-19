import java.util.*;

public class Student {
    private String name;
    private int id;
    private double balance;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;

//constructor
public Student(String myName){
    name = myName;
    balance = 0;
    id = idGen;
    idGen++;
    transactions = new ArrayList<Transaction>();
}


//all the fun methods
public void chargeLunch(int month, int day){
    balance -= 7;
    Transaction t = new Transaction(month, day, -7);
    transactions.add(t);
}



    public String toString(){
        return "Name: " + name + "ID: " + "Balance " + balance + " Transactions: " + transactions.toString();
    }
}
