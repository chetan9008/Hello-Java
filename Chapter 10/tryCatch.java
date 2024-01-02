public class tryCatch {
    public static void main(String[] args) {
        try {
            int value = 2 / 0;
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        numberFormat();
        Boundary();
    }

    public static void numberFormat()
    {
        try {
        String name = "22";
        int num = Integer.parseInt(name);
        System.out.println(num);
        }catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
    public static void Boundary()
    {
        try {
            int array[] = {1,2,3};
            System.out.println("Array element is " + array[3]);
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
    }
}
