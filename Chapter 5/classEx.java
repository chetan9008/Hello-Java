class Rectange 
{
    int lenght;
    int breadth;
    void getData(int l,int b)
    {
        lenght = l;
        breadth = b;
    }
    int Area()
    {
        int result = lenght * breadth;
        return result;
    }
}

public class classEx {
    public static void main(String[] args) {
        Rectange r = new Rectange();
        r.getData(20,30);
        int area = r.Area();
        System.out.println("Area of rectangle is " + area);
        Rectange r1;
        r1 = new Rectange();
        r1.getData(10, 20);
        int result = r1.Area();
        System.out.println(result);
        Rectange r2 = r1;
        r2.getData(5, 4);
        System.out.println(r1.lenght);
    }
}
