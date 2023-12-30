class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 2)
                Thread.yield();
            System.out.println("This is " + i + " count of (A)");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is " + i + " count of (B)");
        }
    }
}

public class yieldThreadM {
    public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}
