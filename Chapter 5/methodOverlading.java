public class methodOverlading {
    public static void main(String[] args) {
        area(2,3);
        area(2);
        area();
    }
    public static void area(int x,int y)
    {
        System.out.println("Area of rectangle is " + x*y);
    }
    public static void area(int x)
    {
        System.out.println("Area of Square is " + x * x);
    }
    public static void area()
    {
        System.out.println("Area is " + 0);
    }
}
