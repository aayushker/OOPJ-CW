package Week5;
public class ExceptDemo {
    public static void main(String[] args) {
        int x;
        int a;
        try {
            x = 0;
            a = 22/x;
            System.out.println("This will be bypassed");
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
        System.out.println("After catch statement");
    }
}
