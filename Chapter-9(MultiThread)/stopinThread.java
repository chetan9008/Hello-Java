@Deprecated
class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is A thread");
            if (i == 5) {
                this.stop();
            }
        }
    }
}

public class stopinThread {
    public static void main(String[] args) {
        new A().start();
    }
}
