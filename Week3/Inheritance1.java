package Week3;

import A;
import B;

class A{
    int m, n;

    A(int m, int n){   
        this.m = m;
        this.n = n;
    }
    void displayl(){
    System.out.println("m and n are:"+m+" "+n);
    }
}
    
class B extends A{ 
    B(int m, int n, int c) {
    super(m,n);
    this.c = c;
    }

    int c;
    void display2() {
    System.out.println("c:" + c);
    }
    
    void sum() {
    System.out.println("m+n+c = " + (m+n+c));
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        
        A s1 = new A(3,6);  
        B s2 = new B(4, 8, 9);

        s1.m = 10; s1.n = 20;

        System.out.println("State of object A:");
        s1.displayl();
        s2.m = 7; s2 .n = 8; s2.c = 9;
        System.out.println("State of object B:");
        s2.displayl();
        s2.display2();
        System.out.println("Sum of m, n and c in object B is:");
        s2.sum();
    }   
}

// This code snippet demonstrates the concept of inheritance. The class A has two member variables m and n and a method displayl() to display the values of m and n. 
// The class B extends class A and has an additional member variable c and two methods display2() and sum(). In the main method, objects of class A and B are created and their member variables are initialized and displayed. 
// The sum of m, n, and c in object B is also calculated and displayed. This code snippet demonstrates the concept of inheritance in Java.

// Output:
// State of object A:
// m and n are:10 20
// State of object B:
// m and n are:7 8
// c:9
// Sum of m, n and c in object B is:24

// Inheritance in Java is a mechanism in which one class acquires the properties and behaviors of another class. It allows for code reusability and promotes the concept of hierarchical relationships between classes.
// Inheritance is implemented using the extends keyword in Java. In the given code snippet, class B extends class A, which means that class B inherits the properties and behaviors of class A. 
// This allows class B to access the member variables and methods of class A. In the main method, objects of class A and B are created, and their member variables are initialized and displayed. This demonstrates how inheritance allows for code reuse and promotes the concept of hierarchical relationships between classes.