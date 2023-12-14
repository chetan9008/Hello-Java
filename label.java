public class label {
    public static void main(String[] args) {
        outerloop: for (int i = 10; i < 20; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(j);
                if (j == 9)
                    break outerloop;
            }
        }

        String array[] = { "chetan", "gaurav", "keshav", "aman", "aditya", "bhavna" };

        loop: for (String name : array) {
            System.out.println("Name is " + name);
            if (name == "bhavna") {
                System.out.println("You are my love");
                break loop;
            }
        }

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
