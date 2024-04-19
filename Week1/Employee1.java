import java.util.Scanner;

class Employee {
    int emp_id;
    String name;
    void display() {
        System.out.println("Emp Is is: " + emp_id);
        System.out.println("Name Is is: " + name);
    }
}

public class Employee1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s1 = new Scanner(System.in);

        Employee obj = new Employee();
        System.out.println("Enter the employee id:");
        obj.emp_id = s1.nextInt();
        obj.name = s1.next();

        obj.display();
        }
}