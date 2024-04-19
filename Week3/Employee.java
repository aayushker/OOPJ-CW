class Employees {

    int Employeeno;
    String Empname;

    Employees() {

        System.out.println(" Employee No-arg Constructor Begins");
        Employeeno = 0;
        Empname = null;
        System.out.println(" Employee No-arg Constructor Ends");
    }

    Employees (int Employeeno){

        System.out.println(" Employee 1-arg Constructor Begins")
        this. Employeeno = Employeeno;
        this.Empname= "UNKNOWN";
        System.out.println(" Employee 1-arg Constructor Ends");
    }
}

class Manager extends Employees{
    String deptname;

    Manager (int Employeeno, String name, String deptname){
        super(Employeeno);
        System.out.println(" Manager 3-arg Constructor Begins");
        this.deptname = deptname;
        System.out.println(" Manager 3-arg Constructor Ends");
    }
}

public class Employee{
 public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employees emp2 = new Employees(123);
        System.out.println("Employeeno: " + emp1.Employeeno);
        System.out.println("Empname: " + emp1.Empname);
        System.out.println("Employeeno: " + emp2.Employeeno);

 }   
}

//class object constructor (read below)
// In Java, a constructor is a block of code similar to a method that's called when an instance of an object is created. 
// Here are the key differences between a constructor and a method:
// A constructor doesn't have a return type.
// The name of the constructor must be the same as the name of the class.
// A constructor is called automatically when an object is created.
// A constructor is used to initialize the state of an object.
// A constructor is called only once per object.
// A method is used to expose the behavior of an object.
// A method can be called multiple times per object.
// A method must be called explicitly.
// In this program, we have a class Employee with two constructors: a no-argument constructor and a one-argument constructor.
// The no-argument constructor initializes the instance variables Employeeno and Empname to default values.
// The one-argument constructor initializes the instance variable Employeeno to the value passed as an argument and the instance variable Empname to "UNKNOWN".
// In the main() method, we create an object of the Employee class using both constructors and print the values of the instance variables.
// Output:
// Employee No-arg Constructor Begins
// Employee No-arg Constructor Ends
// Employee 1-arg Constructor Begins
// Employee 1-arg Constructor Ends
// Employeeno: 0
// Empname: UNKNOWN
// Employeeno: 123
// Empname: UNKNOWN
// In this example, the no-argument constructor is called when the first object is created and the one-argument constructor is called when the second object is created.
// The values of the instance variables Employeeno and Empname are printed for both objects.
// The output shows that the no-argument constructor initializes the instance variables to default values, while the one-argument constructor initializes the instance variables with the specified values.
// This program demonstrates how to create and use constructors in Java.