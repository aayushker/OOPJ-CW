package Week6;
import java.io.*;
class ThrowsDemo {
    static void throwOne() throws FileNotFoundException{
        System.out.println("Inside throwOne");
        throw new FileNotFoundException();
    }
    public static void main(String args[]){
        try {
            throwOne();
        }
        catch(FileNotFoundException e){
            System.out.println("Caught " + e);
        }
    }
}