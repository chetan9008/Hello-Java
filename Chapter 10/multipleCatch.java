public class multipleCatch {
    public static void main(String[] args) {
        try{
            int number = 2/0;
            System.out.println(number);
        }catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
        catch(NumberFormatException exception)
        {
            System.out.println(exception);
        }
        catch(ArithmeticException exception)
        {
            System.out.println(exception);
        }
        System.out.println("End of main");
    }
}
