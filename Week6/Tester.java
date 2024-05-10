package Week6;
import java.io.*;

class Plane{
    public Plane() throws IOException, RuntimeException {
        System.out.println("Plane");
    }
}

class Jet extends Plane{
    public Jet() throws IOException, RuntimeException{
        System.out.println("Jet");
    }
}

public class Tester {
    public static void main(String[] args) throws IOException {
        new Plane();
    }
}