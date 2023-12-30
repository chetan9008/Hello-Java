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

public class sleepThreadM {
    public static void main(String[] args) {
        new A().start();
        System.out.println("End of main Thread");
    }
}
