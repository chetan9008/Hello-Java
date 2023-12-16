class SuperClass {
    int first;

    SuperClass(int x) {
        first = x;
    }
}

class SubClass extends SuperClass {
    int second;

    SubClass(int x, int y) {
        super(x);
        second = y;
    }
}

class DerivedFromSubClass extends SubClass {
    int third;

    DerivedFromSubClass(int x, int y, int z) {
        super(x, y);
        third = z;
    }

    void display() {
        System.out.println("First variable is " + first);
        System.out.println("Second variable is " + second);
        System.out.println("Third variable is " + third);

    }
}

public class multiLevel {
    public static void main(String[] args) {
        DerivedFromSubClass example = new DerivedFromSubClass(1, 2, 3);
        example.display();
    }
}
