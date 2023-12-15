import java.lang.Math;
class Circle
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    double Area()
    {
        double result = Math.PI * Math.pow(radius,2.0);
        return result;
    }
}

public class constructor {
    public static void main(String[] args) {
        Circle c = new Circle(3.1);
        double area = c.Area();
        System.out.println("Area of circle is " + (float)area);               
    }
}
