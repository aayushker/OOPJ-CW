package Week7;
public class ThreadRunner implements Runnable{
    public void run(){
        System.out.println("Thead runnbale is used here");
    }

    public static void main(String[] args) {
        ThreadRunner obj = new ThreadRunner();        
    }
}