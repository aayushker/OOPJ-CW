package questions;
import java.util.*;

abstract class Person{
    String name = new String();
    String email = new String();
    String course = new String();
    String branch = new String();
    int mobile;   
}

class Enquiry extends Person{
    int regno;

    void setReg(int reg){
        this.regno = reg;
    }
    int getReg(){
        return this.regno;
    }

}

class Student extends Person{
    int rollno;

    
}

class Alumni extends Person{
    int rollno;
    String company = new String();
    String department = new String();
    String designation = new String();
}

public class q2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Enquiry p1 = new Enquiry();
        Student p2 = new Student();
        Alumni p3 = new Alumni();
        Student s1 = new Student();
        s1.branch = "Ai";
        s1.course = "Btech";
        s1.email = "abc.com";
        s1.mobile = 13524645;
        s1.rollno = 34;
    }
}
