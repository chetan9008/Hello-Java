import java.util.Scanner;
public class wrapperClass {
    public static void main(String arg[])
    {
        try (Scanner scan = new Scanner(System.in)) {
            int number = scan.nextInt();
            System.out.println(number);
            Integer num =22;
            System.out.println(num);
            Float f = 22.2f;
            System.out.println(f);
        }
    }
}
