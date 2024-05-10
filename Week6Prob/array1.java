import Week6Prob.*;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner src = new Scanner(System.in);
        int size = src.nextInt();
        System.out.println("enter the elements in the array");

        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = src.nextInt();
        }
        System.out.println("enter the index whose value you want to print");
        int pos = src.nextInt();
        if (pos <= size) {
            System.out.println("the value at the position is" + numbers[pos]);
        } else if (pos > size) {
            System.out.println("Index out of bound exception is there");
        }
    }

}