package Chapter_8_Package;

import Chapter_8_Package.first;

class Teacher {
    String name = "Mukta Sharma";
    void show()
    {
        System.out.println("Teacher is " + name);
    }
}
public class second {
    public static void main(String[] args) {
        System.out.println("This is second class");
        Student ex = new Student();
        ex.display();
    }
}
