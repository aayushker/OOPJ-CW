package questions;


class Student{
    String name = new String();
    int rollno;
    String address = new String();
}

class Btech_Student extends Student{
    String department = new String();
    String sem = new String();

    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.address);
        System.out.println(this.department);
        System.out.println(this.sem);
    }
}

public class q8 {
    public static void main(String[] args) {
        Btech_Student s1 = new Btech_Student();
        s1.address= "Dholakpur";
        s1.department = "AI";
        s1.name = "Bhim";
        s1.rollno = 13;
        s1.sem = "Four";
        s1.display();
    }
}
