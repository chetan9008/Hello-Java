class perimeter 
{
    int length,breadth;
    perimeter()
    {
        length = 1;
        breadth = 1;
    }
    perimeter(int l,int b)
    {
        length = l;
        breadth = b;
    }
    void PrintArea()
    {
        System.out.println("Perimeter of rectangle is " + 2 * (this.length + this.breadth));
    }
}
public class defaultConstructor {
    public static void main(String[] args) {
        perimeter p = new perimeter();
        p.PrintArea();
        perimeter p1 = new perimeter(2,4);
        p1.PrintArea();
    }    
}
