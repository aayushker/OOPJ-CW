package Week5;
// package Week5;
// package test;

class foundation{
    private int var1;
    int var2;
    protected int var3;
    public int var4;
    public foundation(){
        var1 = 1;
        var2 = 2;
        var3 = 3;
        var4 = 4;
    }
}

public class Question1 extends foundation{
    public Question1(){
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
    public static void main(String[] args) {
        Question1 q = new Question1();
    }
}