package Week8;
// Lamda expression to add two numbers
interface Add{
    int add(int a, int b);
}

public class LamAdd {
    public static void main(String[] args) {
        Add a1 = (a, b) -> {
            return a + b;
        };
        System.out.println(a1.add(10, 20));

        Add a2 = (a, b) -> {
            return a + b;
        };
        System.out.println(a2.add(100, 200));
    }
}
