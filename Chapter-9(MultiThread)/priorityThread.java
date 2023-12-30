class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
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

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is " + i + " count of (C)");
        }
    }
}

public class priorityThread {
    public static void main(String[] args) {
        A first = new A();
        B second = new B();
        C third = new C();
        third.setPriority(1);
        second.setPriority(2);
        first.setPriority(3);

        first.start();
        second.start();
        third.start();

    }
}
