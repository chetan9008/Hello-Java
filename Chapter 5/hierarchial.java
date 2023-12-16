class Student {
    String name;

    Student(String n) {
        name = n;
    }
}

class FrontEnd extends Student {
    String occupation;

    FrontEnd(String n, String o) {
        super(n);
        occupation = o;
    }

    void display() {
        System.out.println("Name is " + name);
        System.out.println("Occupation is " + occupation);
    }
}

class BackEnd extends Student {
    String occup;

    BackEnd(String n, String o) {
        super(n);
        occup = o;
    }

    void display() {
        System.out.println("Name is " + name);
        System.out.println("Occupation is " + occup);
    }
}

public class hierarchial {
    public static void main(String[] args) {
        FrontEnd chetan = new FrontEnd("chetan", "Front End Developer");
        chetan.display();
        BackEnd ayush = new BackEnd("ayush pal", "Back End Developer");
        ayush.display();
    }
}
