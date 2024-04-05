 class Employee {
     int id;
     int salary;
     String name;
     public void printDetails(){
         System.out.println("My id is " +id);
         System.out.println("My name is " +name);
         System.out.println("My salary is " +salary);
     }
     public int getSalary() {
         return salary;
     }
 }
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");

        Employee hello = new Employee();
        hello.name = "Ankit";
        hello.id = 12;
        hello.salary =60;

        hello.printDetails();
        int salary = hello.salary;
        //System.out.println(hello.id);
        //System.out.println(hello.name);
    }
}
