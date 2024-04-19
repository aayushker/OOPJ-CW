package Week2;

class Point {
    private int x; // x coordinate of the point
    private int y; // y coordinate of the point

    public void setX(int x) {
        x = (x > 79 ? 79 : (x < 0 ? 0 : x)); //if we use this.x = x; then it will work fine
    }
    public void setY (int y) {
        y=(y > 24?24 : (y <0?0  :y)); //if we use this.y = y; then it will work fine
    }
    public int getX() {
        return x;
    }
    public int getY() { 
        return y;
    }
}

public class ClassDeclarationfrPoint {
    public static void main(String args[]){
        int a, b;
        Point pl = new Point(); // Create a new Point object
        pl.setX(22); 
        pl.setY(44); 
        a = pl.getX(); 
        System.out.println("The value of a is "+a);
        b = pl.getY();
        System.out.println("The value of b is "+b);       
        }
}

// Output: The value of a is 0
// The value of b is 0

// Explanation: The output is 0 because the setX and setY methods are not setting the values of x and y.
// The setX and setY methods are setting the values of x and y to 79 and 24, respectively.
// However, the getX and getY methods are returning the values of x and y as 0.
// This is because the setX and setY methods are not setting the values of x and y to the input values.
// To fix this issue, the setX and setY methods should be updated to set the values of x and y to the input values.
