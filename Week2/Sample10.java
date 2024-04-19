package Week2;
class Sample{
    int i_val=10; 
    Sample(int i_val){
        this.i_val=i_val; //this keyword is used to refer to the current object
        System.out.println(" i val is :"+this.i_val); //this keyword is used to refer to the current object
    }

    }

public class Sample10 {
    int is_val=10;  //instance variable
    public static void main(String[] args) {
        Sample o = new Sample(); //object creation of class Sample (here it has no parameter)
    }
}