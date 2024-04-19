package Week2;
// package Week2;
class Sample {
    Sample(){
        this("Java");
        System.out.println("Default Constructor ");
    }
    Sample(String str){
        System.out.println("One Argument Constructor : "+str);
    }    
}

public class sample {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample("Hello");
    }
}