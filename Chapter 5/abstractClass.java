abstract class abs {
    abstract void display();
    void show()
    {
        System.out.println("This is abstract class");
    }
}
class SubClass extends abs
{
    int first,second;
    SubClass(int x,int y)
    {
        first  = x;
        second = y;
    }
    void display()
    {
        System.out.println("This is Subclass extends from abstract class ");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        SubClass ex = new SubClass(20, 30);
        ex.display();  
        
        abs a = ex;
        a.show();
    }
}
