package Week8;

public class LamExp {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from r1");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        //Thread example using lambda expression
        Runnable r2 = () -> {
            System.out.println("Hello from r2");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
