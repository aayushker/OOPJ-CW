package questions;

public class q3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Outside the catch block");
        
    }
}
