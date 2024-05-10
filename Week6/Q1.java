package Week6;
// import java.io.*;
// class Super{
//     void m1() throws FileNotFoundException{
//         FileInputStream fx = new FileInputStream("Super.txt");
//     }
// }

// class Sub extends Super{
//     void m1() throws IOException {
//         FileInputStream fx = new FileInputStream("Sub.txt");
//     }
// }

// after interchanging the exceptions we get no errors

import java.io.*;
class Super{
    void m1() throws IOException{
        FileInputStream fx = new FileInputStream("Super.txt");
    }
}

class Sub extends Super{
    void m1() throws  FileNotFoundException{
        FileInputStream fx = new FileInputStream("Sub.txt");
    }
}
