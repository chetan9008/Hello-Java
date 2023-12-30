class A extends Thread {
    public void run() {
        System.out.println("Start of A Thread");
        for (int i = 1; i <= 5; i++) {
            try {
                if (i == 3) {
                    sleep(3000);
                }
                System.out.println("This is " + i + " count(A)");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("End of A Thread");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Start of B Thread");
        for (int i = 1; i <= 5; i++) {
            try{
                if(i==1)
                wait();

                if(i>3)
                notify();
            }
            catch(Exception e)
            {
                System.out.println("Error is " + e);
            }
            System.out.println("This is " + i + " count(B)");
        }
        System.out.println("End of B Thread");
    }
}

public class suspendThreadM {
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}
