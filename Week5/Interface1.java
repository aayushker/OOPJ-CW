package Week5;
interface FirstIface{
    int addMethod(int x, int y);
    float divMethod(float m, float n);
    void display();
    int N = 10;
    float PI = 3.14f;
}

class FirstImpl implements FirstIface{
    public int addMethod(int a, int b){
        return a + b;
    }
    public float divMethod(float i, float j){
        return i/j;
    }
    public void display(){
        System.out.println("N=" + N);
        System.out.println("PI=" + PI);
    }
}
interface FirstIface{
    int addMethod(int x, int y);
    float divMethod(float m, float n);
    void display();
    int N = 10;
    float PI = 3.14f;
}

class FirstImpl implements FirstIface{
    public int addMethod(int a, int b){
        return a + b;
    }
    public float divMethod(float i, float j){
        return i/j;
    }
    public void display(){
        System.out.println("N=" + N);
        System.out.println("PI=" + PI);
    }
}

public class Interface1{
    public static void main(String args[]){
        FirstImpl obj = new FirstImpl();
        System.out.println("Sum=" + obj.addMethod(10, 20));
        System.out.println("Division=" + obj.divMethod(10, 20));
        obj.display();
    }
}
public class Interface1{
    public static void main(String args[]){
        FirstImpl obj = new FirstImpl();
        System.out.println("Sum=" + obj.addMethod(10, 20));
        System.out.println("Division=" + obj.divMethod(10, 20));
        obj.display();
    }
}