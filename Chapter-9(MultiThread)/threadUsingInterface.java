class X implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("X thread value : " + (i + 1));
        }
    }
}

class Y implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Y thread value : " + (i + 1));
        }
    }
}

public class threadUsingInterface {
    public static void main(String[] args) {
        X runnableX = new X();
        Y runnableY = new Y();

        Thread threadX = new Thread(runnableX);
        Thread threadY = new Thread(runnableY);
        threadX.setPriority(Thread.MAX_PRIORITY);
        threadX.start();
        threadY.start();
    }
}
