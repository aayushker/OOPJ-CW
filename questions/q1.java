package questions;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String(sc.nextLine());
        char gender = sc.next().charAt(0);
        int avgMarks = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + avgMarks);
        System.out.println("Gender: " + gender);
        System.out.println(avgMarks>80 ? "A+" : avgMarks>60 ?  "A": avgMarks>50 ? "B+" : "F");
    }
}
