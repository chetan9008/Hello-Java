public class redundancyCode {
    public static void main(String[] args) {
        try {
            int number = 2/0;
            System.out.println(number);
        }catch(ArithmeticException | NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
