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

        System.out.println("Adding Funds");
        m.addCash(3, 4, 80, 1);
        m.addCash(1, 7, 16, 2);
        m.addCash(7, 21, 10, 3);
        m.addCash(11, 30, 5, 4);

        System.out.println("Displaying all students");
        m.getallStudents();
    }



}
