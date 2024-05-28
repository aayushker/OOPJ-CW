package questions;
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            // for (int j=0; j<i; j++){
            //     System.out.print("*");
            // }
            // System.out.print("\n");
            System.out.println("* ".repeat(i));
        }
        for (int i = n-1; i>= 1; i--){
            System.out.println("* ".repeat(i));
        }
    }
}
