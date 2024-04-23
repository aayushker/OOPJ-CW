package Week4;
public class String1 {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");
        
        // if (s3 == s4){
        //     System.out.println("s1 and s2 are equal");
        // } else {
        //     System.out.println("s1 and s2 are not equal");
        // }

        // if (s3.equals(s4)){
        //     System.out.println("s1 and s2 are equal");
        // } else {
        //     System.out.println("s1 and s2 are not equal");
        // } 
        
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");


        if (sb1 == sb2){
            System.out.println("sb1 and sb2 are equal");
        } else {
            System.out.println("sb1 and sb2 are not equal");
        }

        if (sb1.equals(sb2)){
            System.out.println("sb1 and sb2 are equal");
        } else {
            System.out.println("sb1 and sb2 are not equal");
        }
    }
}
