import java.lang.Thread;

class A extends Thread {
    public void run() {
        System.out.println("A id : " + currentThread().getId());
        System.out.println("A priority is " + currentThread().getPriority());
    }
}

class B extends Thread {
    public void run() {
        System.out.println("B id : " + currentThread().getId());
        System.out.println("B priority is " + currentThread().getPriority());
    }
}

class C extends Thread {
    public void run() {
        System.out.println("C id : " + currentThread().getId());
        System.out.println("C priority is " + currentThread().getPriority());
    }
}

public class getId {
    public static void main(String[] args) {
        A ThreadA = new A();
        B ThreadB = new B();
        C ThreadC = new C();
        ThreadA.setPriority(Thread.MAX_PRIORITY);
        ThreadB.setPriority(Thread.NORM_PRIORITY);
        ThreadC.setPriority(Thread.MIN_PRIORITY);

        ThreadA.start();
        ThreadB.start();
        ThreadC.start();
    }
}
