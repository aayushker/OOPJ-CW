package Week2;
class Static{
    Static(){ // Constructor
        System.out.println("Within static block");
    }

    static{ // Static block
        System.out.println("Within 1st static block");
    }
    static void m1(){ // Static method
        System.out.println("Within static method");
    }

    static{ // Static block
        System.out.println("Within 2nd static block");
    }
}

public class staticStudy {
    public static void main(String[] args) {


        System.out.println("Within main"); // Main method
        Static x = new Static(); // Object creation
        Static.m1(); // Calling static method
    }
    static{
        System.out.println("Within 3rd static block"); // Static block
    }
}
