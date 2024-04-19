package Week2;
// Create a class box that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the box are width, height, depth. The class should have a method that can return the volume of the box.
//  Create an object of the box class and test the functionalities.

class Box{
    int w,h,d;
    Box(int a, int b, int c){
        h=a;
        w=b;
        d=c;
        volume();
    }
    void volume(){
    System.out.println("Volume of box is: "+w*h*d);
}
}

public class constructorQ {
    public static void main(String[] args) {
        Box s1 = new Box(10, 20, 30);
        Box s2 = new Box(40, 50, 60);
    }
}
