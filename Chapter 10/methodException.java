class Divide{
    void divide() throws ArithmeticException
    {
        System.out.println(2/0);
    }
}
public class methodException {
    public static void main(String[] args) {
        try{
            new Divide().divide();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
