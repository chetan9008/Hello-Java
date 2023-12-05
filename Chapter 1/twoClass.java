
class Area{
    float length;
    float breadth;
    void setData(float l,float b)
    {
        length = l;
        breadth = b;
    }
}

class twoClass {
    public static void main(String arg[])
    {
        Area rect = new Area();
        rect.setData(10, 20);
        float area = rect.length * rect.breadth;
        System.out.println("Area of ractangel is " + area);        
    }
}
