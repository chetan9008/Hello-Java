interface Parent1 {
    int value = 2;

    void display();
}

interface Parent2 {
    void display();
}


class Base implements Parent1, Parent2 {
    int var1, var2;

    Base(int x, int y) {
        var1 = x;
        var2 = y;
    }

    public void display() {
        System.out.println("Value is " + value);
        System.out.println("This is Base display");
    }

    void showVariable() {
        System.out.println("First variable is " + var1);
        System.out.println("Second variable is " + var2);
    }

    // public void show() {
    //     System.out.println("This is Base show");
    // }
}

public class interfaceImp {
    public static void main(String[] args) {
        Base cLaSS = new Base(2, 3);
        cLaSS.display();
        // cLaSS.show();
        Parent1 par1 = cLaSS;
        par1.display();
        cLaSS.showVariable();
    }
}
