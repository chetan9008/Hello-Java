class BasicMath {
    static int x, y;

    static int Multiply(int a,int b) {
        x = a;
        y = b;
        return x*y;
    }
    static void display(int a,int b)
    {
        System.out.println("Multiplication is " + Multiply(a, b));
    }
}

public class staticVariable {
    public static void main(String[] args) {
        BasicMath.display(2,4);
    }
}
