package Week7Prob;

import Week7.ThreadDemo1;

public class Q1 {
      public void run(){
        System.out.println("Thread is running...");
        System.out.println(Thread.currentThread().getName());
    }

public static void main(String args[]){
    ThreadDemo1 threadDemo1 = new ThreadDemo1();
    ThreadDemo1 threadDemo2 = new ThreadDemo1();
    threadDemo1.setName("Scooby");
    threadDemo2.setName("Shaggy");
    threadDemo1.start();
    threadDemo2.start();
}
}
