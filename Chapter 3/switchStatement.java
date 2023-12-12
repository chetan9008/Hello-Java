import java.util.Scanner;

class example {
    void switchExample1() {
        String satus = new String();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the command : ");
        switch (satus = scan.nextLine()) {
            case "compile:sass":
                System.out.println("Compiling Sass");
                break;
            case "compile:typescript":
                System.out.println("Compiling typescript");
                break;
            case "compile:bootstrap":
                System.out.println("Compiling Bootstrap");
                break;
        }

    }
}

public class switchStatement {
    public static void main(String[] args) {

        example ex = new example();
        ex.switchExample1();

        try (Scanner scan = new Scanner(System.in)) {
            int a = (scan.nextInt());
            switch (a) {
                case 1:
                    System.out.println("It is 1st");
                    break;
                case 2:
                    System.out.println("It is 2nd");
                    break;
                case 3:
                    System.out.println("It is 3rd");
                    break;
                default:
                    System.out.println("Enter b/w 1 to 3 !");

            }
        }
    }
}
