import java.util.*;
public class Manager {
    //fields
    ArrayList<Student> students;

    public Manager(){
        students = new ArrayList<Student>();
    }

    public String transactionsByDay(int month, int day){
        String s = "";
        for(Student st : students){
            ArrayList<Transaction> tByDay = st.getTransactionsByDate(month, day);
            if(tByDay != null){
                s+= tByDay.toString() + " by: " + st.getName() + " ID: " + st.getID();
                s+= "\n";
            }
        }
        return s;
    }
    public void logMeal(int month, int day, int id){
        //loop thru all students and find matching id
        for(int i = 0; i<students.size();i++){
            if(students.get(i).getID() == id){
                students.get(i).chargeLunch(month, day);
            }
        
        }
    }

    public void addCash(int month, int day, int money, int id){
        for(int i = 0; i<students.size(); i++){
            if(students.get(i).getID() == id){
                students.get(i).addFunds(month, day, money);
            }
        }
    }

    public void getallStudents(){
        for(int i = 0; i< students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }

    public void addStudents(String name){
        Student p = new Student(name);
        students.add(p);
    }
    public void getallNegativeStudents(){
        for(int i = 0; i< students.size(); i++){
            if(students.get(i).getBalance()<0)
            System.out.println(students.get(i).toString());
        }
    }

}
