import java.util.Scanner;
class constants {
    public static void main(String arg[])
    {
        int tenThousand = 10_000;
        System.out.println(tenThousand);
        int octal = 001;
        System.out.println(octal);
        int hexa = 0x11;
        System.out.println(hexa);
        int binary = 0b111;
        System.out.println(binary);
        double floatNumber = 2.2;
        System.out.println(floatNumber);

        //Integer Data type

        byte small = 30;
        System.out.println(small);
        short littleSmall = 300;
        System.out.println(littleSmall);
        long longVar = 123l;
        System.out.println(longVar);

        //Floating Data type

        float decimal = 2.1225555589f;
        System.out.println(decimal);
        double floatingValue = 2.12255555892;
        System.out.println(floatingValue);

        // character or boolean

        char ch = 'c';
        System.out.println(ch);
        boolean value = true;
        System.out.println(value);


        //reading from key board
            
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int integer = scan.nextInt();
        // System.out.println(integer);
        // double valueFloat = scan.nextDouble();
        // System.out.println(valueFloat);
        // float valueFloat1 = scan.nextFloat();
        // System.out.println(valueFloat1); 
        System.out.println("enter the string"); 
        String stringValue = scan.nextLine();
        System.out.println("string is " + stringValue); 
    }
}