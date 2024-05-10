import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = 0;
        try {
            n = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer for the number of elements.");
            scanner.close();
            return; 
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            try {
                arr[i] = scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter valid integers for the array elements.");
                scanner.close();
                return;
            }
        }

        System.out.println("Enter the index of the array element you want to access");
        try {
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds! Please enter a valid index within the range of the array.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer for the index.");
        }

        scanner.close();
    }
}
