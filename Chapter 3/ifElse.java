import java.lang.Math;

class random {
    double randomNumber() {
        double ran = (Math.random() * (90 - 50)) + 50;
        return ran;
    }

    void Nestedif() {
        int a = 325, b = 712, c = 478;

        if (a > b) {
            if (a > c)
                System.out.println("a(" + a + ")" + " is gretest");
            else
                System.out.println("c(" + c + ")" + " is gretest");
        } else {
            if (b > c)
                System.out.println("b(" + b + ")" + " is gretest");
            else
                System.out.println("c(" + c + ")" + " is gretest");

        }
    }
}

public class ifElse {
    public static void main(String arg[]) {
        random var = new random();
        for (int i = 0; i < 5; i++) {
            double Weight = var.randomNumber();
            if (Weight >= 70 && Weight <= 80)
                System.out.println((int) Weight + " Weight is maintained");
            else
                System.out.println((int) Weight + " Weight is not maintained");

        }

        int array[] = { 1, 2, 3, 4, 5 };
        int even = 0, odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("No of even is " + even);
        System.out.println("No of odd is " + odd);

        var.Nestedif();
    }
}
