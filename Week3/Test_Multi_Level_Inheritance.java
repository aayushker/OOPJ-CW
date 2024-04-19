package Week3;
class Employee extends Object { } // Employee class extends Object class
class Manager extends Employee { } // Manager class extends Employee class
class Director extends Manager { } // Director class extends Manager class

// Test_Multi_Level_Inheritance.java
// Java program to demonstrate multi-level inheritance

public class Test_Multi_Level_Inheritance{
    public static void salary(Object obj){
        if(obj instanceof Employee){ // if obj is an instance of Employee
            System.out.println("Employee salary"); // Employee salary
        }
        else if(obj instanceof Manager){ // if obj is an instance of Manager
            System.out.println("Manager salary"); // Manager salary
        }
        else if(obj instanceof Director){ // if obj is an instance of Director
            System.out.println("Director salary"); // Director salary
        }
        else{ // if obj is not an instance of any of the above classes
            System.out.println("Invalid object");
        }
    }
    public static void main(String[] args) { 
        // Test_Multi_Level_Inheritance.salary(new Employee());
        // Test_Multi_Level_Inheritance.salary(new Manager());
        // Test_Multi_Level_Inheritance.salary(new Director());

        // System.out.println("Employee object e is created ");
        Employee e = new Employee(); // Employee object e is created
        // System.out.println("Manager object m is created ");
        Manager m = new Manager(); // Manager object m is created
        // System.out.println("Director object d is created ");
        Director d = new Director(); // Director object d is created

        System.out.println("salary of employee e is ");
        salary(e); // salary of employee e is
        // Employee salary
        System.out.println("salary of manager m is ");
        salary(m); // salary of manager m is
        // Manager salary
        System.out.println("salary of director d is");
        salary(d); // salary of director d is
        // Director salary
    }
}
