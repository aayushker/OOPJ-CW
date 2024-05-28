package questions;

abstract class Beverage{
    int temp;
    int serve;
    int price;
    abstract void prepare();
    abstract void serve();
    abstract void price();
}

class Coffee extends Beverage{
    void prepare(){
        System.out.println("Coffee is prepared");
    }
    void serve(){
        System.out.println("coffee served");
    }
    void price(){
        System.out.println("Price of coffee is "+ 400);
    }
}

class Tea extends Beverage{
    void prepare(){
        System.out.println("Tea");
    }
    void serve(){
        System.out.println("tea served");
    }
    void price(){
        System.out.println("Price of tea is" + 20);
    }
}

public class q9 {
    public static void main(String[] args) {
        Coffee c = new Coffee();
        System.out.println(c.price);
        System.out.println(c.serve);
        // System.out.println(c.prepare);

    }
}
