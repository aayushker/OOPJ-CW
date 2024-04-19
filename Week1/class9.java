class staticDemo{
    static int a =0;
    private int b;
    public void set(int i, int j){
        a=i;
        b=j;
    }
    public void show(){
        System.out.println("This is static a:" +a );
        System.out.println("This is non-static b:" +b );
    }
}

public class class9 {
    public static void main(String[] args) {
        staticDemo s1 = new staticDemo();
        staticDemo s2 = new staticDemo();
        s1.set(1, 2);
        s1.show();
        s2.set(3, 4);
        s2.show();
    }
}
