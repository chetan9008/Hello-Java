class Traingle {
    synchronized void display(char ch) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class A extends Thread {
    Traingle t;

    A(Traingle t) {
        this.t = t;
    }

    public void run() {
        t.display('*');
    }
}

class B extends Thread {
    Traingle t;

    B(Traingle t) {
        this.t = t;
    }

    public void run() {
        t.display((char) 94);
    }
}

public class synchronization {
    public static void main(String[] args) {
        Traingle t = new Traingle();
        A threadA = new A(t);
        B threadB = new B(t);
        threadA.start();
        threadB.start();
    }
}
