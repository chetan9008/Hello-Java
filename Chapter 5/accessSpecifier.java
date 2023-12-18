class SuperClass {
    int v1 = 10;
    public int v2 = 20;
    private int v3 = 30;
    protected int v4 = 40;

    void display() {
        System.out.println(v1);
        System.out.println(v2);

        System.out.println(v3);

        System.out.println(v4);

    }
}

abstract class abstractclass {
    int x;
    int y;
    abstract void display();
    void displayAgain(int x,int y){}
}

class another extends abstractClass
{
    void display()
    {
        System.out.println("This is another class");
    }
    void displayAgain()
    {
        System.out.println("This is another class again");
    }
}


class accessSpecifier {
    public static void main(String[] args) {
        SuperClass ex = new SuperClass();
        ex.display();
        System.out.println(ex.v1);
        System.out.println(ex.v2);
        // System.out.println(ex.v3);
        System.out.println(ex.v4);

        another a = new another();
        a.display();
        a.displayAgain();
    }
}