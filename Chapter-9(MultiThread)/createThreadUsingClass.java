import java.lang.Thread;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++)
            System.out.println("This is A thread");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++)
            System.out.println("This is B thread");
    }
}

class C extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++)
            System.out.println("This is C thread");
    }
}

public class createThreadUsingClass {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
