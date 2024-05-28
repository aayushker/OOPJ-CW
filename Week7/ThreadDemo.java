package Week7;
public class ThreadDemo extends Thread{
    public void run(){
        for (int counter=1; counter<=100; counter++){
            System.out.println("Thread is running...");
        }
    }

    public static void main (String args[]){
        ThreadDemo threadDemo = new ThreadDemo();
        Thread t1 = new Thread(threadDemo);
        t1.start();
    }
}