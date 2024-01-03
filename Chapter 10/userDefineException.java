import java.lang.Exception;
import java.util.Scanner;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class userDefineException {
    public static void main(String[] args) {
        try {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        if(number < 10)
        throw new MyException("Number is small");
        }catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("All good");
        }
    }
}
