class ClassBox {
    float width, hieght, depth;
    ClassBox(float width,float hieght,float depth)
    {
        this.width = width;
        this.hieght = hieght;
        this.depth = depth;
    }

    void dislay()
    {
        System.out.println("Width is " + width);
        System.out.println("Hieght is " + hieght);
        System.out.println("Depth is " + depth);
    }
}
public class practise {
    public static void main(String[] args) {
        new ClassBox(2.1f, 3.2f, 4.4f).dislay();
    }
}
