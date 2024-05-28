package Week7;
// a very simple demo creating threads by extending thread class
public class ThreadDemo1 extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }


public static void main(String args[]){
    ThreadDemo1 threadDemo = new ThreadDemo1();
    threadDemo.start();
}
}