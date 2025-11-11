
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
public class Implementing_Interfaces{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: " + c.perimeter());
    }
}
