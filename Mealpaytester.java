public class Mealpaytester {
    public static void main(String[] args){
        Manager m = new Manager();

        System.out.println("Adding New Students");
        m.addStudents("James");
        m.addStudents("Joe");
        m.addStudents("John");
        m.addStudents("Jake");

        System.out.println("Displaying all students");
        m.getallStudents();
        System.out.println(" ");
        System.out.println("Adding Funds");
        m.addCash(3, 4, 100, 1);
        m.addCash(1, 7, 80, 2);
        m.addCash(7, 21, 35, 3);
        m.addCash(11, 30, 5, 4);

        System.out.println("Displaying all students and their new balances");
        m.getallStudents();
        System.out.println(" ");
        System.out.println("Logging new Meals");
        m.logMeal(3, 10, 1);
        m.logMeal(4, 24, 2);
        m.logMeal(9, 15, 3);
        m.logMeal(1, 16, 4);

        System.out.println("Displaying new balances: ");
        m.getallStudents();
        System.out.println(" ");
        System.out.println("Everyone gets hungry and decides to go out for a Christmas Eve lunch before flying home to enjoy the holidays");
        
        m.logMeal(12, 24, 1);
        m.logMeal(12, 24, 2);
        m.logMeal(12, 24, 3);
        m.logMeal(12, 24, 4);
        System.out.println("Displaying Post-lunch balances: ");
        m.getallStudents();
        System.out.println(" ");
        System.out.println("Displaying all of the transactions made on 12/24: ");
        System.out.println(m.transactionsByDay(12, 24));
System.out.println(" ");
        System.out.println("Looking up student with ID number of 2:");
        m.getSpecific(2);
System.out.println(" ");
        System.out.println("As the schoolyear continues, the students continue to make purchases");
        m.logMeal(2, 29, 1);
        m.logMeal(3, 31, 2);
        m.logMeal(4, 5, 3);
        m.logMeal(7, 18, 4);
        m.logMeal(3, 10, 1);
        m.logMeal(6, 24, 2);
        m.logMeal(9, 15, 3);
        m.logMeal(4, 10, 4);
        m.logMeal(6, 24, 1);
        m.logMeal(4, 31, 2);
        m.logMeal(9, 11, 3);
        m.logMeal(1, 16, 4);
        m.logMeal(9, 5, 1);
        m.logMeal(10, 4, 2);
        m.logMeal(11, 3, 3);
        m.logMeal(12, 29, 4);
        System.out.println(" ");
        System.out.println("By the end of the schoolyear, the students have to pay their dues. Displaying all students with negative balances and their transactions: ");
        m.getallNegativeStudents();
        System.out.println(" ");
        System.out.println("Final time displaying all students and transactions: ");
        m.getallStudents();
    }
    



}
