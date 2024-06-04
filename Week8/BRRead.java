package Week8;
import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        String str;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit");
        do {
            str= br.readLine();
            // c = (char) br.read();
            // System.out.println(c);
            System.out.println(str);
        // }while(c != 'q');
        }while(!str.equals("q"));
    }    
}
