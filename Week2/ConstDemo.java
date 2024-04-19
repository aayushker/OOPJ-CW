package Week2;

class sample{
    private int id;
    sample(){
        id = 101;
        System.out.println("Deafult Constructor, with id "+id);
    }
    sample(int id){
        this.id = id; // this keyword is used to refer to the current object
        System.out.println("One argument Constructor, with id "+id);
    }
}

public class ConstDemo {
    public static void main(String[] args) {
        sample s1 = new sample(); // Default constructor
        sample s2 = new sample(102); // One argument constructor
    }    
}
