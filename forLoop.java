import java.lang.Math;
public class forLoop {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            double n = i;
            System.out.print("power of 2^"+(int)n+" : ");
            System.out.println((int)(Math.pow(2.0,n))
            );
        }
    }
}   
