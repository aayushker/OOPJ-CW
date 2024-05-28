package Week7;
public class ThreadInfo extends Thread{
    public void run() {
        System.out.println("Thread is running...");
        // Thread.currentThread().setName("Thor");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread());  
        // for (int c=1; c<=100; c++){
        //     Thread.currentThread().setPriority(c%10!=0 ? c%10 : 10);
        //     System.out.println(Thread.currentThread());
        // }  
    }

    public static void main(String args[]) {
        ThreadInfo threadDemo1 = new ThreadInfo();
        ThreadInfo threadDemo2 = new ThreadInfo();
        ThreadInfo threadDemo3 = new ThreadInfo();

        // threadDemo1.setPriority(3);
        // threadDemo2.setPriority(6);
        // threadDemo3.setPriority(9);
        
        threadDemo1.start();
        threadDemo2.start();
        threadDemo3.start();
        
        try{
            threadDemo1.join();
            threadDemo2.join();
            threadDemo3.join();  
        }
        catch (InterruptedException e){
            System.out.println("The exception is: " +e);
        }
       
    }
}
