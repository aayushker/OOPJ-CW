package Week5;
abstract class Figure{
        double dim1;
        double dim2;
        Figure(double x, double y){
            dim1 = x;
            dim2 = y;
        }
        abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double x, double y){
        super(x, y);
    }
    double area(){
        System.out.println("Area for rectangle is :");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double x, double y){
        super(x, y);
    }
    double area(){
        System.out.println("Area for triangle is :");
        return dim1 * dim2 / 2;
    }
}

class abstract1{
    public static void main(String args[]){
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure fig;
        fig = r;
        System.out.println("Area of rectangle is :" + fig.area());
        fig = t;
        System.out.println("Area of triangle is :" + fig.area());
    }
}
