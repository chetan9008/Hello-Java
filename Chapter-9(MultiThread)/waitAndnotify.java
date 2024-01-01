class Circle {
    float radius = 0.0f;

    synchronized void output() {
        System.out.println("In output function");
        if (radius == 0) {
            System.out.println("Waiting for input");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println("Area of circle is " + Math.PI * Math.pow(radius, 2.0));
    }

    synchronized void input(float r) {
        radius = r;
        notify();
    }
}
public class waitAndnotify {
    public static void main(String[] args) {
        Circle c = new Circle();
        new Thread(){
            public void run()
            {
                c.output();
            }
        }.start();
        new Thread(){
            public void run()
            {
                c.input(3.2f);
            }
        }.start();
    }
}
